package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2022/01/13
 * �̸� : ����ȣ
 * ���� : �ڹ� JDBC Update �ǽ��ϱ� ���� p557
 */
public class Sub3_UpdateTest {
	public static void main(String[] args) {
		
		// DB����
		final String HOST = "jdbc:mysql://54.180.160.240:3306/rkdxogh1987";
		final String USER = "rkdxogh1987";
		final String PASS = "1234";
				
		try {
			// 1�ܰ� ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3�ܰ� ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� SQL ����
			String sql = "UPDATE `User1` SET `age` = `age` + 1 WHERE `uid` = 'P101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"���� �����Ͱ� ���� �Ǿ����ϴ�.");
			
			// 6�ܰ� �����ͺ��̽� ����
			conn.close();
					
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("������Ʈ �Ϸ�...");
	}

}
