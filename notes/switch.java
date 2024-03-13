package example;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		System.out.print("Day: ");
		Scanner lindi = new Scanner(System.in);
		String day = lindi.nextLine();

		switch (day) {
			case "monday": System.out.println("It is Monday");
				break;
			case "tuesday": System.out.println("It is Tuesday");
			break;
			case "wednesday": System.out.println("It is Wednesday");
			break;
			case "thursday": System.out.println("It is Thurday");
			break;
			case "friday": System.out.println("It is Friday");
			break;
			case "saturday": System.out.println("It is Saturday");
			break;
			case "sunday": System.out.println("It is Sunday");
			break;
			default: System.out.println("input mon to sun");
			break;
		}
	}
}
