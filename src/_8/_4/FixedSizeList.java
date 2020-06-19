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
public class FixedSizeList
{
	public static void main(String[] args)
	{
		List fixedList = Arrays.asList("���Java����"
			, "������Java EE��ҵӦ��ʵս");
		//��ȡfixedList��ʵ���࣬�����Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//����fixedList�ļ���Ԫ��
		for (int i = 0; i < fixedList.size() ; i++)
		{
			System.out.println(fixedList.get(i));
		}
		//��ͼ���ӡ�ɾ��Ԫ�ض�������UnsupportedOperationException�쳣
		fixedList.add("���Android����");
		fixedList.remove("���Java����");
	}
}
