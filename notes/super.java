package example;

public class Main
{

	public static void main(String[] args)
	{
		Player messi = new Player("White", "Male", "Messi", "Barcelona", 10);
		System.out.println(messi.race);
	}
}

public class Human
{
    String race;
    String gender;
    
    Human(String race, String gender)
    {
        this.race = race;
        this.gender = gender;
    }
}

public class Player extends Human
{
    String name;
    String club;
    int number;
    Player(String race, String gender, String name, String club, int number)
    {
        super(race, gender);
        this.name = name;
        this.club = club;
        this.number = number;
    }
}