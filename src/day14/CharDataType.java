package day14;

public class CharDataType {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'y';
        char c3 = 'n';
        char c4 = '1';

        System.out.println(c1); //a
        System.out.println(c2); //y
        System.out.println(c3); //n
        System.out.println(c4); //1

        System.out.println("=====================================");

        char r1 = 'a';
        char r2 = 'b';
        System.out.println(r1); //a
        System.out.println(r2); //b

        System.out.println(r1 + r2); // 97+98 =195

        System.out.println("==========================");
        char r3 = '1';
        char r4 = '2';
        int i1 =5;
        System.out.println(r3); //1
        System.out.println(r4); //2
        System.out.println(r3+r4); // 49 +50 =99
        System.out.println(r3+r4+i1); //49 +50+ 5 = 104
        System.out.println(r3+i1); //49+5 = 54
        System.out.println(r3*i1); //49*5 = 245

        System.out.println("=======Without ASCII table===========");
        System.out.println((int)'a');//97
        System.out.println((char)97); //a

        System.out.println("===========Calculations===============");
        System.out.println((int)'a' + (int)'b');//97+ 98 = 195
        System.out.println('a' + 'b'); //97+98 =195
        System.out.println((char)97 + (char)98); //195
        System.out.println('a' + 5); // 97+5 =102



    }
}


// 2 byte, range {a-z, A-Z, 1-9, !@#$%^&*()_-+}