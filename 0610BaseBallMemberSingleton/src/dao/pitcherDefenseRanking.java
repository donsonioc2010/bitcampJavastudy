package dao;

import java.util.ArrayList;

import Singleton.Singleton;
import dto.*;
public class pitcherDefenseRanking {
	
	public pitcherDefenseRanking() {

		Singleton single = Singleton.getInstance();
		ArrayList<Human> pitSorting = getPitList();
		
		sorting(pitSorting);
		
		}
	public ArrayList<Human> getPitList() {

		Singleton single = Singleton.getInstance();
		ArrayList<Human> pitSorting = new ArrayList<Human>();
		for(int i = 0; i<single.h.size();i++) {
			if(single.h.get(i) instanceof Pitcher)
				pitSorting.add(single.h.get(i));
		}
		return pitSorting;
	}
	public void sorting(ArrayList pitSort) {
		for(int i =0; i<pitSort.size()-1;i++) {
			for(int j = i+1; j<pitSort.size();j++){
				double num1 = ((Pitcher)pitSort.get(i)).getDefence();
				double num2 = ((Pitcher)pitSort.get(j)).getDefence();
				if(num1<num2) {
					swap(pitSort,i,j);
				}
			}
		}
		for(int i = 0; i<pitSort.size();i++) {
			System.out.println(((Pitcher)pitSort.get(i)).toString());
		}
	}
	public void swap(ArrayList<Human> sort,int i,int j) {
		Human h = sort.get(i);
		sort.set(i, sort.get(j));
		sort.set(j, h);
	}
	
}
