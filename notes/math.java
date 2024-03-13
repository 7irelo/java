package example;

public class Main
{

	public static void main(String[] args)
	{
		int x = 2;
		int y = 3;
		int z = -4;
		double round = 3.5;
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x, y));
		System.out.println(Math.abs(z));
		System.out.println(Math.sqrt(Math.abs(z)));
		System.out.println(Math.round(round));
		System.out.println(Math.ceil(round));
		System.out.println(Math.floor(round));
	}
}
