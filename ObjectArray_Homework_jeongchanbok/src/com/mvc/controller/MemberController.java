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

	public Member checkId(String userId) {
		Member m = null; // ���̵�� �˻��� ����� ���� ���� �ʱ�ȭ
		
		// mem ���� �Ű������� ���޹��� userId�� ������ ���̵� ������ �ִ� ȸ���� m�� ����
		for(int i = 0; i<memberCount; i++) {
			
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		
		// m ����
		return m;
		
		}
		
	public void insertMember(Member m) {
		// �Ű������� ���޹��� ȸ����ü�� mem �迭�� �߰�
		mem[memberCount++] = m;
		// memberCount 1 ����
		}
	
	public Member searchMember(int menu, String search) {
		Member searchMember = null; // �˻��� ȸ�� ������ ���� ���� �ʱ�ȭ
		// �Ű������� ���޹��� search ���ڿ��� menu ��ȣ�� ����
		for(int i = 0; i<memberCount;i++) {
			// 1 �� ��� ���̵�� �˻� �� ����� searchMember�� �����ϰ�
			if(menu == 1 && mem[i].getUserId().equals(search)) {
				searchMember = mem[i];
			// 2 �� ��� �̸����� �˻� �� ����� searchMember�� �����ϰ�
			}else if(menu == 2 && mem[i].getName().equals(search)) {
				searchMember = mem[i];
			// 3 �� ��� �̸��Ϸ� �˻� �� ����� searchMember�� �����ϰ�	
			}else if(menu == 3 && mem[i].getEmail().equals(search)) {
				searchMember = mem[i];
			}
			
		}
		// searchMember �ּ� �� ����
		return searchMember;
	
		}

	public void updateMember(Member m, int menu, String update) {
		
		// �Ű������� ���޹��� m ȸ���� ���� ������ update ���ڿ��� menu�� ����
		for(int i =0; i<memberCount; i++) {
			// 1 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� ��й�ȣ�� update ���ڿ��� ����
			if(menu == 1) {
				m.setUserPwd(update);
			// 2 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� �̸��� update ���ڿ��� ����	
			}else if(menu == 2) {
				m.setName(update);
			// 3 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� �̸����� update ���ڿ��� ����	
			}else if(menu == 3) {
				m.setEmail(update);
			}
			
			
		}
	
	}
	
	
	// �Ű������� ���޹��� userId�� mem�� �����ϴ� ��� �ش� ȸ�� ���� ��
	// ���� �ε��� ��ü���� ������ �� ĭ�� ������ �̵� ��Ŵ
	// memberCount 1 ����

	public void deleteMember(String userId) {
		
		for(int i =0; i<memberCount; i++) {
			for(int j = 0; j<i; j++) {
				
				if(mem[j].getUserId().equals(userId)) {
					
					Member temp = mem[i];
					mem[i] = mem[j];
					mem[j] = temp;

				}	
			}
			
		}
		memberCount--;
	}
}	

