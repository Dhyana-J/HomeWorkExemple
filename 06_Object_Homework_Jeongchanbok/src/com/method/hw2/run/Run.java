package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample s = new NonStaticSample();
		
		
		
		int[] arr = s.intArrayAllocation(5);
		
		System.out.print("ũ�Ⱑ 5�� �迭�� ���� �� : ");
		
		s.display(arr);
				
		
		System.out.print("\n�������� ��� : ");
		
		s.sortDescending(arr);
		
		System.out.print("\n�������� ��� : ");
		
		s.sortAscending(arr);
		
		System.out.println();
		
		s.countChar("apple", 'p');
		
		s.totalValue(13,7);
		
		s.pCharAt("programming", 3);
		
		s.pConcat("JAVA","programming");
		
		
	}

}
