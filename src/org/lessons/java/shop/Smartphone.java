package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {
	
	private int mobileCodeImei;
	private int mobileMemory;

	public Smartphone(String prodName, String prodBrand, double prodPrice, int mobileMemory) {
		super(prodName, prodBrand, prodPrice);
		Random c=new Random();
		this.mobileCodeImei = c.nextInt(1000000000);
//		this.mobileCodeImei = mobileCodeImei;
		this.mobileMemory = mobileMemory;
	}
	public int getMobileCodeImei() {
		return mobileCodeImei;
	}
	public void setMobileCodeImei(int mobileCodeImei) {
		this.mobileCodeImei = mobileCodeImei;
	}
	public int getMobileMemory() {
		return mobileMemory;
	}
	public void setMobileMemory(int mobileMemory) {
		this.mobileMemory = mobileMemory;
	}
	
}
