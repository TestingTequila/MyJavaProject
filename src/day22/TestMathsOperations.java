package day22;

public class TestMathsOperations
{
    public static void main(String[] args) {
        System.out.println("======global variables example==========");
      MathsOperations mathsOperations = new MathsOperations();
      mathsOperations.a =12;
      mathsOperations.b =4;
      mathsOperations.addition();//16
      mathsOperations.subtraction();//8
      mathsOperations.multiplication();//96
      mathsOperations.division();//3

        System.out.println("**********************************");
        MathsOperations mo = new MathsOperations();
        mo.a =8;
        mo.b=4;
        mo.addition();//12
        mo.subtraction();//4
        mo.multiplication();//32
        mo.division();//2

        System.out.println("======parameters example==========");
        MathsOperations2 mathsOperations2 = new MathsOperations2();
        mathsOperations2.addition(12,8);
        mathsOperations2.subtraction(20,6);
        mathsOperations2.multiplication(2,5);
        mathsOperations2.division(12,4);

        System.out.println("**********************************");
        MathsOperations2 mo2 = new MathsOperations2();
        mo2.addition(33,7);//40
        mo2.subtraction(56,6);//50
        mo2.multiplication(9,3);//27
        mo2.division(9,3);//3

        System.out.println("======local variables example==========");
       MathsOperations3 mathsOperations3 = new MathsOperations3();
        mathsOperations3.addition();//20
        mathsOperations3.subtraction();//14
        mathsOperations3.multiplication();//20
        mathsOperations3.division();//3

        System.out.println("**********************************");

        MathsOperations3 mo3 = new MathsOperations3();
        mo3.addition();//20
        mo3.subtraction();//14
        mo3.multiplication();//20
        mo3.division();//3

        System.out.println("============================================");
        MathsOperations4 mathsOperations4 = new MathsOperations4();
        mathsOperations4.a =12;
        mathsOperations4.b =4;
        //int add1 =mathsOperations4.addition1(); //void-->16

        int add2 =mathsOperations4.addition2(); //int-->16
        System.out.println("add2: " + add2);
        System.out.println(add2*5);

        System.out.println("===ReturnType Concept==================");
        EmployeeSalary employeeSalary =new EmployeeSalary();
        int emp1Salary =employeeSalary.calculateSalary(1200, 800);
        System.out.println("Salary With Bonus: "+ (emp1Salary + 1000));

        System.out.println("======Return Type Concept---> Employee Details=====");
        EmployeeDetails employeeDetails = new EmployeeDetails();
        String firstName=employeeDetails.empName("Ashish", "Mishra");
        System.out.println("Name on Id Card: " + firstName + " Medma");
    }
}
