package decorator;

public class TitleInFire extends Title {

	public TitleInFire(Adventurer adventurer) {
		super(adventurer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.print(" 燃燒 ");
		super.attack();
	}
	
	public void fireball() {
		System.out.println("丟火球");
	}

}
