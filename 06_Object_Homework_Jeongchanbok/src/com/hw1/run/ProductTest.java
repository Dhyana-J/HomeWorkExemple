package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product ssn = new Product("ssgnote9","�����ó�Ʈ9","��⵵ ����", 960_000, 10.0);
		Product lgn = new Product("lgxnote5","LG����Ʈ��5","��⵵ ����", 780_000, 0.7);
		Product ktn = new Product("ktsnote3","KT����Ʈ��3","����� ����", 250_000, 0.3);
		
		System.out.println(ssn.information());
		System.out.println(lgn.information());
		System.out.println(ktn.information());
		
		System.out.println("=====================================================");
		
		ssn.setPrice(1_200_000);
		lgn.setPrice(1_200_000);
		ktn.setPrice(1_200_000);
		
		ssn.setTax(0.05);
		lgn.setTax(0.05);
		ktn.setTax(0.05);
		
		System.out.println(ssn.information());
		System.out.println(lgn.information());
		System.out.println(ktn.information());
		
		System.out.println("=====================================================");
		
		int ssnRprice = ssn.realPrice(ssn.getPrice(), ssn.getTax());
		int lgnRprice = lgn.realPrice(lgn.getPrice(), lgn.getTax());
		int ktnRprice = ktn.realPrice(ktn.getPrice(), ktn.getTax());
		
		System.out.println("��ǰ�� = " + ssn.getProductname() + "\n�ΰ��� ���� ����  = " + ssnRprice + "��");
		System.out.println("��ǰ�� = " + lgn.getProductname() + "\n�ΰ��� ���� ����  = " + lgnRprice + "��");
		System.out.println("��ǰ�� = " + ktn.getProductname() + "\n�ΰ��� ���� ����  = " + ktnRprice + "��");
		
		
	}

}
