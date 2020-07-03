
package view;

import java.util.List;
import java.util.Scanner;

import Dao.UserDao;

/**
 * @Description
 * @author 第六组
 * @version
 * @Date 2020年7月3日下午13:43:21
 *
 */
public class UserView 
{
	public void beginMenu() 
	{
		System.out.println("********欢迎进入DVD管理系统*******");
		System.out.println("请输入登录用户名：");
		Scanner sc = new Scanner(System.in);
		String userName=sc.next();
		System.out.println("请输入登录密码：");
		String passWord=sc.next();
		
		//登录功能：select
		List<List<Object>> login = new UserDao().login(userName,passWord);
		if(login==null||login.size()==0) 
		{
			System.out.println("登录失败");
		}
		else 
		{
			System.out.println("登录成功！");
			//获取登录者的角色，从第一行第四列中获取
			if((long)(login.get(0).get(3))==1) 
			{
				//管理员登录
				new DVDView().manageMenu();
			}
			else 
			{
				//普通用户登录
				new DVDView().commonMenu();
			}
		}
	}

}
