package firstpkg;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class T1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
 
  @Test
  public void t1() {
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//form/div/div/div/div")).click();
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).sendKeys("LEO");
    driver.findElement(By.name("btnK")).click();
  }
}
