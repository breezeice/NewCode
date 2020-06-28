/**
 * 
 */
package day3;

/**
* @Description:本金10000元存入银行，年利率是千分之三。每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少？（**使用for循环实现**）
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午7:04:20
*
*/
public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bj=10000;
		double lx;
		for(int i=0;i<5;i++)
		{
			lx=bj*0.003;
			bj+=lx;
		}
		System.out.println("5年后获得的本金为："+bj);
	}

}
