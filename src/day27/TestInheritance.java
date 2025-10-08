package day27;

public class TestInheritance
{
    public static void main(String[] args) {

        System.out.println("======PARENT CLASS A====");
        A a = new A();
        a.addition(12,4); // 16
        a.subtraction(12,4);
        a.finalM1();
        A.staticM1(); //This is static method in Class A
        System.out.println(a.name); //Jason

        System.out.println("======CHILD CLASS B====");

        B b = new B();
        b.addition(12,4);//28
        b.subtraction(12,4);
        b.multiplication(12,4);
        b.finalM1();
        B.staticM1(); //This is static method in Class B
        b.staticM1(); //This is static method in Class B
        System.out.println(b.name); // Kerrie

        System.out.println("======PARENT- CHILD TOP CASTING====");

        A a1 = new B();
        a1.addition(12,4); //28
        a1.subtraction(12,4);
        a1.finalM1();
        A.staticM1(); //This is static method in Class A
        a1.staticM1();//This is static method in Class A
        System.out.println(a1.name); //Jason

    }
}
