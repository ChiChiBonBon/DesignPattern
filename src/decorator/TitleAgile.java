package decorator;

public class TitleAgile extends Title {

	public TitleAgile(Adventurer adventurer) {
		super(adventurer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.print(" 快速 ");
		super.adventurer.attack();
	}
	
	public void useFlash() {
		System.out.println("使用瞬間移動");
	}
}

