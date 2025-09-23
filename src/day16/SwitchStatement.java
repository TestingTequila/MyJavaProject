package day16;

public class SwitchStatement
{
    public static void main(String[] args) {
        int marks = 90;

        switch (marks)
        {
            case 90:
                System.out.println("Student has scored grade A++");
                break;
            case 80:
                System.out.println("Student has scored grade A+");
                break;
            case 70:
                System.out.println("Student has scored grade A");
                break;
            case 60:
                System.out.println("Student has scored grade B++");
                break;
            case 50:
                System.out.println("student has scored grade B+");
                break;
            case 40:
                System.out.println("Student has scored grade B");
                break;
            default:
                System.out.println("Better Luck next time....");
                break;
        }
    }

}
