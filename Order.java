package com.cow;

import java.util.Scanner;

public class Order extends Thread {
	
	Image im = new Image();
	Scanner sc = new Scanner(System.in);

	public CowVO order(CowVO ob) {
		
		int num1, num2, num3;
		
		

			for (int i = 0; i < im.menuPan.length; i++) {
				System.out.print(im.menuPan[i]);

				try {
					sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			
		while (true) {

			while (true) {

				System.out.println();
				System.out
						.println("\n                   1:�ѿ�           2.���ްŽ�");
				System.out.println();
				System.out.print("                         ����:  ");
				num1 = sc.nextInt();
				if (num1 == 1 || num1 == 2) {
					break;
				}
				System.out.println("           �޴��� ���°� �ֹ� �ϼ̽��ϴ�. �ٽ� ����ּ���");
			}

			switch (num1) {
			case 1:
				System.out.println();
				System.out.println("                         ���κ� �帱���?");
				System.out.println();
				System.out.print("                         ����:  ");
				num2 = sc.nextInt();
				ob.setkCow(ob.KCOW * num2);
				break;
			case 2:
				System.out.println();
				System.out.println("                         ���κ� �帱���?");
				System.out.println();
				System.out.print("                         ����:  ");
				num2 = sc.nextInt();
				ob.setaCow(ob.ACOW * num2);
				break;
			default:
				break;
			}

			System.out
					.println("\n**********************�סءءءءءء�**********************");
			System.out.println();
			System.out.println("\n                   ��� �� �ֹ� �Ͻðپ��?");
			System.out.println();
			System.out.println("\n                      1.�� 2.�����ƿ�");
			System.out.println();
			System.out.print("                         ����:  ");
			num3 = sc.nextInt();

			if (num3 != 1)
				break;

		}

		while (true) {

			System.out.println("\n**********************�סءءءءءء�**********************");
			System.out.println();
			System.out.println("\n               ���ᳪ �� �ֹ� �Ͻðپ��?");
			System.out.println();
			System.out.println("\n           1.����? 2.����? 3.���̴�? 4.�����ƿ�");
			System.out.println();
			System.out.print("                          ����:  ");
			num1 = sc.nextInt();

			switch (num1) {
			case 1:
				System.out.println("\n                         ��帱���?");
				System.out.println();
				System.out.print("                          ����:  ");
				num2 = sc.nextInt();
				ob.setSoju(ob.ALCHOLE * num2);
				break;
			case 2:
				System.out.println("\n                         ��帱���?");
				System.out.println();
				System.out.print("                              ����:  ");
				num2 = sc.nextInt();
				ob.setBeer(ob.ALCHOLE * num2);
				break;
			case 3:
				System.out.println("\n                         ��帱���?");
				System.out.println();
				System.out.print("                              ����:  ");
				num2 = sc.nextInt();
				ob.setCidar(ob.DRINK * num2);
				break;
			
			case 4 :
				break;
				
			default:
				System.out.print("                  ���� �޴��� ���˽��ϴ�");
				break;
			}
			
			if(num1==4) break;

			System.out.println("\n**********************�סءءءءءء�**********************");
			System.out.println();
			System.out.println("\n                  ���� �� �ֹ� �Ͻðپ��?");
			System.out.println();
			System.out.println("\n                      1.�� 2.�����ƿ�");
			System.out.println();
			System.out.print("                         ����:  ");
			num3 = sc.nextInt();

			if (num3 != 1) {
				break;
			}
		}
		boolean flag = true;
		for (int i = 0; i < 10; i++) {

			try {
				sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}

			for (int z = 0; z < 40; z++) {
				System.out.println();
			}

			if (flag) {

				for (int j = 0; j < im.menuCow1.length; j++) {
					System.out.print(im.menuCow1[j]);
					flag = false;
				}
			} else {

				for (int k = 0; k < im.menuCow2.length; k++) {
					System.out.print(im.menuCow2[k]);
					flag = true;
				}

			}
		}
		return ob;

	}

	public CowVO add(CowVO ob) {

		int add;
		int num;
		int num2;

		while (true) {

			while (true) {
				
				for (int i = 0; i < im.menuPan.length; i++) {
					System.out.print(im.menuPan[i]);
		
					try {
						sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
		
				}
				System.out.println("\n**********************�סءءءءءء�**********************");
				System.out.println();
				System.out.println("        1.�ѿ�  2.���ްŽ�  3.����  4.����  5.���̴�");
				System.out.println();
				System.out.print("                         ����:  ");
				num = sc.nextInt();

				if (num > 0 && num < 6) {
					break;
				}

				System.out.println("       �޴��� ���°� �ֹ� �ϼ̽��ϴ�. �ٽ� ����ּ���");

			}

			switch (num) {

			case 1:
				System.out.println("                         �߰� ����?");
				System.out.print("\n                         ����:  ");
				add = sc.nextInt();
				ob.setkCow(add * ob.KCOW);
				break;
			case 2:
				System.out.println("                         �߰� ����?");
				System.out.print("\n                         ����:  ");
				add = sc.nextInt();
				ob.setaCow(add * ob.ACOW);
				break;
			case 3:
				System.out.println("                         �߰� ����?");
				System.out.print("\n                         ����:  ");
				add = sc.nextInt();
				ob.setSoju(add * ob.ALCHOLE);
				break;
			case 4:
				System.out.println("                         �߰� ����?");
				System.out.println();
				System.out.print("\n                         ����:  ");
				add = sc.nextInt();
				ob.setBeer(add * ob.ALCHOLE);
				break;
			case 5:
				System.out.println("                         �߰� ����?");
				System.out.println();
				System.out.print("\n                         ����:  ");
				add = sc.nextInt();
				ob.setCidar(add * ob.DRINK);
				break;
			}
			
			System.out.println("\n**********************�סءءءءءء�**********************");
			System.out.println();
			System.out.println("                      �� �ֹ� �Ͻðھ��?");
			System.out.println();
			System.out.println("                        1.�� 2.�����ƿ�");
			System.out.println();
			System.out.print("                         ����:  ");
			num2 = sc.nextInt();

			if (num2 != 1) {
				break;
			}
		}
		boolean flag = true;
		for(int i=0;i<10;i++){	
			
			try {
				sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			for(int z=0;z<40;z++){
				System.out.println();
			}
			
			
	       if(flag){
				
				for(int j=0;j<im.menuCow1.length;j++){					
					System.out.print(im.menuCow1[j]);	
					flag = false;
				}
			}else{
				
				for(int k=0;k<im.menuCow2.length;k++){					
					System.out.print(im.menuCow2[k]);
					flag = true;
				}
				
			}
		}
		return ob;
	}

	public CowVO cancel(CowVO ob) {

		int num;
		int cancel;
		while(true){
			
			while (true) {
				for (int i = 0; i < im.menuPan.length; i++) {
					System.out.print(im.menuPan[i]);
		
					try {
						sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
		
				}
				System.out.println("\n**********************�סءءءءءء�**********************");
				System.out.println();
				System.out.println("        1.�ѿ�  2.���ްŽ�  3.����  4.����  5.���̴�");
				System.out.println();
				System.out.print("                         ����:  ");
				num = sc.nextInt();
	
				if (num > 0 && num < 6) {
					break;
				}
	
				System.out.println("        �޴��� ���°� ���̽��ϴ�. �ٽ� ����ּ���");
	
			}
	
			switch (num) {
	
			case 1:
				System.out.println("                       ��� ����?");
				System.out.print("\n                         ����:  ");
				cancel = sc.nextInt();
				if(ob.getkCow()>ob.KCOW*cancel){
					ob.setkCow(-cancel * ob.KCOW);
					break;
				}else{
					System.out.println("��Ҽ����� Ȯ���ϼ���");
				}
				break;
			case 2:
				System.out.println("                       ��� ����?");
				System.out.print("\n                         ����:  ");
				cancel = sc.nextInt();
				if(ob.getaCow()>ob.ACOW*cancel){
					ob.setaCow(-cancel * ob.ACOW);
					break;
				}else{
					System.out.println("��Ҽ����� Ȯ���ϼ���");
				}
				break;
			case 3:
				System.out.println("                       ��� ����?");
				System.out.print("\n                         ����:  ");
				cancel = sc.nextInt();
				if(ob.getSoju()>ob.ALCHOLE*cancel){
					ob.setSoju(-cancel * ob.ALCHOLE);
					break;
				}else{
					System.out.println("��Ҽ����� Ȯ���ϼ���");
				}
				break;
			case 4:
				System.out.println("                       ��� ����?");
				System.out.print("\n                         ����:  ");
				cancel = sc.nextInt();
				if(ob.getBeer()>ob.ALCHOLE*cancel){
					ob.setBeer(-cancel * ob.ALCHOLE);
					break;
				}else{
					System.out.println("��Ҽ����� Ȯ���ϼ���");
				}
				break;
			case 5:
				System.out.println("                       ��� ����?");
				System.out.print("\n                         ����:  ");
				cancel = sc.nextInt();
				if(ob.getCidar()>ob.DRINK*cancel){
					ob.setCidar(-cancel * ob.DRINK);
					break;
				}else{
					System.out.println("��Ҽ����� Ȯ���ϼ���");
				}
				break;
	
			}
			System.out.println("\n**********************�סءءءءءء�**********************");
			System.out.println();
			System.out.println("                      �� ��� �Ͻðھ��?");
			System.out.println();
			System.out.println("                       1.��   2.�����ƿ�");
			System.out.println();
			System.out.print("                          ����:  ");
			int num2 = sc.nextInt();

			if (num2 != 1) {
				break;
			}
		}
			boolean flag = true;
			for(int i=0;i<10;i++){	
				
				try {
					sleep(300);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				for(int z=0;z<40;z++){
					System.out.println();
				}
				
				
		       if(flag){
					
					for(int j=0;j<im.menuCow1.length;j++){					
						System.out.print(im.menuCow1[j]);	
						flag = false;
					}
				}else{
					
					for(int k=0;k<im.menuCow2.length;k++){					
						System.out.print(im.menuCow2[k]);
						flag = true;
					}
					
				}
			}
			return ob;
	}
}
