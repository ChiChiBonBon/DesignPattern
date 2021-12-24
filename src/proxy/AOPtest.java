package proxy;

import org.junit.Test;

public class AOPtest {
	
	@Test
	public void test() throws Throwable{
		System.out.println("===代理模式(AOP)測試===");
		
		System.out.println("===沒使用代理===");
		FightManager fm = new FightManager();
		fm.doFight("邦邦");
		System.out.println();
		
		System.out.println("===使用代理===");
		FightManager proxyFM = new ProxyFightManager(fm);
		proxyFM.doFight("邦邦");
	}
}
