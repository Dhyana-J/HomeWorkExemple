package com.mvc.view;

import java.util.Scanner;
import com.mvc.controller.MemberController;
import com.mvc.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	
	
	public void mainMenu() {
		
		/* �޴� ��� >> �ݺ� ���� ó����
		====== ȸ�� ���� �޴� ======
		1. �ű� ȸ�� ��� >> insertMember() ����
		2. ȸ�� ���� �˻� >> searchMember() ����
		3. ȸ�� ���� ���� >> updateMember() ����
		4. ȸ�� ���� ���� >> deleteMember() ����
		5. ȸ�� ���� ��� >> printAllMember() ����
		9. ���α׷� ����
		*/
		while(true) {
			
			System.out.println("\n====== ȸ�� ���� �޴� ======");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ���α׷�  ����");
			System.out.print("�޴� ���� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("��ȣ�� �ٽ� �Է����ּ���."); break;	
			}
		}
		
		
		
		
	}

	public void insertMember() {
		// 1. ���� ȸ�� ��(memberCount)�� �ִ� ȸ�� ��(SIZE)�� �Ѿ ��� return ó��
		// MemberController�� getMemberCount() �޼ҵ带 ���� ���� ȸ�� �� �˾ƿ���
		//�ִ� ȸ�� ���� ����ʵ忩�� Ŭ������. ���� ���� ���� ����
		
		System.out.println("\n == �ű� ȸ�� ��� ==");
		
		
		int count = mc.getMemberCount();
		
		if(count > MemberController.SIZE) {
			return;
		}
		
		// 2. ���̵� �Է� �޾� MemberController�� checkId() �޼ҵ�� ���� >> ��� �� �ޱ�
		sc.nextLine();
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		
	
	}
	
}
