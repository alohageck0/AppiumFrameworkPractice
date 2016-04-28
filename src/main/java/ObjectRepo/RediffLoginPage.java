package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RediffLoginPage {

   WebDriver driver;

   public RediffLoginPage(WebDriver driver) {
      this.driver = driver;

   }

   By username = new By.ByXPath("//*[@id=\"login1\"]");
   By password = new By.ByName("passwd");
   By goButton = new By.ByName("proceed");

}
