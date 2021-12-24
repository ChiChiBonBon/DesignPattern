package proxy;

import java.util.Date;

public class ProxyFightManager extends FightManager {
	private FightManager sourceFightManager;

	public ProxyFightManager(FightManager sourceFightManager) {
		super();
		this.sourceFightManager = sourceFightManager;
	}

	@Override
	public void doFight(String userName) {
		// TODO Auto-generated method stub
		//aop
		System.out.println(">開始時間:" + new Date().toLocaleString());
		sourceFightManager.doFight(userName);
	}
	
	
}
