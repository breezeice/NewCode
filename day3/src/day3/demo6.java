/**
 * 
 */
package day3;

/**
* @Description:在屏幕上打印出n行的金字塔图案，如，若n=5,则图案如下：
~~~java
    *     
   ***
  *****   
 *******
*********
~~~
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午7:05:13
*
*/
public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int k=0;k<5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
