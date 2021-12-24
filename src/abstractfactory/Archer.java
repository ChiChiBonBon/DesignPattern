package abstractfactory;

public class Archer extends Adventurer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("我是弓箭手,裝備:");
		weapon.display();
		System.out.println();
		clothes.display();
		System.out.println();
	}

}
