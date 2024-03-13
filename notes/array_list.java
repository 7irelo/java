package example;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		ArrayList<String> food = new ArrayList<String>();
		food.add("Bread");
		food.add("Cheese");
		food.add("Juice");

		food.remove(2);
		food.set(0, "water");
		food.clear();

		for (int i = 0; i < food.size(); i++)
		{
			System.out.println(food.get(i));
		}
	}
}