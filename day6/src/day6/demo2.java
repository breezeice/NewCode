package day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
* @Description
* @author 魏蓓蓓
* @version
* @Date 2020年6月30日下午8:03:22
*
*/
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dvd","root","");
			if(conn!=null) System.out.println("连接成功");
			else System.out.println("连接失败");
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入编号");
			int id=sc.nextInt();
			PreparedStatement pr = conn.prepareStatement("delete from book where id=?");
			pr.setInt(1,id);
			int row=pr.executeUpdate();
			if(row==1) System.out.println("删除成功");
			else System.out.println("删除失败");
			pr.close();
			conn.close();
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
