package com.hw1.run;

import com.hw1.model.vo.*;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book b1 = new Book();
		Book b2 = new Book("�ڹ�������", 20000, 0.2, "����");
		
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println("=============================");
		
		b1.setTitle("C���");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("ȫ�浿");
		
		System.out.println("������ ��� Ȯ��\n" + b1.information());
		System.out.println("=============================");
		
		int b1Rprice = b1.discountPrice(b1.getPrice(), b1.getDiscountRate());
		int b2Rprice = b2.discountPrice(b2.getPrice(), b2.getDiscountRate());
		
		System.out.println("������ = " + b1.getTitle() + "\n���ε� ����  = " + b1Rprice + "��");
		System.out.println("������ = " + b2.getTitle() + "\n���ε� ���� ����  = " + b2Rprice + "��");
		
	}

}
