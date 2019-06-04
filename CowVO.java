package com.cow;

import java.io.Serializable;
import java.util.Calendar;

public class CowVO implements Serializable {
	
	final static int KCOW = 65000;
	final static int ACOW = 40000;
	final static int ALCHOLE = 4000;
	final static int DRINK = 2000;
	
	
	private int kCow=0;//��
	private int aCow=0;
	private int soju=0;//����
	private int beer=0;//����
	private int cidar=0;//���̴�
	private int tot;//�����̺� �Ѱ���
	private int service;
	
	private Calendar cal;
	
	
	
	public Calendar getCal() {
		return cal;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	public int getkCow() {
		return kCow;
	}
	public void setkCow(int kCow) {
		this.kCow += kCow;
	}
	public int getaCow() {
		return aCow;
	}
	public void setaCow(int aCow) {
		this.aCow += aCow;
	}
	public int getSoju() {
		return soju;
	}
	public void setSoju(int soju) {
		this.soju += soju;
	}
	public int getBeer() {
		return beer;
	}
	public void setBeer(int beer) {
		this.beer += beer;
	}
	public int getCidar() {
		return cidar;
	}
	public void setCidar(int cidar) {
		this.cidar += cidar;
	}
	public int getTot() {
		tot = kCow + aCow + soju + beer + cidar;
		return tot;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}

	
	
}

