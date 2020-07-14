package com.method.hw2.controller;

public class NonStaticSample {
	
	
	public int[] intArrayAllocation(int length) {
		
		// ���޹��� ���� (length) ��ŭ int �迭�� �Ҵ�
		int[] arr = new int[length];
		
		// ������ 1���� 100������ ������ ���� ����ϰ� �迭 �ּ� ����
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*100 +1);
			
		}
		
		return arr;
		
	}
	
	
	public void display(int[] arr) {
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		// ���޹��� �迭�� ������ �ε��� ���� ��ȯ
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	}
	
	public void sortDescending(int[] arr) {
		
		// ���� swap �޼ҵ带 �̿��Ͽ� ���޹��� �迭�� �������� ����
		for(int i = 0; i<arr.length;i++ ) {
			for(int j =0; j<i; j++) {
				
				if(arr[j] < arr[i]) {
					this.swap(arr, i, j);
				}	
			}
		}
		
		// ���� display �޼ҵ带 �̿��Ͽ� ���
		this.display(arr);
		
	}
	
	public void sortAscending(int[] arr) {
		
		// ���� swap �޼ҵ带 �̿��Ͽ� ���޹��� �迭�� �������� ����
				for(int i = 0; i<arr.length;i++ ) {
					for(int j =0; j<i; j++) {
						
						if(arr[j] > arr[i]) {
							this.swap(arr, i, j);
						}	
					}
				}
				
				// ���� display �޼ҵ带 �̿��Ͽ� ���
				this.display(arr);
	}
	
	public int countChar(String str, char c) {
		
		// ���ڿ��� ���� �ϳ��� ���޹޾� ���ڿ��� ���Ե� ������ ���� ����
		char[] ch = new char[str.length()];
		
		int count =0;
		
		for(int i = 0; i<ch.length;i++ ) {
			
			ch[i] = str.charAt(i);
			
			if(ch[i] == c) {
				count++;
			}
		}
		
		
		 System.out.printf("%s���ڿ��� %c�� ���� : %d\n", str, c, count);
		
		 return count;
		
	}
	
	public int totalValue(int num1, int num2) {
		
		
		// ���� �� ���� ���޹޾� �� �� �� ���� ������ ū �� ������ �������� �հ踦 ����
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		int sum = 0;
		
		for(int i = min+1; i<max; i++) {
			
			sum += i;
			
		}
		// (��, ���޹��� �� ������ ���Ե��� �ʾƾߵȴ�.)
		System.out.printf("%d�� %d���� �������� �հ� : %d\n",max,min,sum);
		
		return sum;
		
		}
	
	public char pCharAt(String str, int index) {
		
		char[] ch = new char[str.length()];
		// ���޹��� ���ڿ��� �ε����� ���� �ش� �ε����� ���� ����
		
		
		for(int i = 0; i<str.length();i++) {
			
			
			ch[i] = str.charAt(i);
			
			if(i == index) {
				
				System.out.printf("%s���ڿ��� %d�� �ε��� ���� : %c",str,index,ch[index]);
				break;
			}
			
			}
		
			return ch[index];
		
		}
	
	public String pConcat(String str1, String str2) {
		
		String fin = str1 + str2;
		
		// �� ���� ���ڿ��� ���� �޾� �ϳ��� ���ڿ��� ���ļ� ����
		
		System.out.printf("\n%s�� %s�� ��ģ ���ڿ�  : %s",str1,str2,fin);
		
		return fin;
		
		
		}
	
	
}
