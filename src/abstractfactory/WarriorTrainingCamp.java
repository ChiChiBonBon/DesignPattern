package abstractfactory;

public class WarriorTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new WarriorEquipFactory();

	@Override
	public Adventurer trainAdventurer() {
		// TODO Auto-generated method stub
		System.out.println("訓練一個鬥士");
		Warrior warrior = new Warrior();
		
		warrior.setWeapon(factory.productWeapon());
		warrior.setClothes(factory.productArmor());
		return warrior;
	}

}
