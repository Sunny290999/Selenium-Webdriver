package testngpkg;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfb
{
	
ChromeDriver driver;
	
@BeforeTest
 public void setUp()
			 {
				driver=new ChromeDriver();
				driver.get("https://www.facebook.com/"); 
			 }
			
@Test
 public void DataDrivenTest() throws Exception
			 {
		        FileInputStream f=new FileInputStream("C:\\Users\\My Dell\\Downloads\\Selenium Data Driven Test Excel Documents\\FBlogindatas for datadriventest.xlsx");
		        
		        
				XSSFWorkbook wb=new XSSFWorkbook(f); //workbook
		        XSSFSheet sh=wb.getSheet("Sheet1");  //sheet
		        
		        int row=sh.getLastRowNum();  //row details
		        System.out.println("\n"+"LAST ROW NUMBER: "+sh.getLastRowNum());
		        
		        
		        for(int i=1;i<=row;i++)
		        {
		         String email=sh.getRow(i).getCell(0).getStringCellValue();
		         System.out.println("\n Email: " +email);
		        	
		         String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		         System.out.println("\n Password: " +pswd);
		        	
		         System.out.println();
		        	
		        	 
		         driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(email);
		         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pswd);
		    	 driver.findElement(By.xpath("//button[@type='submit']")).click();
		    		
		    	 driver.navigate().refresh();
			     }
		       
		        driver.close();
		      }
}