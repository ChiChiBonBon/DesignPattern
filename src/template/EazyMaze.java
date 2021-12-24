package template;

public class EazyMaze extends MazeTemplate{
	public EazyMaze() {
		super.difficulty=1;
	}

	@Override
	void createMaze() {
		// TODO Auto-generated method stub
		System.out.println("簡易迷宮準備完成");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("冒險者開始進行簡單迷宮的冒險");
	}
}
