package day23;

public class BrowserTypes
{
    public String launchBrowser(String browserName)
    {
        if(browserName.equals("Edge"))
        {
            return "Edge";
        }
        else if (browserName.equals("Chrome")) {
            return "Chrome";
        }
        else if (browserName.equals("Firefox")) {
            return "Firefox";
        }
        else if (browserName.equals("IE")) {
            return "IE";
        }
        else if (browserName.equals("Safari")) {
            return "Safari";
        }
        return browserName;
    }
}
