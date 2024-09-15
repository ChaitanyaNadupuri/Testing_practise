package testpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.lang.*;
import java.time.Duration;
import java.util.List;

public class Selenium_practise {

   @Test
   public void selenium() throws InterruptedException {

      System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");

      WebDriver driver = new EdgeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      Thread.sleep(10);
      List<WebElement> L1 =driver.findElements(By.xpath("//div[text()='Make Money with Us']/../ul/li/a"));
      boolean flag = false;
      for (WebElement i : L1){
         String model = i.getText();
         System.out.println(model);
         if(model.contains("babai")){
            flag = true;
            break;
         }
         }
      if(flag){
         System.out.println("got it");

         }
      else{
         System.out.println("arey yaar we missed");
      }
   }
}
