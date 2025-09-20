package day15;

public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Jason"; // String literals
        String message = "We have Java class tonight";

        System.out.println(name);
        System.out.println(message);
        System.out.println("This is my latest message");

        System.out.println("======================================");

        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println(x);//Hello
        System.out.println(y); //World

        System.out.println(a); //100
        System.out.println(b); //200

        System.out.println(x + y);//Hello + World => HelloWorld
        System.out.println(a + b); //100+200 => 300
        System.out.println(x + a); //Hello + 100 => Hello100
        System.out.println(a + x); //100 + Hello => 100Hello
        System.out.println(a + b + x + y); //300HelloWorld
        System.out.println(x + y + a + b); //HelloWorld100200
        System.out.println(a + b + x + y + a + b); //300HelloWorld100200

        double d1 = 12.34;
        double d2 = 13.43;

        System.out.println(a + d1 + x + y + d1 + d2 + a + b);//112.34HelloWorld12.3413.43100200

        System.out.println(x + a * b);// Hello2000
        System.out.println(x + b / a); //Hello2
        //System.out.println((x+b)/a);  //(Hello200)/100 => Compile Time Error
    }
}
// */ > +-