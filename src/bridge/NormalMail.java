package bridge;

public class NormalMail extends MailSender {

	public NormalMail(Mail mail) {
		super(mail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.print(">>信件寄出後3~5天內抵達");
		super.mail.resgiterStage();
	}

}
