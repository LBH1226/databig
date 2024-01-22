package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB 연결해서 insert, delete, update, select 하는 코드들의 모음
	// 메소드 형태로 코드 작성

	// 필드
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement psmt = null;

	// 공통으로 사용할 메소드
	// 1.데이터베이스 연결하는 메소드
	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 2.사용한 자원을 반납하는 메소드
	private void getClose( ) {

		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	
	
	

	// 회원가입 메소드
	public int join(MemberDTO dto) {

		int row = 0;
		try {
			getConn();

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결 실패");
			}

			String sql = "insert into JDBCTEST.BIGDATAMEMBER values (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;
	}

	/////////////////////// 회원가입 끝/////////////////////////////////

	// 로그인 메소드
	public MemberDTO login(String id, String pw) {

		MemberDTO dto = null;

		try {
			getConn();
			
//			if (conn != null) {
//				System.out.println("DB 연결 성공");
//			} else {
//				System.out.println("DB 연결 실패");
//			}

			String sql = "select * from JDBCTEST.BIGDATAMEMBER where ID= ? and PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			if (rs.next() == true) {

				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				// rs에 있는 데이터 DTO에 옮기기
				dto = new MemberDTO(null, null, name, age, 0);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return dto;

	}

	/////////////////////// 로그인 끝//////////////////////////////////

	// 회원 탈퇴 메소드
	public int delete(String id, String pw) {

		int row = 0;
		try {
			getConn();

			String sql = "delete from JDBCTEST.BIGDATAMEMBER where ID= ? and PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;
	}

	///////////////////////////// 회원탈퇴 끝///////////////////////////////

	// 회원 정보 조회
	public ArrayList<MemberDTO> seletAll() {

		MemberDTO dto = null;

		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		try {
			getConn();

			String sql = "select * from JDBCTEST.BIGDATAMEMBER";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next() == true) {
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				String id = rs.getString("id");
				int score = rs.getInt("score");

				dto = new MemberDTO(id, null, name, age, score);
				list.add(dto);

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			getClose();

		}

		return list;

	}
	/////////////////////// 회원정보조회 끝/////////////////////////////

	// 회원 정보 수정
	public int change(int nScore, String id, String pw) {

		int row = 0;
		try {
			getConn();

			String sql = "UPDATE JDBCTEST.BIGDATAMEMBER set score=? where ID=?  and PW =? ";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, nScore);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}

}
