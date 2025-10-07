package day25;

public class TestECommerceApplication
{
    public static void main(String[] args) {
        ECommApplication ecomm = new ECommApplication();
        ecomm.login().doSearch("MacBook").doAddToTheCart("MacBook").doPayment(3543534L, 345);

        System.out.println("======================");
        ECommApplication2 e2 = new ECommApplication2();
        e2.login().doSearch("iphone17");
    }
}
