
package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
* @Description:整数的增删改查
1、新增整数
2、删除整数
3、修改整数
4、显示所有整数
5、排行榜
0、退出系统
请输入；【0-5】
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午8:43:59
*
*/
public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input;
		List list=new ArrayList();
		list.add(24);
		list.add(104);
		list.add(52);
		do
		{
			System.out.println("整数的增删改查\r\n" + 
					"1、新增整数\r\n" + 
					"2、删除整数\r\n" + 
					"3、修改整数\r\n" + 
					"4、显示所有整数\r\n" + 
					"5、排行榜\r\n" + 
					"0、退出系统\r\n" + 
					"请输入；【0-5】");
			input=sc.nextInt();
			switch(input)
			{
			case 1:
				System.out.println("请输入您要添加的整数：");
				int a;
				a=sc.nextInt();
				list.add(a);
				break;
			case 2:
				System.out.println("请输入您要删除的整数：");
				int b;
				b=sc.nextInt();
				list.remove(new Integer(b));
				break;
			case 3:
				System.out.println("请输入您想修改的数字：");
				int c=sc.nextInt();
				if(list.contains(c))
				{
					System.out.println("请输入您想修改成为的数字：");
					int d=sc.nextInt();
					int index=list.indexOf(c);
					list.set(index, d);
				}
				else System.out.println("没有找到您想修改的值");
				break;
			case 4:
				System.out.println("显示所有整数：");
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i)+" ");
				}
				break;
			case 5:
				System.out.println("排行榜：");
				Collections.sort(list,Collections.reverseOrder());
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i)+" ");
				}
				break;
			}
			
		}while(input!=0);

	}

}
