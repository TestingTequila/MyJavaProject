package day23;

public class BrowserTypes4 {
    public String launchBrowser(String browserName) {
        String browser = " ";
        switch (browserName) {
            case "Edge":
                browser = "Edge";
                break;
            case "Chrome":
                browser = "Chrome";
                break;
            case "Firefox":
                browser = "Firefox";
                break;
            case "IE":
                browser = "IE";
                break;
            case "Safari":
                browser = "Safari";
                break;
        }
        return browser;
    }
}
