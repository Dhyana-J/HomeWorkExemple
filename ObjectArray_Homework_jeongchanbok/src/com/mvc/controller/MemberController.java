package com.mvc.controller;

import com.mvc.model.vo.Member;

public class MemberController {

	
	public static final int SIZE = 10; // �ִ� ȸ�� �� ����ʵ�� 10 �ʱ�ȭ
	private int memberCount;			// ���� ȸ�� �� �ʵ�
	private Member[] mem = new Member[SIZE];  //ȸ������ ������ ��� ��ü �迭
	
	
	// �ʱ�ȭ ���� �̿��Ͽ� �⺻���� ȸ�� 5���� ���� �ʱ�ȭ, memberCount �� 5 �ʱ�ȭ
	{
		mem[0] = new Member("user01", "pass01", "������", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	
	public int getMemberCount() {
		
		// memberCount ����
		return memberCount;
		}

	public Member[] getMem() {
		// mem �ּ� �� ����
		return mem;
		}

	
		
	
}
