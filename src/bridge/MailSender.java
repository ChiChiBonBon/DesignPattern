package bridge;

public abstract class MailSender {
	protected Mail mail;
	
	@SuppressWarnings("unused")
	private MailSender() {};
	
	public MailSender(Mail mail) {
		this.mail = mail;
	}
	
	abstract public void send();
}
