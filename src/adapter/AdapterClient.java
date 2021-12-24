package adapter;

import org.junit.Test;

public class AdapterClient {
	@Test
	public void test() {
		System.out.println("===轉接器模式測試===");
		System.out.println("我體需要火球才能把樹上的蜂窩砸爛，不好的是隊中沒有法師");
		System.out.println("幸好隊伍中有一個弓箭手跟馬蓋先工具包，讓弓箭手也能發火球");
		
		Wizard wizard = new Adapter(new NormalArcher());
		wizard.fireBall();
	}
}
