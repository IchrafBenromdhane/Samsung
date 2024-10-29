package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SamsungPage {
	
	@FindBy(xpath = "/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li/a/span")
	List<WebElement> menus;
	
	@FindBy(xpath = "/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li[4]/ul/li[1]/ul/li/div[1]/div/ul/li/a")
	List<WebElement> sousmenus;
	
	
	
	
public SamsungPage(){
		
		PageFactory.initElements(Config.driver, this);
	}


	public void clickSouris(String titreMenu, String titreSousmenu) throws Exception {
		
		try {
			
		for (WebElement menu: menus) {
			
			
			
			if (menu.getText().contains(titreMenu)) {
								
				Config.actions.moveToElement(menu).perform();
				
			
				for (WebElement sousMenu : sousmenus) {
		
					if (sousMenu.getText().contains(titreSousmenu)) {
						sousMenu.click();
						
						return;
					
					}
				}
			}	
		}
	} 
		catch (Exception e) {
			e.printStackTrace(); // Affiche l'exception pour le débogage
	}

}}
