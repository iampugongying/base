package _4._6;

import java.util.Arrays;
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
public class ArraysTest
{
	public static void main(String[] args) 
	{
		//����һ��a����
		int[] a = new int[]{3, 4 , 5, 6};
		//����һ��a2����
		int[] a2 = new int[]{3, 4 , 5, 6};
		//a�����a2����ĳ�����ȣ�ÿ��Ԫ��������ȣ������true
		System.out.println("a�����a2�����Ƿ���ȣ�"
			+ Arrays.equals(a , a2));
		//ͨ������a���飬����һ���µ�b����
		int[] b = Arrays.copyOf(a, 6); 
		System.out.println("a�����b�����Ƿ���ȣ�"
			+ Arrays.equals(a , b));
		//���b�����Ԫ�أ������[3, 4, 5, 6, 0, 0]
		System.out.println("b�����Ԫ��Ϊ��"
			+ Arrays.toString(b));
		//��b����ĵ�3��Ԫ�أ�����������5��Ԫ�أ�����������Ϊ1
		Arrays.fill(b , 2, 4 , 1);
		//���b�����Ԫ�أ������[3, 4, 1, 1, 0, 0]
		System.out.println("b�����Ԫ��Ϊ��" 
			+ Arrays.toString(b));
		//��b�����������
		Arrays.sort(b);
		//���b�����Ԫ�أ������[0, 0, 1, 1, 3, 4]
		System.out.println("b�����Ԫ��Ϊ��" 
			+ Arrays.toString(b));
	}
}
