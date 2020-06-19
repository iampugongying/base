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
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class ListTest2
{
	public static void main(String[] args) 
	{
		List books = new ArrayList();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		System.out.println(books);
		//ɾ��������A���󣬽����µ�һ��Ԫ�ر�ɾ��
		books.remove(new A());     //��
		System.out.println(books);
		//ɾ��������A�����ٴ�ɾ�������е�һ��Ԫ��
		books.remove(new A());     //��
		System.out.println(books);
	}
}
