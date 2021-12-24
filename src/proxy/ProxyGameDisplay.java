package proxy;

public class ProxyGameDisplay implements GameDisplay {
	private RealGameDisplay realGameDisplay;
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("遊戲讀取中…");
		realGameDisplay.display();
	}


	public ProxyGameDisplay(RealGameDisplay realGameDisplay) {
		super();
		this.realGameDisplay = realGameDisplay;
	}
}
