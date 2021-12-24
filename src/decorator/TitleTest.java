package decorator;

import org.junit.Test;

public class TitleTest {
	
	@Test
	public void test() {
		System.out.println("===裝飾者模式測試===");
		
		Adventurer lancer = new Lancer("Jacky");
		System.out.println("---長槍兵---");
		lancer.attack();
		
		System.out.println();
		System.out.println("---取得強壯稱號的jacky---");
		TitleStrong sJacky = new TitleStrong(lancer);
		sJacky.attack();
		System.out.println();
		System.out.println("---取得敏捷稱號的jacky---");
		TitleAgile aJacky = new TitleAgile(sJacky);
		aJacky.attack();
		aJacky.useFlash();
		
		System.out.println();
		System.out.println("---取得燃燒稱號的jacky---");
		TitleInFire fJacky = new TitleInFire(sJacky);
		fJacky.fireball();
		
		System.out.println("---jacky決定成為一個非常強壯的槍兵---");
		TitleStrong ssJacky = new TitleStrong(fJacky);
		ssJacky.attack();
	}
}
