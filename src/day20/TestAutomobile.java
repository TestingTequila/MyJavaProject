package day20;

public class TestAutomobile
{
    public static void main(String[] args) {
        Automobile auto1= new Automobile();
        auto1.AutomobileType = "Car";
        auto1.engineCapacity = 1000;
        auto1.fuelType = "Petrol";
        auto1.isAutomatic = true;

        System.out.println(auto1.AutomobileType);
        System.out.println(auto1.engineCapacity);
        System.out.println(auto1.fuelType);
        System.out.println(auto1.isAutomatic);

        System.out.println("======================================");

        Automobile auto2= new Automobile();
        auto2.AutomobileType = "Truck";
        auto2.engineCapacity = 5000;
        auto2.isAutomatic = false;
        auto2.fuelType = "Diesel";

        System.out.println(auto2.AutomobileType);
        System.out.println(auto2.engineCapacity);
        System.out.println(auto2.isAutomatic);
        System.out.println(auto2.fuelType);

        System.out.println("================================");
        Employee emp1= new Employee();

    }
}
