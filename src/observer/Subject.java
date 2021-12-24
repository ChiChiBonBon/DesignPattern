package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	protected List<Adventurer> list = new ArrayList<>();
	
	public void add(Adventurer observer) {
		list.add(observer);
	}
	
	public void remove(Adventurer observer) {
		list.remove(observer);
	}
	
	public abstract void sendQuestions(String questions);
}
