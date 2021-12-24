package adapter;

public class Adapter implements Wizard {
	private Archer archer;
	
	@Override
	public void fireBall() {
		// TODO Auto-generated method stub
		System.out.print("===在弓箭上包一層布->淋上花生油->點火===");
		archer.shot();
		System.out.println("火球飛出去了");
	}

	public Adapter(Archer archer) {
		super();
		this.archer = archer;
	}
}
