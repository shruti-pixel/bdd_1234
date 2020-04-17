package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import commons.Page_PageBase;

public class page_GoogleHomepage extends Page_PageBase {

	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anavi\\Desktop\\cucumber_jars\\cd\\chromedriver.exe" );
		driver = new ChromeDriver();
	}

	public void OpenGoogleUrl() {
		driver.get("https://www.google.com");
		driver.get("https://www.google.com")

	}

	public void SearchDisplayBox() {
		if (driver.findElement(By.name("q"))
				.isDisplayed()) {
			System.out.println("search box is displayed");
		} else {
			System.out.println("search box is not displayed");
		}
	}
public void SearchButtonDisplay(){
	
}

public void Searchgooglehomepage(String keyword){
	
	driver.findElement(By.name("q")).sendKeys(keyword);
	driver.findElement(By.name("btnk")).click();
	
	
}
	}


