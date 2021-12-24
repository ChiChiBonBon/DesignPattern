package observer;

public class Bard extends Adventurer {

	public Bard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuestions(String questions) {
		// TODO Auto-generated method stub
		if(questions.length() > 10) {
			System.out.println(name + ":任務太難了，我只會唱歌跳舞，不接不接");
		}else {
			System.out.println(name + ":當街頭藝人太難賺了，偶爾也是要解任務賺點錢的");			
		}
	}

}
