package day15;

public class PreDecrementOperator {
    public static void main(String[] args) {

        // pre Decrement
        int a = 1;
        int b = --a;

        System.out.println(a);//0
        System.out.println(b);//0

        int c = 100;
        int d = --c;

        System.out.println(c); //99
        System.out.println(d); //99


        int e = -99;
        int f = --e;

        System.out.println(e); //-100
        System.out.println(f); //-100

        int g = 10;
        int h = --g;
        System.out.println(g); //9
        System.out.println(h); //9


    }
}
