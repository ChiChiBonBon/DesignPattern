package abstractfactory;

public class WarriorEquipFactory implements EquipFactory {

	@Override
	public Weapon productWeapon() {
		// TODO Auto-generated method stub
		LongSword product = new LongSword();
		product.setAtk(10);
		product.setRange(1);
		return product;
	}

	@Override
	public Clothes productArmor() {
		// TODO Auto-generated method stub
		Armor product = new Armor();
		product.setDef(10);
		return product;
	}

}
