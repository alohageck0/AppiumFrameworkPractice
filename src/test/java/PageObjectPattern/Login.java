package PageObjectPattern;

import ObjectRepo.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
   @Test
   public void Login() {
      System.setProperty("webdriver.chrome.driver", "/Users/royalfiish/bin/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get("http://rediff.com");
      RediffLoginPage rd = new RediffLoginPage(driver);

   }
}
