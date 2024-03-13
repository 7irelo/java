package example;

public class Main
{

	public static void main(String[] args)
	{
		Human messi = new Human("White", "Male", "Lionel Messi", 160);
		Human ronaldo = new Human("White", "Male", "Cristiano Ronaldo", 183);
		messi.copy(ronaldo);

		System.out.println();
		System.out.println(messi);
		System.out.println(ronaldo);
		System.out.println();
		System.out.println("Race: "+messi.getRace());
		System.out.println("Gender: "+messi.getGender());
		System.out.println("Name: "+messi.getName());
		System.out.println("Height: "+messi.getGoals()+" G/A");
		System.out.println();
		System.out.println("Race: "+ronaldo.getRace());
		System.out.println("Gender: "+ronaldo.getGender());
		System.out.println("Name: "+ronaldo.getName());
		System.out.println("Height: "+ronaldo.getGoals()+" G/A");
	}
}

public class Human
{
    private String race;
    private String gender;
    private String name;
    private int goals;
    
    Human(String race, String gender, String name, int goals)
    {
        this.setRace(race);
        this.setGender(gender);
        this.setName(name);
        this.setGoals(goals);
    }
    public void copy(Human x)
    {
        this.setRace(x.getRace());
        this.setGender(x.getGender());
        this.setName(x.getName());
        this.setGoals(x.getGoals());
    }
    public void setRace(String race)
    {
        this.race = race;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGoals(int goals)
    {
        this.goals = goals;
    }
    public String getRace()
    {
        return race;
    }

    public String getGender()
    {
        return gender;
    }

    public String getName()
    {
        return name;
    }

    public int getGoals()
    {
        return goals;
    }
}