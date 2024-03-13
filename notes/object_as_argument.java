package example;

public class Main
{

	public static void main(String[] args)
	{
		Car bugatti = new Car("Sport", "Volkswagen", "Chiron", 250000);
		Car tesla = new Car("Sedan", "Tesla", "Tesla", 250000);
		Garage garage = new Garage();
		garage.park(bugatti);
		garage.park(tesla);
		
	}
}

public class Car
{
    String type;
    String brand;
    String model;
    double price;

    Car(String type, String brand, String model, double price)
    {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

public class Garage
{
    String name = "garage";
    
    void park(Car bugatti)
    {
        System.out.println("The "+bugatti.model+" is parked in this "+name);
    }
}