package Selenium;

/*here i will open facebook.com and practice all css selector like
 1) tag id
 2)tag class
 3)tag attribute
 4)tag class attribute
  and find elements
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //1) tag id combintion
        driver.findElement(By.cssSelector("input#email")).sendKeys("Abhishek");

        //2)tag class combination
        driver.findElement(By.cssSelector("a._8esh")).click();

        driver.navigate().back();

        //3)tag attribute combo
        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("abc");

        //4) tag class attribute combo
        driver.findElement(By.cssSelector("a._sv4[title=\"Marathi\"]")).click();
        //driver.navigate().back();
        driver.close();
    }
}
