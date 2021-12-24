package proxy;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void test() {
		System.out.println("===代理模式(保護代理)===");
		
		System.out.println("===沒使用代理===");
		Person realPerson = new PersonBean();
		realPerson.setLikeCount(10);
		System.out.println("like " + realPerson.getLikeCount());
		
		System.out.println("===有使用代理===");
		Person proxy = new ProxyPersonBean(new PersonBean());
		proxy.setLikeCount(10);
		System.out.println("like " + proxy.getLikeCount());
	}
}
