
package Dao;

import java.util.ArrayList;
import java.util.List;

import jdbc.JDBCUtil;

/**
 * @Description
 * @author 第六组
 * @version
 * @Date 2020年7月3日下午13:42:21
 *
 */
public class UserDao 
{
	//登录功能。参数：用户名和密码，返回值：查询的二维数组
	public List<List<Object>> login(String userName,String passWord)
	{
		JDBCUtil jdbc = new JDBCUtil();
		List<Object> list=new ArrayList<Object>();
		list.add(userName);
		list.add(passWord);
		List<List<Object>> query = jdbc.query("select * from users where username=? and password=?", list);
		return query;
	}

}
