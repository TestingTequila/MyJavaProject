package day17;

public class WhileLoop
{
    public static void main(String[] args) {

        System.out.println("====Printing the name 10 times=========");
        int x =1;
        while(x<=10)
        {
            System.out.println("Ashish"); //Ashish
            x++;//11
        }

        System.out.println("=====WAP to print the numbers from 1-10==============");

        int j =1;
        while (j<=10)
        {
            System.out.println(j);
            j++;
        }

        System.out.println("=====WAP to print the numbers from 10-1==============");

        int k =10;
        while (k>0)
        {
            System.out.println(k);
            k--;
        }

        System.out.println("=======WAP to print table of 2=======");

        int i =1;
        while (i<=10)
        {
            System.out.println(2*i);//2, 4, 6, 8, 10, 12, 14, 16, 18, 20
            i++;
        }


        System.out.println("=======WAP to print table of 2 without using I/D operator=======");

        int l =2;
        while (l<=20)
        {
            System.out.println(l);//2, 4
            l = l +2;//6
        }
    }
}
