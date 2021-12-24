package observer;

public class Gunman extends Adventurer {

	public Gunman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuestions(String questions) {
		// TODO Auto-generated method stub
		if(questions.length() < 10) {
			System.out.println(name + ":任務太簡單了，我不想理他");
		}else {
			System.out.println(name + ":只要我的手上有槍，誰都殺不死我，出發執行任務賺獎金啦");
		}
	}

}
