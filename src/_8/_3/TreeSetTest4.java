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
class M
{
	int age;
	public M(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "M[age:" + age + "]";
	}
}
public class TreeSetTest4
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet(new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				M m1 = (M)o1;
				M m2 = (M)o2;
				return m1.age > m2.age ? -1
					: m1.age < m2.age ? 1 : 0;
			}
		});	
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
	}
}

