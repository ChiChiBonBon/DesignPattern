package abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class EquipFatoryTest {
	private EquipFactory equipFactory;
	
	@Test
	public void equipFactoryTest() {
		System.out.println("===抽象工廠模式===");
		
		equipFactory = new ArcherEquipFactory();
		Clothes archerLeather = equipFactory.productArmor();
		Weapon archerBow = equipFactory.productWeapon();
		
		Assert.assertEquals(5,archerLeather.getDef());
		Assert.assertEquals(10,archerBow.getAtk());
		Assert.assertEquals(10,archerBow.getRange());
		
		equipFactory = new WarriorEquipFactory();
		Clothes armor = equipFactory.productArmor();
		Weapon longSword = equipFactory.productWeapon();
		
		Assert.assertEquals(10, armor.getDef());
		Assert.assertEquals(10, longSword.getAtk());
		Assert.assertEquals(1,longSword.getRange());
		
		TrainingCamp camp = new ArcherTrainingCamp();
		
		Adventurer archer = camp.trainAdventurer();
		
		camp = new WarriorTrainingCamp();
		
		Adventurer warrior = camp.trainAdventurer();
		
		archer.display();
		warrior.display();
	}
}
