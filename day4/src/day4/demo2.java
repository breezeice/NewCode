
package day4;

/**
* @Description
* @author 魏蓓蓓
* @version
* @Date 2020年6月28日下午9:56:25
*
*/
public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arry= {1,5,3,7,34,9,45,66,24};
		for(int i=0;i<arry.length;i++)
		{
			int min=i;
			for(int j=i;j<arry.length;j++)
			{
				
				if(arry[j]<arry[min])
				{
					min=j;
				}
			}
			int tmp=arry[min];
			arry[min]=arry[i];
			arry[i]=tmp;
		}
		for(int i=0;i<arry.length;i++)
		{
			System.out.print(arry[i]+" ");
		}
 }
}
