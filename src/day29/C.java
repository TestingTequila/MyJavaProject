package day29;

public class C implements Base{

    @Override
    public void addition(int a, int b) {
        int sum = 3*a+b;
        System.out.println("Addition By C: "+ sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int difference = 3*a-b;
        System.out.println("Subtraction By C: "+ difference);

    }

    @Override
    public void multiplication(int a, int b) {
        int product = 3*a*b;
        System.out.println("Multiplication By C: "+ product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 3*a/b;
        System.out.println("Division By C: "+ divide);
    }
}
