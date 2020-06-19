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

class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}

	public boolean equals(Object obj)
	{
		return true;
	}

	public int compareTo(Object obj)
	{
		return 1;
	}
}
public class TreeSetTest2
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);

		System.out.println(set.add(z1));

		System.out.println(set);
		 ((Z)(set.first())).age = 9;
		System.out.println(((Z)(set.last())).age);
	}
}
