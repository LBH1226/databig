package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04selectAll {

	public static void main(String[] args) {

		// ====전체 회원 조회====
		// id 이름 나이 점수

		
		
		Connection conn = null;
	      ResultSet rs = null;
	      PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from JDBCTEST.BIGDATAMEMBER";

			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			
			System.out.println("========전체 회원 조회========");
			System.out.println("id"+"\t"+"이름"+"\t"+"나이"+"\t"+"점수");
			while (rs.next() == true) {
	            // 로그인에 성공
				
				
	            String name = rs.getString("b_name");
	            int age = rs.getInt("age");
	            String id = rs.getString("id");
	            int score = rs.getInt("score");      
	            System.out.println(id+"\t"+name+"\t"+age+"\t"+score);
	         
	         }

		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			// DB 연결 종료
			try{
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}

	}
	}
}
