package day29;

public class TestInterface {
    public static void main(String[] args) {
        System.out.println("=====Class A Object======");
        A a = new A();
        a.addition(12,4);
        a.subtraction(12,4);
        a.multiplication(12,4);
        a.division(12,4);

        System.out.println("=====Class B Object======");
        B b = new B();
        b.addition(12,4);
        b.subtraction(12,4);
        b.multiplication(12,4);
        b.division(12,4);

        System.out.println("=====Class C Object======");
        C c = new C();
        c.addition(12,4);
        c.subtraction(12,4);
        c.multiplication(12,4);
        c.division(12,4);

        System.out.println("=====Class D Object======");
        D d = new D();
        d.addition(12,4);
        d.subtraction(12,4);
        d.multiplication(12,4);
        d.division(12,4);

        //Base base  = new Base(); WE cannot create object of an interface

        System.out.println("====Top casting with A====");
        Base base = new A();
        Base base1= new B();
        Base base2= new C();
        Base base3= new D();

    }
}
