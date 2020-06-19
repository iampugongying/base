package _8._2;

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
public class IteratorTest
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("1");
		books.add("2");
		books.add("3");
		System.out.println(books);

		Iterator iterator = books.iterator();
		while (iterator.hasNext()){
			String book = (String) iterator.next();
			System.out.println(book);
			if (book.equals("2")) {
				books.remove(book);
			}
		}
		System.out.println(books);

	}
}
