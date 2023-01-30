package org.lessons.java.shop;

public class Headphones {
	
	private String hPhonesColor;
	private boolean hPhonesWireless;
	
	public String gethPhonesColor() {
		return hPhonesColor;
	}
	public void sethPhonesColor(String hPhonesColor) {
		this.hPhonesColor = hPhonesColor;
	}
	public boolean ishPhonesWireless() {
		return hPhonesWireless;
	}
	public void sethPhonesWireless(boolean hPhonesWireless) {
		this.hPhonesWireless = hPhonesWireless;
	}
	
	public Headphones(String hPhonesColor, boolean hPhonesWireless) {
		super();
		this.hPhonesColor = hPhonesColor;
		this.hPhonesWireless = hPhonesWireless;
	}

}
