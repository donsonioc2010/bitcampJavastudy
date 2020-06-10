package dao;

import java.util.ArrayList;
import dto.*;
import Singleton.Singleton;

public class batterHitRanking {
	
	
	public batterHitRanking() {
		Singleton single = Singleton.getInstance();
		ArrayList<Human> batSorting = getBatList();
		
		sorting(batSorting);
		
		
	}
	public ArrayList<Human> getBatList() {
		Singleton single = Singleton.getInstance();
		ArrayList<Human> batSorting = new ArrayList<Human>();
		for(int i = 0; i<single.h.size();i++) {
			if(single.h.get(i) instanceof Batter)
				batSorting.add(single.h.get(i));
		}
		return batSorting;
	}
	public void sorting(ArrayList batSort) {
		for(int i =0; i<batSort.size()-1;i++) {
			for(int j = i+1; j<batSort.size();j++){
				double num1 = ((Batter)batSort.get(i)).getHitAvg();
				double num2 = ((Batter)batSort.get(j)).getHitAvg();
				if(num1<num2) {
					swap(batSort,i,j);
				}
			}
		}
		for(int i = 0; i<batSort.size();i++) {
			System.out.println(((Batter)batSort.get(i)).toString());
		}
	}
	public void swap(ArrayList<Human> sort,int i,int j) {
		Human h = (Human) sort.get(i);
		sort.set(i, sort.get(j));
		sort.set(j, h);
	}
	
}
