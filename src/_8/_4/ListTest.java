package _8._4;

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
public class ListTest
{
	public static void main(String[] args) 
	{
		List books = new ArrayList();
		books.add(new String("zhangsan"));
		books.add(new String("lisi"));
		books.add(new String("wangwu"));
		System.out.println(books);

		books.add(1 , new String("zhaoliu"));
		for (int i = 0 ; i < books.size() ; i++ )
		{
			System.out.println(books.get(i));
		}
		books.remove(2);
		System.out.println(books);
		System.out.println(
			books.indexOf(new String("zhaoliu")));  //��
		books.set(1, new String("zhuqi"));
		System.out.println(books);
		System.out.println(books.subList(1 , 2));
	}
}