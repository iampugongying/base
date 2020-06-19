package _4._6;

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
public class FinalReplaceTest
{
	public static void main(String[] args) 
	{
		//���涨����4��final���������
		final int a = 5 + 2;
		final double b = 1.2 / 3;
		final String str = "���" + "Java";
		final String book = "���Java���壺" + 99.0;
		//�����book2������ֵ��Ϊ�����˷����������޷��ڱ���ʱ��ȷ������
		final String book2 = "���Java���壺" + String.valueOf(99.0);  //��
		System.out.println(book == "���Java���壺99.0");
		System.out.println(book2 == "���Java���壺99.0");
	}
}
