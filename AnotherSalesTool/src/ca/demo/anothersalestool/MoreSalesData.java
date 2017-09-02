package ca.demo.anothersalestool;

import java.util.*;

public class MoreSalesData {
	List<Integer> numbers = new ArrayList<>();
	
	public MoreSalesData(){
		numbers.add(25);
		numbers.add(50);
		numbers.add(12);
	}
	
	public void setNumbers(List<Integer> aList){
		numbers = aList;
	}
	
	/*
	public void setNumberData(int i, int aNumber){
		numbers.add(i, aNumber);
	}
	*/
	
	public List<Integer> getNumbers(){
		return numbers;
	}
	

	
}
