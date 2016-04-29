package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

   private WebDriver driver;

   public RediffHomePage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);

   }


   @FindBy(name = "srchword")
   WebElement searchField;

   @FindBy(xpath = "//*[@id=\"queryTop\"]/div/input[6]")
   WebElement searchButton;

   public WebElement search() {
      return searchField;
   }

   public WebElement searchButton() {
      return searchButton;
   }

}
