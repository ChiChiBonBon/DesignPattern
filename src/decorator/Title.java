package decorator;



public abstract class Title implements Adventurer{
	protected Adventurer adventurer;

	public Title(Adventurer adventurer) {
		super();
		this.adventurer = adventurer;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		adventurer.attack();
	}

	

}
