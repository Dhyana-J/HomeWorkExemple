package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {

		// StaticSample Ŭ���� ������ value�� ��Java���� �ʱ�ȭ �� ���
		StaticSample s = new StaticSample();
		
		s.setValue("Java");
		
		System.out.println("value : " + s.getValue());
		
		
		// toUpper �޼ҵ� ������ ���� �빮�ڷ� ���� �� ���
		StaticSample.toUpper();
		
		System.out.println("�빮�ڷ� : " + s.getValue());
		
		
		// valueLength �޼ҵ� ������ ���� ���� ���
		
		System.out.println("���� : " + StaticSample.valueLength());
		
		
		// valueConcat �޼ҵ� ������ ���� ��PROGRAMMING�� ���ڿ� ��ģ �� ���
		String input = "PROGRAMMING";
		
		String output = StaticSample.valueConcat(input);
		
		System.out.println(input + "�ٿ��� : " + output);
		// setChar �޼ҵ� ������ ���� ��J���� ��C���� ���� �� ���
		
		StaticSample.setChar(0, 'C');
		
		System.out.println("J => C : " + s.getValue() );
	}

}
