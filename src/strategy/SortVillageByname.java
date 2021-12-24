package strategy;

import java.util.Comparator;

public class SortVillageByname implements Comparator<Village> {

	@Override
	public int compare(Village o1, Village o2) {
		// TODO Auto-generated method stub
		if(o1.name.charAt(0)> o2.name.charAt(0)) {
			return 1;
		}
		
		if(o1.name.charAt(0) < o2.name.charAt(0)){
			return -1;
		}
		
		return 0;
	}

}
