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
public class VectorTest
{
	public static void main(String[] args) 
	{
		Stack v = new Stack();
		//���ν�����Ԫ��push��"ջ"
		v.push("���Java����");
		v.push("������Java EE��ҵӦ��ʵս");
		v.push("���Android����");
		//�����[���Java����, ������Java EE��ҵӦ��ʵս , ���Android����]
		System.out.println(v);
		//���ʵ�һ��Ԫ�أ�����������pop��"ջ"����������Android����
		System.out.println(v.peek());
		//��Ȼ�����[���Java����, ������Java EE��ҵӦ��ʵս , ���Android����]
		System.out.println(v);
		//pop����һ��Ԫ�أ���������Android����
		System.out.println(v.pop());
		//�����[���Java����, ������Java EE��ҵӦ��ʵս]
		System.out.println(v);
	}
}
