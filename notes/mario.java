package example;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int height;
		Scanner scanner = new Scanner(System.in);

		do
		{
			System.out.print("Height: ");
			height = scanner.nextInt();
		}
		while (height < 1);
		for (int i = 0; i < height; i++)
    	{
			for (int k = 0; k < height - i - 1; k++)
        	{
            	System.out.print(" ");
        	}
        
        	for (int j = 0; j <= i; j++)
        	{
            	System.out.print("#");
        	}
			System.out.println();
    	}
	}
}