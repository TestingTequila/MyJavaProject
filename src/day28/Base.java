package day28;

public abstract class Base
{
    public abstract void addition(int a, int b);

    public void subtraction(int a, int b)
    {
        int difference = a-b;
        System.out.println("SUBTRACTION: " + difference);
    }
    public void multiplication(int a, int b)
    {
        int product = a*b;
        System.out.println("SUBTRACTION: " + product);
    }
    public void division(int a, int b)
    {
        int divide = a/b;
        System.out.println("DIVISION: " + divide);
    }
}
