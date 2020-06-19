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
public class SetTest
{
	public static void main(String[] args) 
	{
		Set books = new HashSet();
		//���һ���ַ�������
		books.add(new String("���Java����"));
		//�ٴ����һ���ַ�������
		//��Ϊ�����ַ�������ͨ��equals�����Ƚ���ȣ�
		//�������ʧ�ܣ�����false
		boolean result = books.add(new String("���Java����"));
		//���������������ֻ��һ��Ԫ��
		System.out.println(result + "-->" + books);	
	}
}
