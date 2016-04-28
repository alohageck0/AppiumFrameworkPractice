package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

   private WebDriver driver;

   public RediffLoginPage(WebDriver driver) {
      this.driver = driver;

   }

   private By username = new By.ByXPath("//*[@id=\"login1\"]");
   private By password = new By.ByName("passwd");
   private By goButton = new By.ByName("proceed");
   private By home = new By.ByLinkText("Home");

   public WebElement emailID() {
      return driver.findElement(username);
   }

   public WebElement password() {
      return driver.findElement(password);
   }

   public WebElement submit() {
      return driver.findElement(goButton);
   }

   public WebElement home() {
      return driver.findElement(home);
   }

}
