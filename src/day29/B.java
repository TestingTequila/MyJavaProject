package day29;

public class B implements Base{

    @Override
    public void addition(int a, int b) {
        int sum = 2*a+b;
        System.out.println("Addition By B: "+ sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int difference = 2*a-b;
        System.out.println("Subtraction By B: "+ difference);

    }

    @Override
    public void multiplication(int a, int b) {
        int product = 2*a*b;
        System.out.println("Multiplication By B: "+ product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 2*a/b;
        System.out.println("Division By B: "+ divide);
    }
}
