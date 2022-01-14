package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
/*
 * ��¥ : 2022/01/13
 * �̸� : ����ȣ
 * ���� : �ڹ� JDBC Delete �ǽ��ϱ� ���� p557
 */
public class Sub4_DeleteTest {
	public static void main(String[] args) {
		
		// DB����
		final String HOST = "jdbc:mysql://54.180.160.240:3306/rkdxogh1987";
		final String USER = "rkdxogh1987";
		final String PASS = "1234";
		
		try {
			// ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// SQL ����
			String sql = "DELETE FROM `User1` WHERE `uid` = 'P101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"���� �����Ͱ� ���� �Ǿ����ϴ�.");
			// �����ͺ��̽� ����
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete �Ϸ�...");
		
	}

}
