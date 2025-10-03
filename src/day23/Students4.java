package day23;

public class Students4 {


    public int getStudentsMarks(String studentName) {
        int marks = -1;
        switch (studentName) {
            case "Justin":
                marks = 98;
                break;
            case "Kerrie":
                marks = 100;
                break;
            case "John":
                marks = 58;
                break;
            case "Mary":
                marks = 99;
                break;
            case "Ben":
                marks = 63;
                break;
        }
        return marks;
    }
}
