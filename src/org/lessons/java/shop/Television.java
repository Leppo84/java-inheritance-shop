package org.lessons.java.shop;

public class Television extends Prodotto {

	private float TvDimensions;
	private boolean TvSmart;
	
	public float getTvDimensions() {
		return TvDimensions;
	}
	public void setTvDimensions(float tvDimensions) {
		TvDimensions = tvDimensions;
	}
	public boolean isTvSmart() {
		return TvSmart;
	}
	public void setTvSmart(boolean tvSmart) {
		TvSmart = tvSmart;
	}
	public Television(String prodName, String prodBrand, double prodPrice, float tvDimensions, boolean tvSmart) {
		super(prodName, prodBrand, prodPrice);
		TvDimensions = tvDimensions;
		TvSmart = tvSmart;
		
	} 

}
