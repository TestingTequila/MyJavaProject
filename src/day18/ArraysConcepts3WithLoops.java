package day18;

import java.util.Arrays;

public class ArraysConcepts3WithLoops {
    public static void main(String[] args) {
        //a,e,i,o,u
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("====WHILE LOOP============");
        int i = 0;
        while (i < vowels.length) {
            System.out.println(vowels[i]);
            i++;//5
        }

        System.out.println("====FOR LOOP============");

        for (int j = 0; j < vowels.length; j++) {
            System.out.println(vowels[j]);
        }

        System.out.println("====ADVANCED FOR LOOP[FOR EACH LOOP]============");
        for (char vowel : vowels) {
            System.out.println(vowel);
        }

        System.out.println("====DIRECT PRINT============");
        System.out.println(Arrays.toString(vowels));

    }
}
