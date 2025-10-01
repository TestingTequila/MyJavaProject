package day22;

public class EmployeeSalary
{
    public int calculateSalary(int basicSalary,int travelAllowance)
    {
        int empSalary = basicSalary + travelAllowance;
        System.out.println("empSalary: " + empSalary);
        return empSalary;
    }
}
