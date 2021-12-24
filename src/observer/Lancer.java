package observer;

public class Lancer extends Adventurer {

	public Lancer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuestions(String questions) {
		// TODO Auto-generated method stub
		System.out.println(name +":單來就改，任務來就接，沒在怕的");
	}

}
