package Selenium;

//here we wil open Chrome browser through selenium and open demo.nopcommerce.com and validate the title and close the browser through automation
/*
    1)Launch Browser(Chrome)
    2)open url "https://demo.nopcommerce.com/"
    3)validate title should be "nopcommerce demo store"
    4)close page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerceopenautomate {
    public static void main(String[] args) {
        //1) Open browser
        WebDriver driver = new ChromeDriver();
        //2)open https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");
        //3) Validate Title
        String sActualTitle = driver.getTitle();
        if (sActualTitle.equals("nopCommerce demo store. Home page title")){
            System.out.println("Test Pass");
        }
        else
            System.out.println("Test Fail");

        //4)close page
        driver.close();
    }
}
