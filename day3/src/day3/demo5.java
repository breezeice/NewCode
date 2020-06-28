/**
 * 
 */
package day3;

import java.util.Scanner;

/**
* @Description:5、输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（**使用while循环实现**）
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午7:05:00
*
*/
public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			System.out.print(n%10+" ");
			n/=10;
		}
	}

}
