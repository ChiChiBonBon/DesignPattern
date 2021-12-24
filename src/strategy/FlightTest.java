package strategy;

import org.junit.Test;

public class FlightTest {
	
	@Test
	public void test() {
		Adventurer adventurer = new Adventurer();
		
		System.out.println("出現史萊姆>");
		adventurer.choiceStrategy(new NormalAttack());
		adventurer.attack();
		System.out.println();
		
		System.out.println("出現非常巨大的史萊姆>");
		adventurer.choiceStrategy(new UseSkill());
		adventurer.attack();
		System.out.println();
		
		System.out.println("出現不怕刀槍的殭屍>");
		adventurer.choiceStrategy(new UseSkill());
		adventurer.attack();
	}
}
