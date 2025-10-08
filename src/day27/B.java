package day27;

public class B extends A{

    String name = "Kerrie";
    public void multiplication(int a, int b)
    {
        System.out.println("Multiplication : " + (a*b));
    }

    @Override
    public void addition(int a, int b)
    {
        System.out.println("Addition : " + (2*a+b));
    }


    public static void staticM1()
    {
        System.out.println("This is static method in Class B");
    }

    public static final void staticFinalM1()
    {
        System.out.println("This is static method in Class B");
    }
}
