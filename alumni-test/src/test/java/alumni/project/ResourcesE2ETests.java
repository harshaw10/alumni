package alumni.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResourcesE2ETests {

	@Test
	public void ValidationOfRadioButtonTest() throws InterruptedException {
		
		ResourcesMethods resourceMethodObject = new ResourcesMethods();
		resourceMethodObject.ClickOnValidationAnalysisEnrichment();
		Thread.sleep(3000);
		assertNotNull(resourceMethodObject);
	}
	
	@Test
	public void CtoInformationTest() throws InterruptedException {
		
		ResourcesMethods resourceMethodObject = new ResourcesMethods();
		resourceMethodObject.ClickOnCtoInfo();
		Thread.sleep(3000);
		assertNotNull(resourceMethodObject);
	}

	@Test
	public void JessicaReadmeInformationTest() throws InterruptedException {
		
		ResourcesMethods resourceMethodObject = new ResourcesMethods();
		resourceMethodObject.ClickOnJessicaInfo();
		Thread.sleep(3000);
		assertNotNull(resourceMethodObject);
	}
	
	@Test
	public void ReadmeInformationTest() throws InterruptedException {
		
		ResourcesMethods resourceMethodObject = new ResourcesMethods();
		resourceMethodObject.ClickOnReadmeInfo();
		Thread.sleep(3000);
		assertNotNull(resourceMethodObject);
	}
	
	@Test
	public void CarrersTabTest() throws InterruptedException {
		
		ResourcesMethods resourceMethodObject = new ResourcesMethods();
		resourceMethodObject.ClickOnCarrers();
		Thread.sleep(3000);
		assertNotNull(resourceMethodObject);
	}
}
