package abstractfactory;


public class ArcherTrainingCamp implements TrainingCamp {
	private static EquipFactory factory = new ArcherEquipFactory();

	@Override
	public  Adventurer trainAdventurer() {
		// TODO Auto-generated method stub
		System.out.println("訓練一個弓箭手");
		Archer archer = new Archer();
		
		archer.setWeapon(factory.productWeapon());
		archer.setClothes(factory.productArmor());
		return archer;
	}

}
