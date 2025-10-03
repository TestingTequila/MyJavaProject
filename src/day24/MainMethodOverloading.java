package day24;

public class MainMethodOverloading
{
    public static void main(String[] args) {
        System.out.println("This is default main method");
    }

    public static void main(String[] args, int a) {
        System.out.println("main with string[] and int ");
    }

    public static void main(String[] args, String name) {
        System.out.println("main with string[] and String ");
    }

    public static void main(double salary) {
        System.out.println("main with double ");
    }
}
