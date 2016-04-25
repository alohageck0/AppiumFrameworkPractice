package TestNGFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Anot2 {
   @BeforeSuite
   public void Install() {
      System.out.println("Installing application");
   }

   @AfterSuite
   public void Uninstall(){
      System.out.println("Delete application");
   }
}
