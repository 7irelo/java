package example;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adjacent: ");
		double adj = scanner.nextDouble();
		System.out.print("Opposite: ");
		double opp = scanner.nextDouble();
		double hyp = Math.sqrt((opp * opp) + (adj * adj));
		System.out.println(hyp);
		scanner.close();
	}

}
