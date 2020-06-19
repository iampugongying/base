package _4._6;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class TwoDimensionTest
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[4][];
		for (int i = 0 , len = a.length; i < len ; i++ )
		{
			System.out.println(a[i]);
		}
		a[0] = new int[2];
		a[0][1] = 6;
		for (int i = 0 , len = a[0].length ; i < len ; i ++ )
		{
			System.out.println(a[0][i]);
		}

		int[][] b = new int[3][4];

		String[][] str1 = new String[][]{new String[3]
			, new String[]{"hello"}};
		String[][] str2 = {new String[3]
			, new String[]{"hello"}};
		System.out.println(str1[1][0]);
		System.out.println(str2[1][0]);
	}
}

