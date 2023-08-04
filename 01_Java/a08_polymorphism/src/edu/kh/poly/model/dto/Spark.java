package edu.kh.poly.model.dto;

public class Spark extends Car {
	private double discountRate;
	
	
	//기본생성자
	public Spark() {
		// TODO Auto-generated constructor stub
	}


	public Spark(double discountRate) {
		super();
		this.discountRate = discountRate;
	}


	public Spark(int i, int j, String string, double d) {
		// TODO Auto-generated constructor stub
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	@Override
	public String toString() {
		return "Spark [discountRate=" + discountRate + "]";
	}
	
	
	
	
	

}
