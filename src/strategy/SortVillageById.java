package strategy;

import java.util.Comparator;

public class SortVillageById implements Comparator<Village> {

	@Override
	public int compare(Village o1, Village o2) {
		// TODO Auto-generated method stub
		if(o1.id > o2.id) {
			return 1;
		}
		
		if(o1.id < o2.id) {
			return -1;
		}
		
		return 0;
	}
	
}
