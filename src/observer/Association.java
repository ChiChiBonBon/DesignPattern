package observer;

public class Association extends Subject {

	@Override
	public void sendQuestions(String questions) {
		// TODO Auto-generated method stub
		for(Adventurer adventurer : list) {
			adventurer.getQuestions(questions);
		}
	}

}
