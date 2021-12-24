package factory;

import org.junit.Assert;
import org.junit.Test;

public class TrainingCampTest {

	@Test
	public void test() {
		System.out.println("===工廠模式測試===");
		
		TrainingCamp trainingCamp = new ArcherTraingCamp();
		Adventurer memberA = trainingCamp.trainAdventurer();
		
		trainingCamp = new WarriorTrainingCamp();
		Adventurer memberB = trainingCamp.trainAdventurer();
		
		
		Assert.assertEquals(memberA.getType(), "Archer");
		Assert.assertEquals(memberB.getType(), "Warrior");
	}
}
