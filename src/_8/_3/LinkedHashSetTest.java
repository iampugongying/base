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
public class LinkedHashSetTest
{
	public static void main(String[] args) 
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("���Java����");
		books.add("������Java EE��ҵӦ��ʵս");
		System.out.println(books);
		//ɾ�� ���Java����
		books.remove("���Java����");
		//������� ���Java����
		books.add("���Java����");
		System.out.println(books);
	}
}
