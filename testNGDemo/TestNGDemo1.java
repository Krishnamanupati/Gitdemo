package testNGDemo;

import org.openqa.selenium.html5.Location;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDemo1  {
	
	@Test (groups = {"a","b"})
	public void login() {
		System.out.println("login");
	}
	
	@Test (groups = {"a"})
	public void logout() {
		System.out.println("logout");
	}
	
	@Test ( groups = {"b"})
	@Parameters({"location", "idc" })
	public void main(String location, String idc) {
		System.out.println("main");
		System.out.println(location);
		System.out.println(idc);
	}
	
	@Test ( groups = {"c"})
	public void c() {
		System.out.println("c");
	}
	
	
}
