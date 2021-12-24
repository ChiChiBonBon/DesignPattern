package observer;

public abstract class Adventurer {
	protected String name;
	
	public Adventurer(String name) {
		this.name = name;
	}
	
	public abstract void getQuestions(String questions);
}
