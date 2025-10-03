package day24;

public class Calculations
{
    public void addition(double a, int b)
    {
        System.out.println("method with double & int inputs: " + a + " and " + b);
    }

    public void addition(int a, double b)
    {
        System.out.println("method with int & double inputs: " + a + " and " + b);
    }

    public void addition(int a, int b)
    {
        System.out.println("method with two int inputs: " + a + " and " + b);
    }

    public void addition(double a, double b)
    {
        System.out.println("method with two double inputs: " + a + " and " + b);
    }

    public void addition(int a, int b, int c)
    {
        System.out.println("method with 3 int inputs: " + a + " and " + b + " and " + c);
    }

//    public int addition(int a, int b, int c)
//    {
//        System.out.println("method with two int inputs" + a + " and " + b);
//        return a;
//    }

}
