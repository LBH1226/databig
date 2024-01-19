package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {

		// 회원 탈퇴
		// 1. 사용자에게 id, pw 입력
		
		// 2. 회원탈퇴에 성공 -> 회원탈퇴 성공
		//    회원탈퇴에 실패 -> 회원탈퇴 실패
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 회원가입 ===");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("pw 입력 : ");
		String pw = sc.next();
		
		PreparedStatement psmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from JDBCTEST.BIGDATAMEMBER where ID= ? and PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			int row = psmt.executeUpdate();
			
			if(row>0) {
				System.out.println("회원탈퇴 성공");
			}else {
				System.out.println("회원탈퇴 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// **자원을 반납할 때는 항상 사용한 순서의 역순으로 반납한다**
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
