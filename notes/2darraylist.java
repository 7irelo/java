package example;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		ArrayList<ArrayList<String>> groceries = new ArrayList();

		ArrayList<String> bakery = new ArrayList<String>();
		bakery.add("Bread");
		bakery.add("Muffins");
		bakery.add("Donuts");

		ArrayList<String> veggies = new ArrayList<String>();
		veggies.add("Tomatoes");
		veggies.add("Onions");
		veggies.add("Potatoes");

		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Redbull");
		drinks.add("Sprite");
		drinks.add("Lean");

		groceries.add(bakery);
		groceries.add(veggies);
		groceries.add(drinks);

		System.out.println(groceries.get(0).get(0));
	}
}