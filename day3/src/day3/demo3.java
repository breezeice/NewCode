/**
 * 
 */
package day3;

/**
* @Description:求整数1~100的累加值，但要求跳过所有个位为3的数。（**使用for循环实现**）
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午7:04:31
*
*/
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<100;i++)
		{
			if(i%10==3)
			{
				continue;
			}
			sum+=i;
		}
		System.out.println("和为："+sum);
	}

}
