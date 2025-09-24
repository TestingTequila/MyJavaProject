package day17;

public class ForLoop
{
    public static void main(String[] args) {

        System.out.println("====Printing the name 10 times=========");

        for(int x =1;x<=10;x++)
        {
            System.out.println("Ashish"); //Ashish
            //11
        }

        System.out.println("=====WAP to print the numbers from 1-10==============");


        for (int j =1;j<=10;j++)
        {
            System.out.println(j);

        }

        System.out.println("=====WAP to print the numbers from 10-1==============");


        for (int k =10;k>0;k--)
        {
            System.out.println(k);
        }

        System.out.println("=======WAP to print table of 2=======");

        for (int i =1;i<=10;i++)
        {
            System.out.println(2*i);

        }

        System.out.println("=====WAP to print the numbers from 1-10 except 5==============");


        for (int j =1;j<=10;j++)
        {
            if(j==5)
            {
                System.out.println("****");
            }
            System.out.println(j);

        }



    }
}
