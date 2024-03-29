package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex06Member {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 빅데이터 회원관리 프로그램 ====");
		
		
		while(true){
		System.out.print("[1]회원가입 [2]로그인 [3]회원삭제 [4]회원정보조회 [5]회원정보수정 >> ");
		int input = sc.nextInt();
		
		if(input==1) {

			System.out.println("=== 회원가입 ===");
			System.out.print("ID 입력 : ");
			String id = sc.next();
			System.out.print("pw 입력 : ");
			String pw = sc.next();
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			System.out.print("점수 입력 : ");
			int score = sc.nextInt();
			
			
			PreparedStatement psmt = null;
			Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost/jdbctest";
				String user = "root";
				String password = "12345";
				
				conn = DriverManager.getConnection(url, user, password);
				
				if(conn!= null) {
					System.out.println("연결성공");
				}else {
					System.out.println("연결 실패");
				}
				
				String sql = "insert into JDBCTEST.BIGDATAMEMBER values (?,?,?,?,?)";
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, name);
				psmt.setInt(4, age);
				psmt.setInt(5, score);
				
				int row = psmt.executeUpdate();
				
				if(row>0) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("회원가입 실패");
				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
					try {
						if(psmt != null) 
						psmt.close();
						if(conn != null)
					    conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			
			
		}else if(input==2) {

			
			System.out.println("ID 입력 : ");
			String id = sc.next();
			System.out.println("비밀번호 입력 : ");
			String pw = sc.next();
			
			Connection conn = null;
		      ResultSet rs = null;
		      PreparedStatement psmt = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost/jdbctest";
				String user = "root";
				String password = "12345";
				
				conn = DriverManager.getConnection(url, user, password);
				
				if(conn != null) {
					System.out.println("DB 연결 성공");
				}else {
					System.out.println("DB 연결 실패");
				}
				
				String sql = "select * from JDBCTEST.BIGDATAMEMBER where ID= ? and PW = ?";
				
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, id);
				psmt.setString(2, pw);
				
				rs = psmt.executeQuery();
				if (rs.next() == true) {
		            String name = rs.getString("b_name");
		            int age = rs.getInt("age");
		            System.out.println(name + "(" + age + ") 님 환영합니다.");
		         } else {
		            System.out.println("로그인에 실패했습니다.");
		            System.out.println("아이디와 비밀번호를 확인해주세요.");
		         }
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
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
			
		
			
		}else if(input==3) {

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
					if(psmt != null) 
					psmt.close();
					if(conn != null)
				    conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			
		
			
		}else if(input==4) {

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
					
					
		            String name = rs.getString("b_name");
		            int age = rs.getInt("age");
		            String id = rs.getString("id");
		            int score = rs.getInt("score");      
		            System.out.println(id+"\t"+name+"\t"+age+"\t"+score);
		         
		         }

			} catch (Exception e) {

				e.printStackTrace();
			}finally {
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
		
			
		}else if(input==5) {

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

		
			
		}else {
			
			break;
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
