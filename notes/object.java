package example;

public class Main
{

	public static void main(String[] args)
	{
		player messi = new player("Messi", "Barcelona", 10, 250000);
		System.out.println("Name: "+messi.name);
		System.out.println("Club: "+messi.club);
		System.out.println("Number: "+messi.number);
		System.out.printf("Salary: $%.2f\n", messi.salary);
		messi.kick();
		messi.transfer("Juventus");
	}
}

public class player
{
    String name;
    String club;
    int number;
    double salary;

    player(String name, String club, int number, double salary)
    {
        this.name = name;
        this.club = club;
        this.number = number;
        this.salary = salary;
    }
    void kick()
    {
        System.out.println(name+" kicks the ball");
    }
    void transfer(String club)
    {
        System.out.println(name+" transfers to "+club);
        this.club = club;
    }
}