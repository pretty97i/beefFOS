package com.cow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Cow extends Thread {
	
	Scanner sc = new Scanner(System.in);
	
	Calendar now = Calendar.getInstance();
	Image im = new Image();
	
	OperationExcep oe = new OperationExcep();
	Order order = new Order();
	OrderCheck orderCheck = new OrderCheck();
	private int table;
	
	static File file = new File("d:\\doc\\cow.txt");
	String str=null;
	HashMap<Integer, CowVO> hMap;
	ArrayList<CowVO> lists;
	
	
	
	public Cow(){
		
		try {
			//���� �о����
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			if(file.exists()){
				lists = (ArrayList<CowVO>) ois.readObject();
			}
			
			
			fis.close();
			ois.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
	//------------------------------------
	
	public int choiceTable() {

		for (int i = 0; i < im.table.length; i++) {

			System.out.println(im.table[i]);
		}

		try {

			System.out
					.println("\n**********************�סءءءءءء�**********************");
			System.out.println();
			System.out.println("                    �ڸ��� �����ϼ���[1-6]");
			System.out.println();
			System.out.print("                         ����:  ");
			str = sc.next();
			
			table = oe.number(str);
			

		} catch (Exception e) {
		}
		return table;
	}
	
	
	public boolean CheckTable(int table){
		
		boolean flag = true;
		if(hMap==null) {
			hMap = new HashMap<Integer, CowVO>();
		}
		
						
		if(hMap.containsKey(table)){
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;
	}
	
	//--------------------------------------
	public void newOrder(int table){//â��
		//ù�ֹ�
		if(lists==null) {
			lists = new ArrayList<CowVO>();
		}		
		CowVO ob = new CowVO();
		
		ob.setCal(now);
		ob = order.order(ob);
		
		Random rd = new Random();
		int random = rd.nextInt(6)+1;
		if(table==random){
			try {
				
				for(int i=0;i<im.service.length;i++){
					System.out.println(im.service[i]);
					sleep(100);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			ob.setService(1);
		}
		hMap.put(table, ob);
		lists.add(ob);
		orderCheck.check(ob);
		
		
	}
	public void add(int table) {
		//�߰��ֹ�
		
		try {
			
			Iterator<Integer> it = hMap.keySet().iterator();
			while(it.hasNext()) {
				
				int key = it.next();
				if (key == table) {
					CowVO ob = hMap.get(key);
					
					ob.setCal(now);
					
					CowVO ob1 = order.add(hMap.get(key));
					lists.add(lists.indexOf(ob), ob1);
					hMap.put(key, ob1);
					
					System.out.print(key + "�����̺�");
					orderCheck.check(ob);
					System.out.println("�ֹ��� �Ϸ�ƽ��ϴ�");
					break;
				}
			}
			
		} catch (NullPointerException e) {
			System.out.println("�ֹ������� �����ϴ�.");
		}
		
		
	}
	
	public void cancel(int table){//����
		//�ֹ����\
		
		try {
			
			Iterator<Integer> it = hMap.keySet().iterator();
			while(it.hasNext()) {
				
				int key = it.next();
				if (key == table) {
					CowVO ob = hMap.get(key); 
					
					ob.setCal(now);
					
					CowVO ob1 = order.cancel(hMap.get(key));
					lists.add(lists.indexOf(ob), ob1);
					hMap.put(key, ob1);
					
					System.out.print(key + "�����̺�");
					orderCheck.check(ob);
					System.out.println("�ֹ��� ��� �Ǿ����ϴ�");
					break;
				}
			}
			
		} catch (NullPointerException e) {
			System.out.println("�ֹ������� �����ϴ�.");
		}
		
		
	}
	
	
	//-------------------------------------
	
	public void check(int table){
		//�ֹ�Ȯ��
		
		try {
			
			Iterator<Integer> it = hMap.keySet().iterator();
			while(it.hasNext()) {

				int key = it.next();
				if(key==table) {
					CowVO ob = hMap.get(key);
					System.out.println(key + "�����̺�");
					orderCheck.check(ob);
					break;
					
				}
			}
				
			
			
			
		} catch (NullPointerException e) {
			System.out.println("�ֹ������� �����ϴ�.");
		}
	
	}
	
	public void cash(int table){
		//���
		
		try {
			
			Iterator<Integer> it = hMap.keySet().iterator();
			while(it.hasNext()) {
				int key = it.next();
				if(key==table) {
					CowVO ob = hMap.get(key);
					System.out.print(key + "�����̺�");
					orderCheck.check(ob);
					System.out.println("����� �Ϸ�ƽ��ϴ�");
					hMap.remove(key);
					break;
				}
				
			}
			
			
		} catch (NullPointerException e) {
			System.out.println("�ֹ������� �����ϴ�.");
		}
			
		
		//map����
	}
	//-------------------------------------
	
	
	public void total(){
		//�Ѹ���
		String str;
		String dayStart;
		String dayEnd;
		String voDay;
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		try {
		                               //0123456789
			System.out.print("��ȸ���۳�¥  [yyyy-mm-dd]->");
			str = sc.next();
			oe.date(str);
			String[] timeStart = str.split("-");
			int yearStart = Integer.parseInt(timeStart[0]);
			int monthStart = (Integer.parseInt(timeStart[1])-1);
			int dateStart = Integer.parseInt(timeStart[2]);
			start.set(yearStart, monthStart, dateStart);
			
			System.out.print("��ȸ��������¥[yyyy-mm-dd]->");
			str = sc.next();
			oe.date(str);
			String[] timeEnd = str.split("-");
			int yearEnd = Integer.parseInt(timeEnd[0]);
			int monthEnd = (Integer.parseInt(timeEnd[1])-1);
			int dateEnd = (Integer.parseInt(timeEnd[2]));
			end.set(yearEnd, monthEnd, dateEnd);
		} catch (Exception e) {
			
		}
		
			
			Iterator<CowVO> it = lists.iterator();
			
			CowVO ob = new CowVO();
			Calendar day = Calendar.getInstance();
			String days;
			String today;
			today = String.format("%tF", end);//2018-12/5
			//�˻� ������ ��¥(Ķ������)�� ��Ʈ������ �ٲ��� why?������ 
			end.add(end.DAY_OF_MONTH, 1);//2018126
			//�˻� ������ ��¥�� +1 �� 
			dayEnd = String.format("%tF", end);//2018126
			//�˻� ������ ��¥�� +1(Ķ������)�� ��Ʈ������ �ٲ���  
					
			while(it.hasNext()) {
				
				//2018-12-1~2018-12-5
				CowVO vo = it.next();
				
				voDay = String.format("%tF", vo.getCal());
				//list���� ����� ��¥�� �ҷ��ͼ� ��Ʈ�����·� ����
				
				day.set(start.get(start.YEAR), start.get(start.MONTH), start.get(start.DAY_OF_MONTH+1));
				//���۳�¥�� +1�� ���� day�� ����(Ķ������)
				//2018122
				
				days = String.format("%tF", day);
				//day(���۳�¥+1)�� ��Ʈ������ ����ȯ�ؼ� ����
				//2018122
				
				if(voDay.equals(days)){//list�� ����� ��¥�� days(���۳�¥+1)�� ������
					start.set(day.get(day.YEAR), day.get(day.MONTH), day.get(day.DAY_OF_MONTH));
				}//���۳�¥�� day(Ķ������:���۳�¥+1)�� �������.
				//��ŸƮ�� 12/2
				
				if(voDay.equals(dayEnd)){ //list�� ����� ��¥�� �˻� ������ ��¥�� ������ ����
					break;
				}
				
				dayStart = String.format("%tF", start);
				//���۳�¥(Ķ������)�� ��Ʈ������ ��ȯ
				
				if(voDay.equals(dayStart)||voDay.equals(today)){
					//lists���� �о�� ��¥�� ���۳�¥(��Ʈ����)�� ���ų� 
					//lidst���� �о�� ��¥�� ��������¥(��Ʈ����)�� ������
					//CowVO�� lists�� ������ִ� Cowvo������ ���� ����
					
					ob.setkCow(vo.getkCow());
					ob.setaCow(vo.getaCow());
					ob.setSoju(vo.getSoju());
					ob.setBeer(vo.getBeer());
					ob.setCidar(vo.getCidar());
				}
					
			
				
			}
			
			
			end.add(end.DAY_OF_MONTH, -1);
			
			
			System.out.printf("%tF  -  %tF",start,end);
			System.out.println();
			orderCheck.check(ob);
			
		
		
		
	}
	
	public void today(){
		
		String dayStart;
		String voDay;
		try {
			
			Iterator<CowVO> it = lists.iterator();
			CowVO ob = new CowVO();
			
			while(it.hasNext()) {
				
				CowVO vo = it.next();
				voDay = String.format("%tF", vo.getCal());
				dayStart = String.format("%tF", now);	
				
				if(voDay.equals(dayStart)){
											
						ob.setkCow(vo.getkCow());
						ob.setaCow(vo.getaCow());
						ob.setSoju(vo.getSoju());
						ob.setBeer(vo.getBeer());
						ob.setCidar(vo.getCidar());
				}
				
			}
			System.out.printf("%tF",now);
			System.out.println();
			orderCheck.check(ob);
			
		} catch (NullPointerException e) {
			System.out.println("�ֹ������� �����ϴ�.");
		}
		
		
		
	}
	//-------------------------------------
	
	public void nonCashTable(){
		
		
		try {
			
			Iterator<Integer> it = hMap.keySet().iterator();
			while(it.hasNext()){
				
				int key = it.next();
				CowVO vo = hMap.get(key);
				System.out.println("[ "+ key + "�����̺� ]");
				orderCheck.check(vo);
				
			}
			
			
		} catch (NullPointerException e) {
			System.out.println("�ֹ������� �����ϴ�.");
		}
		
		
	}
	
	public boolean output(){
		//��������,���α׷�����
		boolean flag = false;
		
		try {
			
			Iterator<Integer> it = hMap.keySet().iterator();
			while (it.hasNext()) {
				int key = it.next();
				if(key!=0){
					flag = true;
				}
			}
			
			
		} catch (NullPointerException e) {
			System.out.println("�ֹ������� �����ϴ�.");
		}
		
		
		
		if(flag) {
			System.out.println("����� �ȵ� ���̺��� �ֽ��ϴ�");
		}
			try {
				if (!file.exists()) {
					file.getParentFile().mkdirs();
				}
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(lists);
			
				fos.close();
				oos.close();
				
				boolean flag1 = true;

				for (int i = 0; i < 10; i++) {

					try {
						sleep(300);
					} catch (Exception e) {
						// TODO: handle exception
					}

					for (int z = 0; z < 40; z++) {
						System.out.println();
					}
										

					if (flag1) {

						for (int j = 0; j < im.by.length; j++) {
							System.out.print(im.by[j]);
							flag1 =false;	
						}
					} else {

						for (int k = 0; k < im.by2.length; k++) {
							System.out.print(im.by2[k]);
							flag1 = true;
						}
						
					}
					

				}
				
			
			} catch (Exception e) {
				// TODO: handle exception
			}
		return flag;
	}
}
