package com.cow;

import java.util.Scanner;

public class Main extends Thread {

	public static void main(String[] args) {

		

			Scanner sc = new Scanner(System.in);
			Cow ob = new Cow();
			OperationExcep oe = new OperationExcep();
			Image ia = new Image();

			// 첫번째 이미지 가져옴(간판)
			for (int i = 0; i < ia.first.length; i++) {
				
				System.out.print(ia.first[i]);
				
				try {
					sleep(100);
					
				} catch (Exception e) {
					// TODO: handle exception
				}

			}

			int table;
			int num=0;
			String str = null;
			while (true) {
				try {
					
				
				System.out.println("\n**********************§※※※※※※§**********************");
				System.out.println();
				System.out.println("              1.신규손님           2.기존손님");
				System.out.println();
				System.out.println();
				System.out.print("                         선택:  ");
				str = sc.next();
				
				num = oe.number(str);

				} catch (Exception e) {
					// TODO: handle exception
				}
				switch (num) {
				case 1:// 신규손님
					do {
						table = ob.choiceTable();

						if (table == 0) {
							break;
						}

						if (ob.CheckTable(table)) {
							System.out.println("\n                   이미 손님이 있습니다!!");

						} else if (table > 0 && table < 7) {
							System.out.println("\n                   손님이 들어왔습니다!!");

						} else {
							System.out.println("존재하지 않는 자리입니다. 다시 선택하세요");
						}

					} while (table < 1 || table > 6 || ob.CheckTable(table));

					if (table == 0) {
						break;
					}

					ob.newOrder(table);
					break;

				case 2:
					do {
						table = ob.choiceTable();
						if (!ob.CheckTable(table)) {
							System.out
									.println("\n                         자리를 다시 확인하세요!!");
						}
						if (table == 0) {
							break;
						}

					} while (table < 1 || table > 6 || !ob.CheckTable(table));

					if (table == 0) {
						break;
					}
					try {
						
					System.out.print("\n            1.주문확인 2.추가주문 3.주문취소 4.계산");
					System.out.println();
					System.out.print("\n                         선택:  ");
					str = sc.next();
					num = oe.number(str);

					} catch (Exception e) {
						// TODO: handle exception
					}
					switch (num) {
					case 1:// 주문
						ob.check(table);

						break;

					case 2: // 추가주문

						ob.add(table);
						break;

					case 3: // 주문취소
						ob.cancel(table);
						break;

					case 4: // 계산
						ob.cash(table);
						break;
					default:
						break;
					}
					break;

				default:// 관리자
					try {
						
					System.out
							.println("\n**********************§※※※※※※§**********************");
					System.out.println();
					System.out
							.print("\n1.오늘매출 2.기간별매출 3.미결재테이블확인 4.뒤로 5.프로그램종료");
					System.out.println();
					System.out.print("\n                         선택:  ");
					str = sc.next();
					num = oe.number(str);

					} catch (Exception e) {
						// TODO: handle exception
					}
					switch (num) {
					case 1:// 오늘매출
						ob.today();
						break;

					case 2:// 기간별매출
						ob.total();
						break;
					case 3: // 미결재 테이블
						ob.nonCashTable();
						break;
						
					case 4: //되돌아가기
						
						break;

					case 5:// 종료
						if (!ob.output()) {

							for (int i = 0; i < ia.ending.length; i++) {

								System.out.println(ia.ending[i]);

							}

							System.exit(0);
						}
						break;

					}
					break;
				}

			}

		

	}
}
