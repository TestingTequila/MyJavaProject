package day18;

import java.util.Arrays;

public class ArraysConcepts2WithLoops {
    public static void main(String[] args) {
        //Kerrie, Jason, Lee, Justin, Ben, Rose [group of values & of same data type]

        String[] myStudents = {"Kerrie", "Jason", "Lee", "Justin", "Ben", "Rose"};

        System.out.println("====WHILE LOOP============");
        int i = 0;
        while (i < myStudents.length) {
            System.out.println(myStudents[i]);
            i++;//5
        }

        System.out.println("====FOR LOOP============");

        for (int j = 0; j < myStudents.length; j++) {
            System.out.println(myStudents[j]);
        }

        System.out.println("====ADVANCED FOR LOOP[FOR EACH LOOP]============");
        for (String student : myStudents) {
            System.out.println(student);
        }

        System.out.println("====DIRECT PRINT============");
        System.out.println(Arrays.toString(myStudents));

    }
}
