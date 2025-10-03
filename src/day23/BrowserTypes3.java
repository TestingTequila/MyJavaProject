package day23;

public class BrowserTypes3
{
    public String launchBrowser(String browserName)
    {
        String browser = "";
        
        if(browserName.equals("Edge"))
        {
            browser= "Edge";
        }
        else if (browserName.equals("Chrome")) {
            browser=  "Chrome";
        }
        else if (browserName.equals("Firefox")) {
            browser=  "Firefox";
        }
        else if (browserName.equals("IE")) {
            browser=  "IE";
        }
        else if (browserName.equals("Safari")) {
            browser=  "Safari";
        }
        return browser;
    }
}
