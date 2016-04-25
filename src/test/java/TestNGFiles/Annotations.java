package TestNGFiles;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
   @BeforeTest
   public void CleanCookies(){
      System.out.println("Clean cookies before all tests");
   }
   @AfterTest
   public void DeleteCookies(){
      System.out.println("Deleting cookies after comlpiting all tests");
   }

   @BeforeMethod
   public void UserIDGeneration() {
      System.out.println("generate ID");
   }


   @Test
   //Opens browser
   public void AOpening() {
      System.out.println("Open browser");
   }

   @Test
   public void FlightBooking() {
      System.out.println("Flight booking");


   }
}
