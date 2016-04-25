package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Anot2 {
   @BeforeSuite
   public void Install() {
      System.out.println("Installing application");
   }

   @AfterSuite
   public void Uninstall(){
      System.out.println("Delete application");
   }

   @Test
   public void ThisIsTest(){
      System.out.println("Test run");
   }
}
