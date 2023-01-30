package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private double mobileCodeImei;
	private int mobileMemory;

	public Smartphone(String prodName, String prodBrand, double prodPrice, double mobileCodeImei, int mobileMemory) {
		super(prodName, prodBrand, prodPrice);
		this.mobileCodeImei = mobileCodeImei;
		this.mobileMemory = mobileMemory;
	}
	public double getMobileCodeImei() {
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
