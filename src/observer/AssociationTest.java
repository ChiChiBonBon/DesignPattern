package observer;

import org.junit.Test;

public class AssociationTest {
	@Test
	public void test() {
		System.out.println("===觀察者模式測試===");
		
		Adventurer lancer = new Lancer("jacky");
		Adventurer lancer2 = new Lancer("seven");
		Adventurer bard = new Bard("lee");
		Adventurer gunman = new Gunman("longWu");
		
		Subject association = new Association();
		association.add(lancer);
		association.add(lancer2);
		association.add(bard);
		association.add(gunman);
		
		System.out.println("---協會派送簡單任務---");
		association.sendQuestions("run");
		
		System.out.println();
		System.out.println("---協會派送複雜任務---");
		association.sendQuestions("run run run");
		
		association.remove(lancer2);
		System.out.println();
		System.out.println("---協會派送複雜任務(seven已經不在名單中)---");
		association.sendQuestions("run run run");
	}
}
