package TestSuites;

import org.junit.Before;
import org.junit.Test;

import Helper.Config;
import Pages.ClimatiseurPage;
import Pages.SamsungPage;

public class HomeTestSuite {

	SamsungPage samsungpage;
	@Before
	public void init() {
		Config.confWebD();
		Config.maximWindow();
		String url ="https://www.samsungtunisie.tn/#";
		Config.driver.get(url);
		
		 samsungpage = new SamsungPage();
	}
	
	@Test
	public void clickProduct() throws Exception {
		
		
	
		
		samsungpage.clickSouris("Électroménager", "Climatiseur");
		
		Config.attente(5);
		
		ClimatiseurPage climpage = new ClimatiseurPage();
		climpage.clickProduct("Climatiseur 	 9000 BTU Digital Inverter ");
		
	

    
	}
	
}
