package day16;

public class IfElseIfStatement {
    public static void main(String[] args) {

        int marks = 17;
        if(marks>90)
        {
            System.out.println("The student has scored A++ ");
        }
        else if (marks<=90 && marks>80)
        {
            System.out.println("The student has score A+");
        }
        else if (marks<=80 && marks>70)
        {
            System.out.println("The student has score A");
        }
        else if (marks<=70 && marks>60)
        {
            System.out.println("The student has score B++");
        }
        else if (marks<=60 && marks>50)
        {
            System.out.println("The student has score B+");
        }
        else if (marks<=50 && marks>40)
        {
            System.out.println("The student has score B");
        }
        else
        {
            System.out.println("Better luck next time....");
        }
    }
}
