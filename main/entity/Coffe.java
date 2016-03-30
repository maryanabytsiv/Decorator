package main.entity;

public class Coffe implements Drink{

	@Override
	public int getPrice() {
		return 5;
	}
	
	void getFirm() {
		System.out.println("Jacobs");
	}

}
