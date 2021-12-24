package simplefactory;

public class Archer implements Adventurer {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		System.out.println("我是射箭手");
		return this.getClass().getSimpleName();
	}

}
