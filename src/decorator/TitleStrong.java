package decorator;

public class TitleStrong extends Title {

	public TitleStrong(Adventurer adventurer) {
		super(adventurer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.print("猛力");
		super.attack();
	}
}
