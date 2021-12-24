package factory;

import factory.*;

public class Archer implements Adventurer {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		System.out.println("我是弓箭手");
		return this.getClass().getSimpleName();
	}

}
