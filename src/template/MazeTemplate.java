package template;

/**
 * 
 * @author ChiBon
 * 迷宮樣板(Template)-規範迷宮冒險的演算法
 */
public abstract class MazeTemplate {
	protected int difficulty;
	protected Adventurer adventurer;
	protected boolean isDoubleMaze = false;

	public Adventurer adventure(Adventurer adventurer) {
		this.adventurer = adventurer;
		
		if(!checkLevel(adventurer.getLevel())) {
			System.out.println("冒險者等級不足，請提升等級至 "+difficulty+"後開放迷宮");
		}else {
			System.out.println("---"+adventurer.getType()
							   + "開放進行困難度 " + difficulty +" 的迷宮");
			
			if(isDoubleMaze) {
				hiddenMaze();
			}
			showResult();
		}
		return this.adventurer;
	}
	
	private boolean checkLevel(int level) {
		if(level < difficulty) {
			return false;
		}
		return true;
	}
	
	abstract void createMaze();
	
	abstract void start();
	
	void hiddenMaze() {
		System.out.println("進入隱藏迷宮");
	}
	
	Adventurer showResult() {
		this.adventurer.setLevel(adventurer.getLevel()+50*difficulty);
		System.out.println("---"+adventurer.getType()+"完成困難度 "+difficulty+"迷宮!!!");
		return this.adventurer;
	}
}


