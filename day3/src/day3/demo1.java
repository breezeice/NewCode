/**
 * 
 */
package day3;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
* @Description：实现一个课程名称和课程代号的转换器：输入下表中的课程代号，输出课程的名称。用户可以循环进行输入，如果输入0就退出系统。（**使用switch +do-while循环实现**）

**课程名称和课程代号对照表**	

| **课程名称**                 | **课程代码** |
| ---------------------------- | ------------ |
| 使用Java语言理解程序逻辑     | **1**        |
| 使用HTML语言开发商业站点     | **2**        |
| 使用SQL Server管理和查询数据 | **3**        |
| 使用C#开发数据库应用程序     | **4**        |
* @author 魏蓓蓓
* @version
* @Date 2020年6月24日下午2:23:15
*
*/
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input;
		do
		{
			System.out.println("**课程名称和课程代号对照表**	\r\n" + 
					"\r\n" + 
					"| **课程名称**                 | **课程代码** |\r\n" + 
					"| ---------------------------- | ------------ |\r\n" + 
					"| 使用Java语言理解程序逻辑     | **1**        |\r\n" + 
					"| 使用HTML语言开发商业站点     | **2**        |\r\n" + 
					"| 使用SQL Server管理和查询数据 | **3**        |\r\n" + 
					"| 使用C#开发数据库应用程序     | **4**        |");
			input=sc.nextInt();
			switch(input)
			{
			case 1:
				System.out.println("使用Java语言理解程序逻辑");
				break;
			case 2:
				System.out.println("使用HTML语言开发商业站点");
				break;
			case 3:
				System.out.println("使用SQL Server管理和查询数据");
				break;
			case 4:
				System.out.println("使用C#开发数据库应用程序");
				break;
			default:
				System.out.println("输入错误，请重新输入");
				break;
			}
		}
		while(input!=0);
	}

}
