package day28;

public class B extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 2*a+b;
        System.out.println("Sum By B: " + sum);
    }
}
