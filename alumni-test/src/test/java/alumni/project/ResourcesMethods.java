package alumni.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class ResourcesMethods {
	
	


	
	public void ClickOnValidationAnalysisEnrichment() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "your path where chrome.exe is present");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aumni.fund");
		driver.manage().window().maximize();
		WebElement resources = driver.findElement(By.id("w-dropdown-toggle-2"));
		resources.click();
		
		WebElement AumniInnovation = driver.findElement(By.linkText("Aumni Innovation"));
	
		AumniInnovation.click();
		Thread.sleep(3000);
		var Enrichment = driver.findElement(By.xpath("//*[@id=\"w-tabs-0-data-w-tab-1\"]/div[1]"));
		boolean selectEnrichment = Enrichment.isSelected();
		if (selectEnrichment==false)
		{
			Enrichment.click();
		}
		Thread.sleep(3000);
		
		var Analysis = driver.findElement(By.xpath("//*[@id=\"w-tabs-0-data-w-tab-2\"]/div[1]"));
		boolean selectAnalysis = Analysis.isSelected();
		if (selectAnalysis==false)
		{
			Analysis.click();
		}
		Thread.sleep(3000);
		
		var Validation = driver.findElement(By.xpath("//*[@id=\"w-tabs-0-data-w-tab-0\"]/div[1]"));
		boolean selectValidation = Validation.isSelected();
		if (selectValidation==false)
		{
			Validation.click();
		}
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	public void ClickOnCtoInfo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "your path where chrome.exe is present");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aumni.fund");
		driver.manage().window().maximize();
		WebElement resources = driver.findElement(By.id("w-dropdown-toggle-2"));
		resources.click();
		
		WebElement AumniInnovation = driver.findElement(By.linkText("Aumni Innovation"));
	
		AumniInnovation.click();
		Thread.sleep(3000);
		//I have use absolute path because I was unable to obtain the relative path or use any type of locators.
		var ctoInfo = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div[3]/a"));
		boolean selectValidation = ctoInfo.isSelected();
		if (selectValidation==false)
		{
			ctoInfo.click();
		}
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.quit();
	
	}
	
	public void ClickOnJessicaInfo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "your path where chrome.exe is present");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aumni.fund");
		driver.manage().window().maximize();
		WebElement resources = driver.findElement(By.id("w-dropdown-toggle-2"));
		resources.click();
		
		WebElement AumniInnovation = driver.findElement(By.linkText("Aumni Innovation"));
	
		AumniInnovation.click();
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		var JessicaReadme = driver.findElement(By.xpath("/html/body/main/section[3]/div/div[2]/div/div/div[2]/a"));
		boolean selectJessicaRead = JessicaReadme.isSelected();
		if (selectJessicaRead==false)
		{
			JessicaReadme.click();
		}
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		driver.quit();
	
	}
	
	public void ClickOnReadmeInfo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "your path where chrome.exe is present");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aumni.fund");
		driver.manage().window().maximize();
		WebElement resources = driver.findElement(By.id("w-dropdown-toggle-2"));
		resources.click();
		
		WebElement AumniInnovation = driver.findElement(By.linkText("Aumni Innovation"));
	
		AumniInnovation.click();
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		var Readme = driver.findElement(By.xpath("/html/body/main/section[3]/div/div[2]/div/div/div[3]/a"));
		boolean selectRead = Readme.isSelected();
		if (selectRead==false)
		{
			Readme.click();
		}
		
		Thread.sleep(5000);
		driver.quit();
	
	}
	
	public void ClickOnCarrers() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "your path where chrome.exe is present");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aumni.fund");
		driver.manage().window().maximize();
		WebElement resources = driver.findElement(By.id("w-dropdown-toggle-2"));
		resources.click();
		
		WebElement AumniInnovation = driver.findElement(By.linkText("Aumni Innovation"));
	
		AumniInnovation.click();
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		var Careers = driver.findElement(By.xpath("/html/body/main/section[4]/div[2]/div/div/a"));
		boolean selectCarrers = Careers.isSelected();
		if (selectCarrers==false)
		{
			Careers.click();
		}
		
		Thread.sleep(5000);
		
		var LinkdinCareers = driver.findElement(By.xpath("/html/body/main/section/div[3]/div/div[1]/div[2]/a"));
		boolean SelectLinkdincareers = LinkdinCareers.isSelected();
		if (SelectLinkdincareers==false)
		{
			LinkdinCareers.click();
		}
		
		Thread.sleep(3000);
		
		var Link_FirstName =driver.findElement(By.xpath("//*[@id='first-name']"));
		boolean SelectLink_FirstName = Link_FirstName.isSelected();
		if (SelectLink_FirstName==false)
		{
			Link_FirstName.sendKeys("Jim");
		}
	
		var Link_LastName =driver.findElement(By.xpath("//*[@id='last-name']"));
		boolean SelectLink_LastName = Link_LastName.isSelected();
		if (SelectLink_LastName==false)
		{
			Link_LastName.sendKeys("John");
		}
		
		var Link_Email =driver.findElement(By.xpath("//*[@id='email-or-phone']"));
		boolean SelectLink_Email = Link_Email.isSelected();
		if (SelectLink_Email==false)
		{
			Link_Email.sendKeys("xyz@hotmail.com");
		}
		
		var Link_Password =driver.findElement(By.xpath("//*[@id='password']"));
		boolean SelectLink_Password = Link_Password.isSelected();
		if (SelectLink_Password==false)
		{
			Link_Password.sendKeys("abcs1028361");
		}
		

		var Link_Agree = driver.findElement(By.xpath("//*[@id='join-form-submit']"));
		boolean SelectLink_Agree = Link_Agree.isSelected();
		if (SelectLink_Agree==false)
		{
			Link_Agree.submit();
		}
				
		Thread.sleep(5000);
		driver.quit();
	}
	
}
	
