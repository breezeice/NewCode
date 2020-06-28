/**
 * 
 */
package day3;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
* @Description:输入一个正整数N，判断该数是不是质数，如果是质数输出“N是一个质数”，否则输出“N不是质数”。提示：质数的含义：除了1和它本身不能被任何数整除。（**使用for循环实现**）
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午7:04:45
*
*/
public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(n%2==0||n%3==0||n%5==0||n%7==0)
			{
				flag=1;
			}
		}
		if(flag==0) System.out.println(n+"是一个质数");
		else System.out.println(n+"不是质数");
	}

}
