package testNGDemo;

import test1.*;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MailLogin {
	
	public static WebDriver driver = null;
	
	@Test
	public static void broLaunch() throws InterruptedException {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\a07136_h4.03.27\\Desktop\\Hadoop_Sai\\chromedriver_win32 (1)\\chromedriver.exe"
		 * ); driver = new ChromeDriver();
		 */
		
		driver = DriverCall.getDriver("crm");
		
		driver.get("https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2fmyemail.accenture.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=0&client-request-id=c3b6f2ff-33ed-4ae8-a9e4-24044e9e3d98&protectedtoken=true&tokenenvelope=true&provenance=false&nonce=637080029540946156.8eec6eeb-0d3b-4045-97d6-60bd840daaf0&state=DcsxFoAgDATRoM_jRFYNAY4DJraWXt8Uf7pJRLSGJSREqOpV0YCzF0EXPYruzf1W98mwa7JACvdqyoppTWBjPEjxbvn9Rv4B&sso_reload=true");
		driver.manage().window().maximize();
		
		login();
	}
	
	@Test
	public static void login() throws InterruptedException{
		driver.findElement(By.xpath("//input[@type='email' and @name='loginfmt']")).sendKeys("krishna.manupati@accenture.com");
		driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='passwordInput' and @name='Password']")).sendKeys("Delete@105");
		driver.findElement(By.xpath("//span[@id='submitButton' and @class='submit']")).click();
		Thread.sleep(15000);
		
		otpLogin();
	}
	
	public static void otpLogin() throws InterruptedException{
		
		driver.findElement(By.xpath("//a[@id='vipOoblink']")).click();
		driver.findElement(By.xpath("//input[@type='button' and @id='vipSend' ]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@type='text' and @id='otpInput' ]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit' and @value='Yes']")).click();
		
		String actualtitleString = driver.getTitle();
		
		System.out.println(actualtitleString);
		
		assertEquals(actualtitleString, "Mail - Manupati, Krishna - Outlook");
		
		//driver.close();
	}

}
