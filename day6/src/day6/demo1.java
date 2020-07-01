package day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
* @Description
* JDBC:加连预执释
* 1、加载驱动
* 2、 获取链接（java连接mysql数据库）
* 3、预执行（准备好sql语句）
* 4、执行
* 5、释放资源（关闭预执行，关闭连接）
* @author 魏蓓蓓
* @version
* @Date 2020年6月30日下午6:35:22
*
*/
public class demo1 
{

	public static void main(String[] args) 
	{
		try 
		{
			// 1、加载驱动（mysql-java驱动）
			Class.forName("com.mysql.jdbc.Driver");
			//2、 获取链接（java连接mysql数据库）
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dvd","root","");
			if(conn!=null) System.out.println("连接成功");
			else System.out.println("连接失败");
			//预执行（准备好sql语句）
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入书名");
			String name=sc.next();
			System.out.println("请输入出版社");
			String publish=sc.next();
			PreparedStatement pr = conn.prepareStatement("insert into book values(null,?,?,null,null,0)");
			pr.setString(1, name);
			pr.setString(2, publish);
			//执行
			int row = pr.executeUpdate();
			if(row==1) System.out.println("新增成功");
			else System.out.println("新增失败");
			//释放资源
			pr.close();
			conn.close();
			sc.close();
		}
			
		 catch (Exception e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
