package day21;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Kerrie";
        u1.age = 42;
        u1.city = "NY";

        User u2 = new User();
        u2.name = "John";
        u2.age = 32;
        u2.city = "NJ";

        User u3 = new User();
        u3.name = "Mary";
        u3.age = 24;
        u3.city = "ND";

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//John
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//Mary

        System.out.println("=====Case 1(u1=u2)=====================");

        u1 = u2;
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//John
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//John
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//Mary

        System.out.println("=====Case 2(u2=u3)=====================");
        u2 = u3;
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//John
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//Mary
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//Mary

        System.out.println("=====Case 3(u3=u1)=====================");
        u3 = u1;
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//John
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//Mary
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//John

        System.out.println("=====Case 3(u1=u2=u3)=====================");
        u1 = u2 = u3;
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//John
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//John
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//John


    }
}
