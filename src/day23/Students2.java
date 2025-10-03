package day23;

public class Students2 {


    public int getStudentsMarks(String studentName) {
        switch (studentName) {
            case "Justin":
                return 98;
            case "Kerrie":
                return 76;
            case "John":
                return 58;
            case "Mary":
                return 99;
            case "Ben":
                return 63;
        }
        return -1;
    }
}
