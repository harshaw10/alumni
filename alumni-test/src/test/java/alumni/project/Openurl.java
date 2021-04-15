package alumni.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Openurl {
	
	
	

	public void ClickOnUseCases() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "your path where chrome.exe is present");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aumni.fund");
		driver.manage().window().maximize();
		WebElement usecases = driver.findElement(By.id("w-dropdown-toggle-1"));
		usecases.click();
		WebElement Unlock = driver.findElement(By.xpath("//*[@id=\"w-dropdown-list-1\"]/div/a[1]"));
		Unlock.click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	public void ClickOnAccelerate() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "your path where chrome.exe is present");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aumni.fund");
		driver.manage().window().maximize();
		WebElement usecases = driver.findElement(By.id("w-dropdown-toggle-1"));
		usecases.click();
		WebElement Accelerate = driver.findElement(By.xpath("//*[@id=\"w-dropdown-list-1\"]/div/a[2]"));
		Accelerate.click();
		Thread.sleep(3000);
		var firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("John");
		var lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Smith");
		var email = driver.findElement(By.id("email"));
		email.sendKeys("johnsmith@gmail.com");
		var company = driver.findElement(By.id("company"));
		company.sendKeys("PetSmart");
		var submit = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input"));
		submit.submit();
		driver.close();
	}
	
}
