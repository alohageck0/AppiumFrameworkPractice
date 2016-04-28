package PageObjectPattern;

import ObjectRepo.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
   @Test
   public void testLogin() {
      System.setProperty("webdriver.chrome.driver", "/Users/royalfiish/bin/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      RediffLoginPage loginPage = new RediffLoginPage(driver);
      loginPage.emailID().click();
      loginPage.emailID().sendKeys("Framework");
      loginPage.password().sendKeys("Password");
      loginPage.submit().click();

   }
}
