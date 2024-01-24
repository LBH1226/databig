package questionpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;




public class QuestionDAO {
	private PreparedStatement psmt = null;
	private Connection conn = null;
	private ResultSet rs = null;
	
	private void getConn() { // 연결 메소드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/userdata";
			String user = "root";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void getClose() { // 자원 반납 메소드
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int join(QuestionDTO dto) {// 회원가입 메소드
		int row = 0;

		try {
			getConn();

			String sql = "INSERT INTO userdata.userdata (id, pw, user_name) values(?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			
			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}
	
	public QuestionDTO login(String id, String pw) {// 로그인 메소드
		QuestionDTO dto = null;

		try {
			getConn();

			String sql = "select * from userdata.userdata inner join userdata.score on userdata.user_num = score.user_num where id = ? and pw=? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {

				String user_name = rs.getString("user_name");
				String grade = rs.getString("grade");
				int best_score = rs.getInt("best_score");
				
				// rs에 있는 데이터 DTO에 옮기기
//				dto = new MemberDTO(null, null, name, age, 0);
				dto = new QuestionDTO(user_name, grade, best_score);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return dto;

	}
	
	public ArrayList<QuestionDTO> serch() {// 랭킹 조회 메소드
		ArrayList<QuestionDTO> fkarr = new ArrayList<QuestionDTO>();
		try {
			getConn();

			String sql = "select * from userdata.score inner join userdata.userdata on score.user_num = userdata.user_num order by best_score desc;";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("user_name");
				String grade = rs.getString("grade");
				int best_score = rs.getInt("best_score");
				
				// 조회 결과(rs)에 있는 데이터 DTO로 옮겨담기
				QuestionDTO dto = new QuestionDTO(name, grade, best_score);
//				MemberDTO dto = new MemberDTO(id, pw, name, age, score);

				fkarr.add(dto);

			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return fkarr;
	}
	
	
	
	
	
	public void best() { // 현재 점수와 베스트 스코어 점수를 비교해서 더 높은값을 리턴
		
		
	}
	
	
	public ArrayList<QuestionDTO> questionData(int qNum) { // db의 질문,답,num값을 리턴하는 메소드
	
		ArrayList<QuestionDTO> questionDa  = new ArrayList<QuestionDTO>();
		
		try {
			getConn();

			String sql = "select q.question, q.answer, q.question_score from userdata.question q where q.qeustion_num = ?;";

			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qNum );

			rs = psmt.executeQuery();

			while (rs.next()) {
				String question  = rs.getString("question");
				String answer = rs.getString("answer");
				int score = rs.getInt("score");
				
				QuestionDTO dto = new QuestionDTO(question, answer, score);

				questionDa.add(dto);

			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return questionDa;
		
	}
	
	
	
	
	
}
