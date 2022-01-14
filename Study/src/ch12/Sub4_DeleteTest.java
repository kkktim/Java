package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
/*
 * 날짜 : 2022/01/13
 * 이름 : 강태호
 * 내용 : 자바 JDBC Delete 실습하기 교재 p557
 */
public class Sub4_DeleteTest {
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:mysql://54.180.160.240:3306/rkdxogh1987";
		final String USER = "rkdxogh1987";
		final String PASS = "1234";
		
		try {
			// 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "DELETE FROM `User1` WHERE `uid` = 'P101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"개의 데이터가 삭제 되었습니다.");
			// 데이터베이스 종료
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
		
	}

}
