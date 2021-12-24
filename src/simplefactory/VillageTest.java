package simplefactory;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class VillageTest {

	@Test
	public void test() {
		Adventurer memberA = TrainingCamp.trainAdventurer("archer");
		Adventurer memberB = TrainingCamp.trainAdventurer("warrior");
		
		Assert.assertEquals("Archer",memberA.getType());
		Assert.assertEquals("Warrior",memberB.getType());
	}

}
