package day26;

public class TestInheritance {
    public static void main(String[] args) {

        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("======CHILD CLASS BMW OBJECT=============");
        BMW bmw = new BMW();
        bmw.start(); //BMW ---START [inherited--> overridden]
        bmw.stop();  //CAR ---STOP  [inherited]
        bmw.refuel();//CAR ---REFUEL  [inherited]
        bmw.autoParking(); // self method of BMW
        bmw.CarLogo();//Car ---DISPLAY

        System.out.println("======PARENT CLASS CAR OBJECT=============");
        Car car = new Car();
        car.start(); //Car ---START
        car.stop();  //Car ---STOP
        car.refuel(); //Car ---REFUEL
        car.CarLogo();//Car ---DISPLAY

        System.out.println("======TOP CASTING B/W PC[Car] & CC[BMW]=============");
        Car car1 =new BMW();
        car1.start(); //BMW ---START
        car1.stop();  //Car ---STOP
        car1.refuel();//Car ---REFUEL
        car1.CarLogo();//Car ---DISPLAY


        System.out.println("======DOWN CASTING B/W PC[Car] & CC[BMW]=============");


        //BMW bmw = new Car(); // Down-Casting is not allowed in Java
        BMW bmw1 = (BMW)new Car(); //Down-casting seems to allowed at compile time
        //bmw1.autoParking(); //But at runtime this will give ClassCastException

    }
}
