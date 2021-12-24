package template;

public class DifficultMaze extends MazeTemplate{
	public DifficultMaze() {
		super.isDoubleMaze=true;
		super.difficulty=50;
	}

	@Override
	void createMaze() {
		// TODO Auto-generated method stub
		System.out.println("困難迷宮準備完成!!!");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("冒險者開始進行困難迷宮的冒險者");
	}
}
