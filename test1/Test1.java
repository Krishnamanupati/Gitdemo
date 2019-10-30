package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = DriverCall.getDriver("crm");
		
		driver.get("http://www.newtours.demoaut.com/");
		
		Dimension dm = new Dimension(300, 300);
		
		driver.manage().window().setSize(dm);
		
		Thread.sleep(2000);
		
		Point pt = new Point(500, 500);
		
		driver.manage().window().setPosition(pt);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("sldkfj");
	 	driver.findElement(By.cssSelector("userName")).sendKeys("sldkfj");
		driver.findElement(By.name("register")).click();
		
		
		
	}

}
