package decorator;

public class Lancer implements Adventurer{
	private String name;


	public Lancer(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void attack() {
		System.out.println("長槍攻擊 by" + this.name);
	}
	

}
