package edu.kh.poly.model.dto;

//Car를 상속받은 자식클래스 porsche

public class Porsche extends Car {
	
	
	private boolean openTheDoor;
	public Porsche() {
		super();
	}
	public Porsche(int wheel, int seat, String fuel, boolean openTheDoor) {
		super(wheel, seat, fuel);
		this.openTheDoor = openTheDoor;
	}
	
	// car의 toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + "Porsche [openTheDoor=" + openTheDoor + "]";
	}
	public char[] isOpenTheDoor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	   @Override
	   public void bindingTest() {
		   
		   System.out.println("porsche 자료형입니다.");
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}
