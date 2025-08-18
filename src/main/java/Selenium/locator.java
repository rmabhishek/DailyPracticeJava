package Selenium;

/*here I am trying to do follow things.
    1)open application "https://www.demoblaze.com/index.html" in Chrome browser
    2)count total number of links present in the page and print the number
    3)Total  number of images present in the page and print the number
    4)click on any product  link using linkText/partialLinkText
      through selenium java automation
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locator {
    public static void main(String[] args) {

        //open application "https://www.demoblaze.com/index.html"
        WebDriver driver = new  ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
       // 2)count total number of links present in the page and print them (by using "a" tag)

        //here we take datatype as collection(list) because here we will hava more than one element so we choose collection and there is possibility of duplication so we take List
        //As we are working with multiple element we use "findElements" instead of "findElement"
       List<WebElement> links = driver.findElements(By.tagName("a"));  //storing all element with link
        System.out.println("Total number of links present in the page is: "+links.size());

        //3)Total  number of images present in the page (we will count with <img> tag
        List<WebElement> Image = driver.findElements(By.tagName("img"));
        System.out.println("Number of Image present in the page is: "+Image.size());

        //4)click on any product  link using linkText/partialLinkText
        driver.findElement(By.linkText("Contact")).click();

        driver.close();

    }
}
