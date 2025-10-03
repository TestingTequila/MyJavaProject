package day23;

public class Students3
{


    public int getStudentsMarks(String studentName)
    {
        int marks= -1;

        if(studentName.equals("Justin"))
        {
            marks= 96;
        }
        else if (studentName.equals("Kerrie"))
        {
            marks= 65;
        }
        else if (studentName.equals("John"))
        {
            marks= 87;
        }
        else if (studentName.equals("Ben"))
        {
            marks= 88;
        }
        else if (studentName.equals("Mary"))
        {
            marks= 99;
        }
        return marks;
    }
}
