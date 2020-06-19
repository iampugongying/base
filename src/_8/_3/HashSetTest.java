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

class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}

class B
{
	public int hashCode()
	{
		return 1;
	}
}

class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashSetTest
{
	public static void main(String[] args) 
	{
		HashSet books = new HashSet();
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}
