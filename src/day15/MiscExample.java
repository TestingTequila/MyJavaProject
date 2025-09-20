package day15;

public class MiscExample {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = ++c1;
        System.out.println(c1);//b
        System.out.println(c2);//b


        int n = 10;
        System.out.println(n++);//10
        System.out.println(n);  //11


        int i = 100;
        System.out.println(++i);//101
        System.out.println(i); //101


        int j = 78;
        System.out.println(--j);//77
        System.out.println(j);//77
    }
}
