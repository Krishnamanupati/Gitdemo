package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverCall {

	public static WebDriver getDriver(String bname) {
		// TODO Auto-generated method stub
		
		if(bname.equalsIgnoreCase("crm")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07136_h4.03.27\\Desktop\\Hadoop_Sai\\chromedriver_win32 (1)\\chromedriver.exe");
			return new ChromeDriver();
				
		}
		
		else if(bname.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\a07136_h4.03.27\\Desktop\\Hadoop_Sai\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			return new FirefoxDriver();
		}
		
		else if(bname.equalsIgnoreCase("e")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\a07136_h4.03.27\\Desktop\\Hadoop_Sai\\edgedriver_win64\\msedgedriver.exe");
			return new EdgeDriver();
		}
		return new EdgeDriver();

	}

}
