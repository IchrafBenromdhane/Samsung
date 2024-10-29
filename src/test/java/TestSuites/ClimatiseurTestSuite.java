package TestSuites;


import org.junit.Test;

import Helper.Config;
import Pages.ClimatiseurPage;


public class ClimatiseurTestSuite {
	
	@Test
	public void qlickProduct() throws Exception
	{
		
		Config.confWebD();
		Config.maximWindow();
		
		
		String url ="https://www.samsungtunisie.tn/fr/39-climatiseur-samsung-tunisie";
		Config.driver.get(url);
		
		Config.attente(5);
		
		ClimatiseurPage climpage = new ClimatiseurPage();
		climpage.clickProduct("Climatiseur Samsung 12000 BTU Digital Inverter");
		
	
		


		
	}


}
