package factory;

public class WarriorTrainingCamp implements TrainingCamp {

	@Override
	public Adventurer trainAdventurer() {
		// TODO Auto-generated method stub
		System.out.println("訓練一個鬥士");
		return new Warrior();
	}

}
