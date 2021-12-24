package bridge;

public class NoRegisterMail extends Mail {

	@Override
	void resgiterStage() {
		// TODO Auto-generated method stub
		System.out.println("這是封信不是註冊信，收件人不用簽名");
	}

}
