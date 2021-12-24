package bridge;

public class PromptMail extends MailSender {

	public PromptMail(Mail mail) {
		super(mail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.print(">>信件寄出後24小穩內抵達");
		super.mail.resgiterStage();
	}

}
