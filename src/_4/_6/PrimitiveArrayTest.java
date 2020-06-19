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
public class PrimitiveArrayTest
{
	public static void main(String[] args) 
	{
		//����һ��int[]���͵��������
		int[] iArr;
		//��̬��ʼ�����飬���鳤��Ϊ5
		iArr = new int[5];
		//����ѭ����ʽΪÿ������Ԫ�ظ�ֵ��
		for (int i = 0; i <iArr.length ; i++ )
		{
			iArr[i] = i + 10;
		}
	}
}
