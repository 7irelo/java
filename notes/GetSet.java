package example;

public class Main
{

	public static void main(String[] args)
	{
		Human messi = new Human("White", "Male", "Lionel Messi", 160);
		Human ronaldo = new Human("White", "Male", "Cristiano Ronaldo", 183);

		System.out.println();
		System.out.println(messi);
		System.out.println(ronaldo);
		System.out.println();
		System.out.println("Race: "+messi.getRace());
		System.out.println("Gender: "+messi.getGender());
		System.out.println("Name: "+messi.getName());
		System.out.println("Height: "+messi.getHeight()+"cm");
		System.out.println();
		System.out.println("Race: "+ronaldo.getRace());
		System.out.println("Gender: "+ronaldo.getGender());
		System.out.println("Name: "+ronaldo.getName());
		System.out.println("Height: "+ronaldo.getHeight()+"cm");
	}
}

public class Human
{
    private String race;
    private String gender;
    private String name;
    private int height;
    
    Human(String race, String gender, String name, int height)
    {
        this.setRace(race);
        this.setGender(gender);
        this.setName(name);
        this.setHeight(height);
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

    public void setHeight(int height)
    {
        this.height = height;
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

    public int getHeight()
    {
        return height;
    }
}