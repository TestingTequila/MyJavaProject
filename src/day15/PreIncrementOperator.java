package day15;

public class PreIncrementOperator {
    public static void main(String[] args) {

        // pre Increment
        int a = 1;
        int b = ++a;

        System.out.println(a);//2
        System.out.println(b);//2

        int c = 100;
        int d = ++c;

        System.out.println(c); //101
        System.out.println(d); //101


        int e = -99;
        int f = ++e;

        System.out.println(e); //-98
        System.out.println(f); //-98

        int g = 10;
        int h = ++g;
        System.out.println(g); //11
        System.out.println(h); //11


    }
}
