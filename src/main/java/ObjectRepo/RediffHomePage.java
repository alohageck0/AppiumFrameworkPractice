package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

   private WebDriver driver;

   public RediffHomePage(WebDriver driver) {
      this.driver = driver;

   }

   private By searchFireld = new By.ByName("srchword");


   public WebElement search() {
      return driver.findElement(searchFireld);
   }

}
