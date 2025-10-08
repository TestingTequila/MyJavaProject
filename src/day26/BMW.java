package day26;

public class BMW extends Car{

    @Override
    public  void start()
    {
        System.out.println("BMW -----START");
    }

    public  void autoParking()
    {
        System.out.println("BMW -----AUTO-PARKING");
    }

    @Override
    public  void sunroof()
    {
        System.out.println("BMW Sun roof...");
    }


}
