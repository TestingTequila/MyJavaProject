package day16;

public class SwitchStatement4
{
    public static void main(String[] args) {
        String browserName = "Safari";
        switch (browserName)
        {
            case "Firefox":
                System.out.println("Launch Firefox browser...");
                break;
            case "Chrome":
                System.out.println("Launch Chrome browser....");
                break;
            case "Edge":
                System.out.println("Launch Edge browser....");
                break;
            case "IE":
                System.out.println("Launch IE browser....");
                break;
            case "Safari":
                System.out.println("Launch Safari browser....");
                break;
            default:
                System.out.println("Not a valid browser name...");
                break;

        }
    }
}
