package main.decor;

import main.entity.Drink;

public class SugarAddition implements Drink{

	protected Drink drink;
	
	public SugarAddition(Drink someDrink) {
		this.drink = someDrink;
	}
	
	@Override
	public int getPrice() {

		return (int) (drink.getPrice() + 0.5);
		
	}

}
