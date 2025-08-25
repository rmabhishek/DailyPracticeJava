package Selenium;
/*
    here i try to open https://testautomationpractice.blogspot.com site through automate software
    after opening perform Webelements method of Selenium.
    Here i applied (practice) get(),conditional() and driver() methods of selenium Webelements method
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //get() method
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //getTitle() method
        System.out.println(driver.getTitle());

        //getCurrentUrl() method
        System.out.println(driver.getCurrentUrl());
        //getPageSource method
       // System.out.println(driver.getPageSource());

        //getWindowHandle() method
        String windowId = driver.getWindowHandle();
        System.out.println("WindowId : "+windowId);


        //Conditional method
        //isDisplayed() method
        boolean display_status = driver.findElement(By.linkText( "GUI Elements")).isDisplayed();  //here isDisplay shows is the element(here GUI Elements) present or not on display
        System.out.println("Display Status: "+display_status); //true

        //isEnabled()
        boolean fname = driver.findElement(By.xpath("//input[@id='name']")).isEnabled(); //here w will check is firstname box enabled or not
        System.out.println("Firstname enabled: "+fname); //true

        //checking Submit button enabled or not as sometime submit button enable after entering all value
        boolean submitButton = driver.findElement(By.xpath("//button[@class='submit-btn']")).isEnabled();
        System.out.println("Submit Button Enable Status: "+submitButton);

        //isSelected()
        //checking gender radio button selected or not

        //before selecting any button
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));
        //checking radiobutton selected or not
        System.out.println(male_rd.isSelected());  //false
        System.out.println(female_rd.isSelected());  //false
        //After selecting maleradio button
        System.out.println("After selecting male radio button:  ");
        male_rd.click();
        System.out.println(male_rd.isSelected());  //true
        System.out.println(female_rd.isSelected()); //false

        //After selecting femalerd button
        System.out.println("After selecting female radio button:  ");
        female_rd.click();
        System.out.println(male_rd.isSelected());  //false
        System.out.println(female_rd.isSelected()); //true

        //browser method
        driver.close();


    }

}
