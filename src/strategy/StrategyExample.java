package strategy;

import java.util.ArrayList;
import java.util.Collections;

public class StrategyExample {
	public static void main(String[] args) {
		Village appleFarmVillage = new Village(3,"apple farm",32,5.1);
		Village barnFieldVillage = new Village(1,"barn field",22,1.7);
		Village capeValleyVillage = new Village(2,"cape valley",10,10.2);
		
		ArrayList<Village> villages = new ArrayList<>();
		villages.add(capeValleyVillage);
		villages.add(barnFieldVillage);
		villages.add(appleFarmVillage);
		
		System.out.println("沒排序過的資料");
		showList(villages);
		
		System.out.println("根據ID排序");
		Collections.sort(villages,new SortVillageById());
		showList(villages);
		
		System.out.println("根據名字排序");
		Collections.sort(villages,new SortVillageByname());
		showList(villages);
		
		System.out.println("根據人口排序");
		Collections.sort(villages,new SortVillageByPopulation());
		showList(villages);
		
		System.out.println("根據面積排序");
		Collections.sort(villages,new SortVillageByArea());
		showList(villages);
	}
	
	public static void showList (ArrayList<Village> list) {
		for(Village village : list) {
			System.out.println(village);
		}
	}
}
