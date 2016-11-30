package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunnerJava {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		String url="http://www.redbus.in/";
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
