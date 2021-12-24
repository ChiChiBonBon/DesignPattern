package abstractfactory;

public class ArcherEquipFactory implements EquipFactory {

	@Override
	public Weapon productWeapon() {
		// TODO Auto-generated method stub
		Bow product = new Bow();
		product.setAtk(10);
		product.setRange(10);
		return product;
	}

	@Override
	public Clothes productArmor() {
		// TODO Auto-generated method stub
		Leather product = new Leather();
		product.setDef(5);
		return product;
	}

}
