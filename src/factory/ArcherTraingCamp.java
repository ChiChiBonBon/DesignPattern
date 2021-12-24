package factory;

public class ArcherTraingCamp implements TrainingCamp {

	@Override
	public Adventurer trainAdventurer() {
		// TODO Auto-generated method stub
		System.out.println("訓練一個弓箭手");
		return new Archer();
	}
}
