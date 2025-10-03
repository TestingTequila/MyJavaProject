package day23;

public class Students
{


    public int getStudentsMarks(String studentName)
    {
        if(studentName.equals("Justin"))
        {
            return 96;
        }
        else if (studentName.equals("Kerrie"))
        {
            return 65;
        }
        else if (studentName.equals("John"))
        {
            return 87;
        }
        else if (studentName.equals("Ben"))
        {
            return 88;
        }
        else if (studentName.equals("Mary"))
        {
            return 99;
        }
        else {
            return -1;
        }
    }
}
