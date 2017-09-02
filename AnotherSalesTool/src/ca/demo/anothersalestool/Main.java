package ca.demo.anothersalestool;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		MoreSalesData m = new MoreSalesData();
		
		displaySalesData(m);
		addingSalesData(m, 30);
		displaySalesData(m);
		removingSalesData(m, 50);
		displaySalesData(m);
	}
	
	public static void displaySalesData(MoreSalesData aMoreSalesData){
		System.out.print("Generating sales data display: ");
		System.out.println(aMoreSalesData.getNumbers());
	}
	
	public static void addingSalesData(MoreSalesData aMoreSalesData, int anotherNumber){
		System.out.println("Adding sales data: " + anotherNumber);
		aMoreSalesData.getNumbers().add(anotherNumber);
	}
	
	public static void removingSalesData(MoreSalesData aMoreSalesData, int anotherNumber){
		System.out.println("Removing sales data: " + anotherNumber);
		aMoreSalesData.getNumbers().remove(new Integer(anotherNumber));
	}
	
	
}
