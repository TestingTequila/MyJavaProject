package day18;

import java.util.Arrays;

public class ArraysConcepts4WithLoops {
    public static void main(String[] args) {
        String[] tabs = {"HOME", "GIFT CERTIFICATES", "BRANDS", "BLOGS", "CONTACT US"};

        System.out.println("====WHILE LOOP============");
        int i = 0;
        while (i < tabs.length) {
            System.out.println(tabs[i]);
            i++;//5
        }

        System.out.println("====FOR LOOP============");

        for (int j = 0; j < tabs.length; j++) {
            System.out.println(tabs[j]);
        }

        System.out.println("====ADVANCED FOR LOOP[FOR EACH LOOP]============");
        for (String tab : tabs) {
            System.out.println(tab);
        }

        System.out.println("====DIRECT PRINT============");
        System.out.println(Arrays.toString(tabs));

    }
}
