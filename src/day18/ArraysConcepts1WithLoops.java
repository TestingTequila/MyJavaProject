package day18;

import java.util.Arrays;

public class ArraysConcepts1WithLoops {
    public static void main(String[] args) {
        //12,43,56,78,98 [group of values & of same data type]

        //1. dataType[] arrayName= {value1, value2, value3, value4.......};
        //2. dataType[] arrayName = new dataType[countOfValues];

        int[] numbers = {12, 43, 56, 78, 98};

        System.out.println("====WHILE LOOP============");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);//12, 43, 56, 78, 98
            i++;//5
        }

        System.out.println("====FOR LOOP============");

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);//12, 43, 56, 78, 98
        }

        System.out.println("====ADVANCED FOR LOOP[FOR EACH LOOP]============");
        for (int num : numbers) {
            System.out.println(num);//12, 43, 56, 78, 98
        }

        System.out.println("====DIRECT PRINT============");
        System.out.println(Arrays.toString(numbers));
    }
}
