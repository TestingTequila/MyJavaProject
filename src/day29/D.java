package day29;

public class D implements Base {
    @Override
    public void addition(int a, int b) {
        int sum = 4*a+b;
        System.out.println("Addition By D: "+ sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int difference = 4*a-b;
        System.out.println("Subtraction By D: "+ difference);

    }

    @Override
    public void multiplication(int a, int b) {
        int product = 4*a*b;
        System.out.println("Multiplication By D: "+ product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 4*a/b;
        System.out.println("Division By D: "+ divide);
    }
}
