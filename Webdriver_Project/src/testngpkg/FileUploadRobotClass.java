package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUploadRobotClass
{
	
    ChromeDriver driver;

@Test
 public void fileUploadPgm() throws Exception
			 {
	
	         driver=new ChromeDriver();
	         driver.get("https://www.ilovepdf.com/pdf_to_word"); 
	         driver.findElement(By.xpath("//*[@id='pickfiles']")).click();
	         
	         fileUpload("Downloads\\code2pdf_65111c94eed4a.pdf");

			 }

 public void fileUpload(String p) throws AWTException 
             { 
                StringSelection strSelection=new StringSelection(p);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);


                      Robot robot=new Robot();

                     robot.delay(3000);

                     robot.keyPress(KeyEvent.VK_CONTROL);
                     robot.keyPress(KeyEvent.VK_V);

                     robot.keyRelease(KeyEvent.VK_V); 
                     robot.keyRelease(KeyEvent.VK_CONTROL);

                     robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
                     robot.delay(2000);
                     
                     
                     
                     driver.findElement(By.xpath("//*[@id='processTask']")).click();
                     
                     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pickfiles']")));
                     driver.findElement(By.xpath("//*[@id='pickfiles']")).click();
                     
               }
 }