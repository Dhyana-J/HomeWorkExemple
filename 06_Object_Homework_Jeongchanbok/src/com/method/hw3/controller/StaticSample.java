package com.method.hw3.controller;

public class StaticSample {

	private static String value;
	
	public void setValue(String value) {
		this.value = value;
		
	}
	
	public String getValue() {
		return value;
	}
	
	
	
	public static void toUpper() {
		// value �ʵ� ���� ��� �빮�ڷ� ���� --> char �迭 ����
		char[] ch = new char[value.length()];  // value = java
		
		String str = "";
		
		
		for(int i =0; i<value.length(); i++) {	// ch[] ={j,a,v,a}
			
			
			
			ch[i] = value.charAt(i);
			
			if(97<=ch[i] && ch[i] <= 122) {
				
				ch[i] -= 32;
				
				
			}
			
			str += ch[i];
			
		}
		
		value = str;
		
		}
	
	public static int valueLength() {
		int count = 0;
		char[] arr = new char[value.length()];
		// value �ʵ� ���� ��ϵǾ� �ִ� ���� ���� ����
		for(int i = 0; i<arr.length; i++) {
			
			count++;
		}
			
			return count;
		}

	public static String valueConcat(String str) {
		
		String mix = value + str;
		
		// ���ڿ� ���� ���޹޾� value �ʵ� ���� �ϳ��� ���ļ� ����
		
		return mix;
		}
	
	public static void setChar(int index, char c) {
		
		char[] ch = new char[value.length()];
		String output = "";
		
		for(int i = 0; i<ch.length; i++) {
			
			ch[i] = value.charAt(i);
				
			if(ch[i] == ch[index]) {
				ch[i] = c;
				
			}
			
			output += ch[i];
		}
		
		value = output;
		// ���޹��� �ε��� ��ġ�� value ���� ���޹��� ���ڷ� �����ϴ� static �޼ҵ�
	}

}
