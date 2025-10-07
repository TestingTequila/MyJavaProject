package day25;

public class TestCallByValueReference
{
    public static void main(String[] args) {
        System.out.println("============================================");
        CallByValueReference callByValueReference= new CallByValueReference(100, 200);
        //callByValueReference.addition(12,8);
        System.out.println(callByValueReference.getA() + callByValueReference.getB());

        System.out.println("=====================Updating object through setter method=======================");
        callByValueReference.setA(1000);
        callByValueReference.setB(2000);
        System.out.println(callByValueReference.getA() + callByValueReference.getB());

        System.out.println("=====================Updating object through Call By Reference=======================");
        CallByValueReference callByValueReference2= new CallByValueReference(100, 200);
        callByValueReference2.updateObject(callByValueReference2, 5, 10);
        System.out.println(callByValueReference2.getA() + callByValueReference2.getB());



    }
}
