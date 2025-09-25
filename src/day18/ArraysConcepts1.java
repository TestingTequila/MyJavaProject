package day18;

public class ArraysConcepts1 {
    public static void main(String[] args) {
        //12,43,56,78,98 [group of values & of same data type]

        //1. dataType[] arrayName= {value1, value2, value3, value4.......};
        //2. dataType[] arrayName = new dataType[countOfValues];

        int[] numbers = {12, 43, 56, 78, 98};

        int x = 200;

        System.out.println(x); //200

        System.out.println(numbers[0]);//12
        System.out.println(numbers[1]);//43
        System.out.println(numbers[2]);//56
        System.out.println(numbers[3]); //78
        System.out.println(numbers[4]);//98
        System.out.println("===========================");

        System.out.println(numbers.length); //5

    }
}
