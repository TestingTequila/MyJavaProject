package day27;

public class Company extends  Customer{

    @Override
    public  void m1(int age)
    {
        System.out.println("Company m1 method..." + age);
    }

    public  void m1(int age, String name)
    {
        System.out.println("Company m1 method..." + age + " Name: " + name);
    }
}
