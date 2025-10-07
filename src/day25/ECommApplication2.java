package day25;

public class ECommApplication2
{
    public ECommApplication2 login()
    {
        System.out.println("Login to app");
        return new ECommApplication2();
    }
    public ECommApplication2 login(String un, String pw)
    {
        System.out.println("Login to app" + un + " and pw as : " + pw);
        return new ECommApplication2();
    }
    public ECommApplication2 doSearch(String productName)
    {
        System.out.println("Search the product" + productName);
        return new ECommApplication2();
    }
    public ECommApplication2 doSearch(String productName, int price)
    {
        System.out.println("Search the product" + productName + " and price " + price);
        return new ECommApplication2();
    }
    public ECommApplication2 doAddToTheCart(String productName)
    {
        System.out.println("Add the product" + productName);
        return new ECommApplication2();
    }

    public ECommApplication2 doPayment(long ccNumber, int cvv)
    {
        System.out.println("Make the Payment: " + ccNumber + " and Cvv: " + cvv);
        return new ECommApplication2();
    }
}
