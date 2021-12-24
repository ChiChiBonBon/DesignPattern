package template;

import org.junit.Test;
import org.xml.sax.HandlerBase;

public class MazeTest {
	Adventurer sabar = new Sabar();
	Adventurer justice = new GundamJustice();
	
	MazeTemplate easyMaze = new EazyMaze();
	MazeTemplate hardMaze = new DifficultMaze();
	
	@Test
	public void test(){
		System.out.println("===Template Pattern===");
		System.out.println("===HardMaze===");
		sabar = hardMaze.adventure(sabar);
		System.out.println("===SimpleMaze");
		sabar = easyMaze.adventure(sabar);
		
		System.out.println("===困難迷宮===");
		sabar = hardMaze.adventure(sabar);
		justice = hardMaze.adventure(justice);
		
	}
}
