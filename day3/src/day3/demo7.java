/**
 * 
 */
package day3;

/**
* @Description:7、打印出100~999之间的所有“水仙花数”。所谓“水仙花数”，是指一个3位数，其各位数字立方和等于该数本身。例如：153是一个“水仙花数”，因为153=13+53+33。
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午7:05:27
*
*/
public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g,s,b;
		double sum;
		for(int i=100;i<999;i++)
		{
			g=i%10;
			s=i/10%10;
			b=i/100;
			sum=Math.pow(g,3)+Math.pow(s,3)+Math.pow(b,3);
			if(i==sum)
			{
				System.out.print(i+" ");
			}
		}
	}

}
