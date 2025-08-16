package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    Test cases
    --------------
    1)open browser
    2)open url https://demo.opencart.com/
    3)Validate title should be "your store"
    4)close browser
 */
public class FirstTestCase {
    public static void main(String[] args) {
    //1)open browser
       // ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        //2) open url https://blinkit.com/
        driver.get("https://blinkit.com/");

       // 3)Validate title should be "your store" Everything delivered in minutes | Blinkit
        //capture title
      String act_title=  driver.getTitle();
      if (act_title.equals("Everything delivered in minutes | Blinkit")){
          System.out.println("Test Pass");
      }
      else {
          System.out.println("Test fail");
      }

      //close browser
        driver.close();
      //driver.quit();
    }
}
