package day25;

public class ECommApplication
{
    public ECommApplication login()
    {
        System.out.println("Login to app");
        return this;
    }
    public ECommApplication login(String un, String pw)
    {
        System.out.println("Login to app" + un + " and pw as : " + pw);
        return this;
    }
    public ECommApplication doSearch(String productName)
    {
        System.out.println("Search the product" + productName);
        return this;
    }
    public ECommApplication doSearch(String productName, int price)
    {
        System.out.println("Search the product" + productName + " and price " + price);
        return this;
    }
    public ECommApplication doAddToTheCart(String productName)
    {
        System.out.println("Add the product" + productName);
        return this;
    }

    public ECommApplication doPayment(long ccNumber, int cvv)
    {
        System.out.println("Make the Payment: " + ccNumber + " and Cvv: " + cvv);
        return this;
    }
}
