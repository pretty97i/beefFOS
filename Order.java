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
						.println("\n                   1:한우           2.블랙앵거스");
				System.out.println();
				System.out.print("                         선택:  ");
				num1 = sc.nextInt();
				if (num1 == 1 || num1 == 2) {
					break;
				}
				System.out.println("           메뉴에 없는걸 주문 하셨습니다. 다시 골라주세요");
			}

			switch (num1) {
			case 1:
				System.out.println();
				System.out.println("                         몇인분 드릴까요?");
				System.out.println();
				System.out.print("                         선택:  ");
				num2 = sc.nextInt();
				ob.setkCow(ob.KCOW * num2);
				break;
			case 2:
				System.out.println();
				System.out.println("                         몇인분 드릴까요?");
				System.out.println();
				System.out.print("                         선택:  ");
				num2 = sc.nextInt();
				ob.setaCow(ob.ACOW * num2);
				break;
			default:
				break;
			}

			System.out
					.println("\n**********************§※※※※※※§**********************");
			System.out.println();
			System.out.println("\n                   고기 더 주문 하시겟어요?");
			System.out.println();
			System.out.println("\n                      1.네 2.괜찮아요");
			System.out.println();
			System.out.print("                         선택:  ");
			num3 = sc.nextInt();

			if (num3 != 1)
				break;

		}

		while (true) {

			System.out.println("\n**********************§※※※※※※§**********************");
			System.out.println();
			System.out.println("\n               음료나 술 주문 하시겟어요?");
			System.out.println();
			System.out.println("\n           1.소주? 2.맥주? 3.사이다? 4.괜찮아요");
			System.out.println();
			System.out.print("                          선택:  ");
			num1 = sc.nextInt();

			switch (num1) {
			case 1:
				System.out.println("\n                         몇병드릴까요?");
				System.out.println();
				System.out.print("                          선택:  ");
				num2 = sc.nextInt();
				ob.setSoju(ob.ALCHOLE * num2);
				break;
			case 2:
				System.out.println("\n                         몇병드릴까요?");
				System.out.println();
				System.out.print("                              선택:  ");
				num2 = sc.nextInt();
				ob.setBeer(ob.ALCHOLE * num2);
				break;
			case 3:
				System.out.println("\n                         몇병드릴까요?");
				System.out.println();
				System.out.print("                              선택:  ");
				num2 = sc.nextInt();
				ob.setCidar(ob.DRINK * num2);
				break;
			
			case 4 :
				break;
				
			default:
				System.out.print("                  없는 메뉴를 고르셧습니다");
				break;
			}
			
			if(num1==4) break;

			System.out.println("\n**********************§※※※※※※§**********************");
			System.out.println();
			System.out.println("\n                  음료 더 주문 하시겟어요?");
			System.out.println();
			System.out.println("\n                      1.네 2.괜찮아요");
			System.out.println();
			System.out.print("                         선택:  ");
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
				System.out.println("\n**********************§※※※※※※§**********************");
				System.out.println();
				System.out.println("        1.한우  2.블랙앵거스  3.소주  4.맥주  5.사이다");
				System.out.println();
				System.out.print("                         선택:  ");
				num = sc.nextInt();

				if (num > 0 && num < 6) {
					break;
				}

				System.out.println("       메뉴에 없는걸 주문 하셨습니다. 다시 골라주세요");

			}

			switch (num) {

			case 1:
				System.out.println("                         추가 수량?");
				System.out.print("\n                         선택:  ");
				add = sc.nextInt();
				ob.setkCow(add * ob.KCOW);
				break;
			case 2:
				System.out.println("                         추가 수량?");
				System.out.print("\n                         선택:  ");
				add = sc.nextInt();
				ob.setaCow(add * ob.ACOW);
				break;
			case 3:
				System.out.println("                         추가 수량?");
				System.out.print("\n                         선택:  ");
				add = sc.nextInt();
				ob.setSoju(add * ob.ALCHOLE);
				break;
			case 4:
				System.out.println("                         추가 수량?");
				System.out.println();
				System.out.print("\n                         선택:  ");
				add = sc.nextInt();
				ob.setBeer(add * ob.ALCHOLE);
				break;
			case 5:
				System.out.println("                         추가 수량?");
				System.out.println();
				System.out.print("\n                         선택:  ");
				add = sc.nextInt();
				ob.setCidar(add * ob.DRINK);
				break;
			}
			
			System.out.println("\n**********************§※※※※※※§**********************");
			System.out.println();
			System.out.println("                      더 주문 하시겠어요?");
			System.out.println();
			System.out.println("                        1.네 2.괜찮아요");
			System.out.println();
			System.out.print("                         선택:  ");
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
				System.out.println("\n**********************§※※※※※※§**********************");
				System.out.println();
				System.out.println("        1.한우  2.블랙앵거스  3.소주  4.맥주  5.사이다");
				System.out.println();
				System.out.print("                         선택:  ");
				num = sc.nextInt();
	
				if (num > 0 && num < 6) {
					break;
				}
	
				System.out.println("        메뉴에 없는걸 고르셨습니다. 다시 골라주세요");
	
			}
	
			switch (num) {
	
			case 1:
				System.out.println("                       취소 수량?");
				System.out.print("\n                         선택:  ");
				cancel = sc.nextInt();
				if(ob.getkCow()>ob.KCOW*cancel){
					ob.setkCow(-cancel * ob.KCOW);
					break;
				}else{
					System.out.println("취소수량을 확인하세요");
				}
				break;
			case 2:
				System.out.println("                       취소 수량?");
				System.out.print("\n                         선택:  ");
				cancel = sc.nextInt();
				if(ob.getaCow()>ob.ACOW*cancel){
					ob.setaCow(-cancel * ob.ACOW);
					break;
				}else{
					System.out.println("취소수량을 확인하세요");
				}
				break;
			case 3:
				System.out.println("                       취소 수량?");
				System.out.print("\n                         선택:  ");
				cancel = sc.nextInt();
				if(ob.getSoju()>ob.ALCHOLE*cancel){
					ob.setSoju(-cancel * ob.ALCHOLE);
					break;
				}else{
					System.out.println("취소수량을 확인하세요");
				}
				break;
			case 4:
				System.out.println("                       취소 수량?");
				System.out.print("\n                         선택:  ");
				cancel = sc.nextInt();
				if(ob.getBeer()>ob.ALCHOLE*cancel){
					ob.setBeer(-cancel * ob.ALCHOLE);
					break;
				}else{
					System.out.println("취소수량을 확인하세요");
				}
				break;
			case 5:
				System.out.println("                       취소 수량?");
				System.out.print("\n                         선택:  ");
				cancel = sc.nextInt();
				if(ob.getCidar()>ob.DRINK*cancel){
					ob.setCidar(-cancel * ob.DRINK);
					break;
				}else{
					System.out.println("취소수량을 확인하세요");
				}
				break;
	
			}
			System.out.println("\n**********************§※※※※※※§**********************");
			System.out.println();
			System.out.println("                      더 취소 하시겠어요?");
			System.out.println();
			System.out.println("                       1.네   2.괜찮아요");
			System.out.println();
			System.out.print("                          선택:  ");
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
