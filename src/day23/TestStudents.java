package day23;

public class TestStudents {
    public static void main(String[] args) {
        System.out.println("=====================STUDENT1==========================");
        Students students = new Students();
        int marks = students.getStudentsMarks("John");
        System.out.println("Marks scored  by Student is: " + marks);

        System.out.println("======================STUDENT2=========================");
        Students2 students2 = new Students2();
        int marks2 = students2.getStudentsMarks("Ben");
        System.out.println("Marks scored  by Student is: " + marks2);

        System.out.println("======================STUDENT3=========================");
        Students3 students3 = new Students3();
        int marks3 = students3.getStudentsMarks("Tony");
        System.out.println("Marks scored  by Student is: " + marks3);

        System.out.println("======================STUDENT4=========================");
        Students4 students4 = new Students4();
        int marks4 =students4.getStudentsMarks("Kerrie");
        System.out.println("Marks scored  by Student is: " + marks4);

    }
}
