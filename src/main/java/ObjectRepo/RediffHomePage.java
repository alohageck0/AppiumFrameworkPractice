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
   private By searchButton = new By.ByXPath("//*[@id=\"queryTop\"]/div/input[6]");

   public WebElement search() {
      return driver.findElement(searchFireld);
   }

   public WebElement searchButton() {
      return driver.findElement(searchButton);
   }

}
