package com.cow;

import java.util.Scanner;

public class Main extends Thread {

	public static void main(String[] args) {

		

			Scanner sc = new Scanner(System.in);
			Cow ob = new Cow();
			OperationExcep oe = new OperationExcep();
			Image ia = new Image();

			// ù��° �̹��� ������(����)
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
					
				
				System.out.println("\n**********************�סءءءءءء�**********************");
				System.out.println();
				System.out.println("              1.�űԼմ�           2.�����մ�");
				System.out.println();
				System.out.println();
				System.out.print("                         ����:  ");
				str = sc.next();
				
				num = oe.number(str);

				} catch (Exception e) {
					// TODO: handle exception
				}
				switch (num) {
				case 1:// �űԼմ�
					do {
						table = ob.choiceTable();

						if (table == 0) {
							break;
						}

						if (ob.CheckTable(table)) {
							System.out.println("\n                   �̹� �մ��� �ֽ��ϴ�!!");

						} else if (table > 0 && table < 7) {
							System.out.println("\n                   �մ��� ���Խ��ϴ�!!");

						} else {
							System.out.println("�������� �ʴ� �ڸ��Դϴ�. �ٽ� �����ϼ���");
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
									.println("\n                         �ڸ��� �ٽ� Ȯ���ϼ���!!");
						}
						if (table == 0) {
							break;
						}

					} while (table < 1 || table > 6 || !ob.CheckTable(table));

					if (table == 0) {
						break;
					}
					try {
						
					System.out.print("\n            1.�ֹ�Ȯ�� 2.�߰��ֹ� 3.�ֹ���� 4.���");
					System.out.println();
					System.out.print("\n                         ����:  ");
					str = sc.next();
					num = oe.number(str);

					} catch (Exception e) {
						// TODO: handle exception
					}
					switch (num) {
					case 1:// �ֹ�
						ob.check(table);

						break;

					case 2: // �߰��ֹ�

						ob.add(table);
						break;

					case 3: // �ֹ����
						ob.cancel(table);
						break;

					case 4: // ���
						ob.cash(table);
						break;
					default:
						break;
					}
					break;

				default:// ������
					try {
						
					System.out
							.println("\n**********************�סءءءءءء�**********************");
					System.out.println();
					System.out
							.print("\n1.���ø��� 2.�Ⱓ������ 3.�̰������̺�Ȯ�� 4.�ڷ� 5.���α׷�����");
					System.out.println();
					System.out.print("\n                         ����:  ");
					str = sc.next();
					num = oe.number(str);

					} catch (Exception e) {
						// TODO: handle exception
					}
					switch (num) {
					case 1:// ���ø���
						ob.today();
						break;

					case 2:// �Ⱓ������
						ob.total();
						break;
					case 3: // �̰��� ���̺�
						ob.nonCashTable();
						break;
						
					case 4: //�ǵ��ư���
						
						break;

					case 5:// ����
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
