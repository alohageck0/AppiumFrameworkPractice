package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

   private WebDriver driver;

   public RediffLoginPage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);

   }


   @FindBy(xpath = "//*[@id=\"login1\"]")
   WebElement username;

   @FindBy(name = "passwd")
   WebElement password;

   @FindBy(name = "proceed")
   WebElement goButton;

   @FindBy(linkText = "Home")
   WebElement home;


   public WebElement emailID() {
      return username;
   }

   public WebElement password() {
      return password;
   }

   public WebElement submit() {
      return goButton;
   }

   public WebElement home() {
      return home;
   }

}