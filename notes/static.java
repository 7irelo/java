public class Main
{

	public static void main(String[] args)
	{
		Car gclass = new Car("Merceded", "G-Wagen", 320);
		Car.drive(gclass);
	}
}

public class Car
{
    String brand;
    String name;
    int speed;
    
    Car(String brand, String name, int speed)
    {
        this.brand = brand;
        this.name = name;
        this.speed = speed;
        System.out.println("You bought a "+this.name);
    }
    static void drive(Car car)
    {
        System.out.println("You drive the "+car.name);
    }
}