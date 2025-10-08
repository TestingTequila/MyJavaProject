package day27;

public class A
{
    String name = "Jason";
    public void addition(int a, int b)
    {
        System.out.println("Addition : " + (a+b));
    }

    public void subtraction(int a, int b)
    {
        System.out.println("Subtraction : " + (a-b));
    }

    public final void finalM1()
    {
        System.out.println("This is final method in Class A");
    }

    public static void staticM1()
    {
        System.out.println("This is static method in Class A");
    }
}
