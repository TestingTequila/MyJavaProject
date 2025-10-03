package day23;

public class BrowserTypes2 {
    public String launchBrowser(String browserName) {
        switch (browserName) {
            case "Edge":
                return "Edge";
            case "Chrome":
                return "Chrome";
            case "Firefox":
                return "Firefox";
            case "IE":
                return "IE";
            case "Safari":
                return "Safari";
        }
        return browserName;
    }
}
