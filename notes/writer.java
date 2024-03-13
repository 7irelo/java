package example;

import java.io.FileWriter;

public class Main
{

	public static void main(String[] args)
	{
		try 
		{
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red\nViolets are blue");
			writer.append("\nA poem by Rick");
			writer.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}