package template;

/**
 * 
 * @author ChiBon
 * 進入迷宮的冒險者介面
 */
public abstract class Adventurer {
	protected int level;
	protected String type;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	
	
}
