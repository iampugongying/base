package _8._3;

import java.util.*;
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
enum Season{
	SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest
{
	public static void main(String[] args) 
	{
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);

	}
}
