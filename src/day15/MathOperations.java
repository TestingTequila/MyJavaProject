package day15;

public class MathOperations {
    public static void main(String[] args) {

        System.out.println("====I/I = I part======");
        //1. I/I = I part
        int a = 10;
        int b = 2;
        int c = 3;
        int d = 5;

        System.out.println(a / b); //10/2 => 5
        System.out.println(a / c);  //10/3 =>3

        System.out.println(a / d); //10/5 => 2
        System.out.println(d / b); //5/2 => 2

        System.out.println(10 / 2); //5
        System.out.println(10 / 3); //3
        System.out.println(5 / 2);  //2

        System.out.println("====I/D or D/I or D/D = I+D Part======");

        //2. I/D or D/I or D/D = I+D Part

        int i1 = 10;
        double i2 = 3.0;
        double i3 = 5.0;
        System.out.println(i1 / i2);//10/3.0=>3.333333333
        System.out.println(i2 / i1); //3.0/10 =>0.3
        System.out.println(i3 / i2); // 5.0/3.0 => 1.66666666666666


        int a1 = 10;
        int b1 = 2;
        int c1 = 3;
        double sum = a1 / c1;
        System.out.println(sum);//3.0


        System.out.println("====Modulo======");
        System.out.println(a % c); //10%3 => 1
        System.out.println(a % b); //10%2 => 0
        System.out.println(i1 % i2); //10%3.0 => 1.0
        System.out.println(i1 % i3); //10%5.0 => 0.0
        System.out.println(10 % 3.1);  //0.6999999999999997
        System.out.println(9.2 % 2);   //1.1999999999999993

    }
}
