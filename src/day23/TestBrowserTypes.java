package day23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBrowserTypes {
    public static void main(String[] args) {
        System.out.println("======BROWSER TYPE===================");
        BrowserTypes browserType = new BrowserTypes();
        String browser = browserType.launchBrowser("Chrome");
        if (browser.equals("Edge") || browser.equals("Chrome") || browser.equals("Firefox") || browser.equals("IE") || browser.equals("Safari")) {
            System.out.println("Launching....." + browser);
        } else {
            System.out.println(browser + ": is not a valid browser Name");
        }

        System.out.println("======BROWSER TYPE2===================");
        BrowserTypes2 browserType2 = new BrowserTypes2();
        String browser2 = browserType2.launchBrowser("XYZ");
        if (browser2.equals("Edge") || browser2.equals("Chrome") || browser2.equals("Firefox") || browser2.equals("IE") || browser2.equals("Safari")) {
            System.out.println("Launching....." + browser2);
        } else {
            System.out.println(browser2 + ": is not a valid browser Name");
        }

        System.out.println("======BROWSER TYPE3===================");
        BrowserTypes3 browserType3 = new BrowserTypes3();
        String browser3 = browserType3.launchBrowser("Safari");
        if (browser3.equals("Edge") || browser3.equals("Chrome") || browser3.equals("Firefox") || browser3.equals("IE") || browser3.equals("Safari")) {
            System.out.println("Launching....." + browser3);
        } else {
            System.out.println(browser3 + ": is not a valid browser Name");
        }

        System.out.println("======BROWSER TYPE4===================");
        BrowserTypes4 browserType4 = new BrowserTypes4();
        String browser4 = browserType4.launchBrowser("XYZ");
        if (browser4.equals("Edge") || browser4.equals("Chrome") || browser4.equals("Firefox") || browser4.equals("IE") || browser3.equals("Safari")) {
            System.out.println("Launching....." + browser4);
        } else {
            System.out.println(browser4 + ": is not a valid browser Name");
        }


        System.out.println("===========EMPLOYEE==================");
        Employees employee = new Employees();
        String[] devices = employee.getEmployeeDevices("Ben");
        System.out.println(Arrays.toString(devices));
    }
}
