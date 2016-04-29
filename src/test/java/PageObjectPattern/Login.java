package PageObjectPattern;

import ObjectRepo.RediffHomePage;
import ObjectRepo.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
   private WebDriver driver;

   @BeforeTest
   public void setUp() {
      System.setProperty("webdriver.chrome.driver", "/Users/royalfiish/bin/chromedriver");
      driver = new ChromeDriver();

   }

   @Test
   public void testLogin() {

      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      RediffLoginPage loginPage = new RediffLoginPage(driver);
      loginPage.emailID().sendKeys("Framework");
      loginPage.password().sendKeys("Password");
      loginPage.submit().click();


   }

   @Test
   public void goHome() {
      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      RediffLoginPage loginPage = new RediffLoginPage(driver);
      loginPage.home().click();
      RediffHomePage homePage = new RediffHomePage(driver);
      homePage.search().sendKeys("Test search");
      homePage.searchButton().click();
   }
}
