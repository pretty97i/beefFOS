package com.cow;

public class OperationExcep {
	
	public int number(String str) throws Exception{
		
		int num = Integer.parseInt(str);
		return num;
		
	}
	
	public void date(String str) throws Exception{
		
		String[] timeStart = str.split("-");
		int yearStart = Integer.parseInt(timeStart[0]);
		int monthStart = (Integer.parseInt(timeStart[1])-1);
		int dateStart = Integer.parseInt(timeStart[2]);
		
		
	}

}
