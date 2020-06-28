
package day3;

import java.util.Scanner;

/**
* @Description:幸运猜猜猜：游戏随机给出一个0~99（包括0和99）的数字，然后让你猜是什么数字。你可以随便猜一个数字，游戏会提示太大还是太小，从而缩小结果范围。经过几次猜测与提示后，最终推出答案。在游戏过程中，记录你最终猜对时所需要的次数，游戏结束后公布结果。
* @version
* @Date 2020年6月28日下午7:05:38
*
*/
public class demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number = (int)(Math.random()*100);
		int n,count=0;
		do
		{
			System.out.println("请输入猜测的数字：");
			n=sc.nextInt();
			if(n>number)
				System.out.println("猜大了");
			if(n<number)
				System.out.println("猜小了");
			count++;
		}
		while(n!=number);
		System.out.println("猜对了");
		System.out.println("一共猜了"+count+"次");
	}
	
}
