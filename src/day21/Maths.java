package day21;

public class Maths {
    int a; //Can be accessed outside this clas as its public
    int b;

    private  int c; //Cannot be accessed outside this clas as its private

    public void addition() {
        int sum = a + b;
        System.out.println("SUM: " + sum);
    }

    public void subtraction() {
        int subtract = a - b;
        System.out.println("SUBTRACTION: " + subtract);
    }

    private void multiplication() {
        int product = a * b;
        System.out.println("MULTIPLICATION: " + product);
    }


}
