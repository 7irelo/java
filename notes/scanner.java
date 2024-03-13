package example;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Age: ");
		int age = scanner.nextInt();
		
		System.out.println("Hi, "+name);
		System.out.println("You are "+age+" years old");
		scanner.close();
	}

}