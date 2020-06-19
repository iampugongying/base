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
public class Primitive2String
{
	public static void main(String[] args) 
	{
		Integer a=5;
		String intStr = "123";
		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		System.out.println(it1);
		System.out.println(it2);
		String floatStr = "4.56";
		float ft1 = Float.parseFloat(floatStr);
		float ft2 = new Float(floatStr);
		System.out.println(ft1);
		System.out.println(ft2);
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		String dbStr = String.valueOf(3.344);
		System.out.println(dbStr);
		String boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}
