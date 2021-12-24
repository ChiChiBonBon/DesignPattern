package bridge;

import org.junit.Test;

public class RemoteTest {
	@Test
	public void test() {
		System.out.println("===橋接模式===");
		
		System.out.println("---一般信件測試---");
		MailSender mailSender = new NormalMail(new NoRegisterMail());
		mailSender.send();
		mailSender = new NormalMail(new RegisterMail());
		
		System.out.println("---限時信件測試---");
		mailSender = new PromptMail(new NoRegisterMail());
		mailSender.send();
		mailSender = new PromptMail(new RegisterMail());
		mailSender.send();
	}
}
