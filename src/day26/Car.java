package day26;

public class Car extends Vehicle
{
    public  void start()
    {
        System.out.println("Car -----START");
    }

    public  void stop()
    {
        System.out.println("Car -----STOP");
    }

    public  void refuel()
    {
        System.out.println("Car -----REFUEL");
    }

    public final void CarLogo()
    {
        System.out.println("Car -----Display");
    }

}

//final - To create constant value
//final - To prevent method overriding
//final - To prevent class inheritance
