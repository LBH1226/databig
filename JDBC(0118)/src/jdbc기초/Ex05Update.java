package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05Update {

	public static void main(String[] args) {

		// id, pw, 수정할 점수
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원 정보 수정=====");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("수정할 점수 입력 : ");
		int nScore = sc.nextInt();

		
		
		
		PreparedStatement psmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE JDBCTEST.BIGDATAMEMBER set score=? where ID=?  and PW =? ";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, nScore);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			
			int row = psmt.executeUpdate();
			
			
			if(row>0) {
				System.out.println("점수변경 성공");
			}else {
				System.out.println("점수변경 실패");
			}

		} catch (Exception e) {
			

			e.printStackTrace();
		}finally {
			
				try {
					
					if(psmt != null) 
					psmt.close();
					if(conn != null)
				    conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

	}

}
