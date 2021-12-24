package factory;

public class Warrior implements Adventurer {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		System.out.println("我是鬥士");
		return this.getClass().getSimpleName();
	}

}
