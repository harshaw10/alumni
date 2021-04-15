package alumni.project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AlumniTests {

	@Test
	public void OpenChromeToNagivateToBaseUrlTest() throws InterruptedException 
	{
	Openurl openurlObject = new Openurl();
	openurlObject.ClickOnUseCases();
	Thread.sleep(3000);
	assertNotNull(openurlObject);
	}
    @Test	
	public void ValidateAccleratePageTests() throws InterruptedException 
	{
	Openurl openurlObject = new Openurl();
	openurlObject.ClickOnAccelerate();
	Thread.sleep(3000);
	assertNotNull(openurlObject);

	}
	
}

