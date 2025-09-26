package day20;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Tito";
        emp1.age = 32;
        emp1.city = "Oklahoma";
        emp1.salary = 10000;

        System.out.println("========================");
        Employee emp2= new Employee();
        emp2.name = "Tom";
        emp2.age = 21;
        emp2.city = "NY";
        emp2.salary = 2500;

        System.out.println("=======================");
        Employee emp3= new Employee();
        emp3.name = "Roger";
        emp3.age = 44;
        emp3.city = "NJ";
        emp3.salary = 25000;

        System.out.println(emp3.name);
        System.out.println(emp3.age);
        System.out.println(emp3.city);
        System.out.println(emp3.salary);

        System.out.println("*************emp3 = null*************");
        emp3 = null;

        System.out.println(emp3.name);
        System.out.println(emp3.age);
        System.out.println(emp3.city);
        System.out.println(emp3.salary);

        System.gc();


        System.out.println("=============Scenarios======================");

        //1. Can we create object without naming it [can we create object without reference variables]

        new Employee().name = "Justin";
        new Employee().age = 33;
        new Employee().city = "Ohio";
        new Employee().salary = 20000;

    }
}
