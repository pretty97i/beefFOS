package com.cow;

public class OrderCheck extends Thread {
	
	
public void check(CowVO ob){
		
		String[] title = {"KoreaCow","BlackAngers","Soju","Beer","Cider","총합"};
		try {
			
		
		System.out.println("========================≪≪ 영수증 ≫≫========================");	
			
		System.out.printf("\n%20s %20s %10s","Menu","수량","가격");
		sleep(100);
		System.out.printf("\n==============================================================");
		
		if(ob.getkCow()!=0){
			System.out.printf("\n%22s %18d %15d",
					title[0],ob.getkCow()/ob.KCOW, ob.getkCow());
			sleep(100);
		}
		if(ob.getaCow()!=0){
			System.out.printf("\n%22s %18d %15d",
					title[1], ob.getaCow()/ob.ACOW, ob.getaCow());
			sleep(100);
		}
		System.out.printf("\n==============================================================");
		sleep(100);
		
		if(ob.getSoju()!=0){
			System.out.printf("\n%22s %18d %15d", 
					title[2], ob.getSoju()/ob.ALCHOLE, ob.getSoju());
			sleep(100);
		}
		if(ob.getBeer()!=0){
			System.out.printf("\n%22s %18d %15d", 
					title[3],ob.getBeer()/ob.ALCHOLE, ob.getBeer());
			sleep(100);
		}
		if(ob.getCidar()!=0){
			System.out.printf("\n%22s %18d %15d",
					title[4], ob.getCidar()/ob.DRINK, ob.getCidar());
			sleep(100);
		}
		if(ob.getService()!=0){
			System.out.printf("\n%22s %18d %15d",
					"Beer(SV)", ob.getService(), 0);
			sleep(100);
		}
		System.out.printf("\n==============================================================");
		sleep(100);
	
		System.out.printf("\n%18s %35d\n", title[5], ob.getTot());
		sleep(100);
		System.out.println("");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	public void cash(CowVO ob){
		
		check(ob);
		
		
		//map삭제
	}

}
