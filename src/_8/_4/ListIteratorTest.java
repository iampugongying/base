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
public class ListIteratorTest
{
	public static void main(String[] args) 
	{
		String[] books = {
			"疯狂Java讲义","疯狂IOS讲义",
			"轻量级Java EE企业应用实战"
		};
		List booklist = new ArrayList();
		for (int i = 0; i < books.length; i++) {
			booklist.add(books[i]);
		}
		ListIterator listIterator = booklist.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			listIterator.add("---------分隔符-------------");
		}
		System.out.println("--------反向迭代--------");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
