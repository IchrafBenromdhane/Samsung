package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ClimatiseurPage {
	
	@FindBy(xpath = "/html/body/main/section/div[4]/div/div/div[2]/section/section/div[2]/div/div/div[1]/div/div/div/article/div/div[2]/div[1]/h3/a")
	List<WebElement> climList;
	
	@FindBy(xpath = "/html/body/main/section/div/div/div/div/section/div/div[2]/div[3]/form/div[3]/div[1]/div[2]/button")
	WebElement Acheter;
	
	@FindBy(xpath = "/html/body/div[9]/div/div/div[2]/div/div[2]/div/div/button")
	WebElement commander;
	

	
	public ClimatiseurPage() {
		
		PageFactory.initElements(Config.driver, this);
	}
	
public void clickProduct(String climName)  throws Exception{
		
		try {
			
		
		
		for(WebElement clim:climList)
		{
			System.out.println(clim.getText());
			
			if (clim.getText().contains(climName))
			{
				clim.click();
			
		Thread.sleep(3000);
		Config.attente(10);
		
		Acheter.click();
		
		System.out.println("test2");
		Thread.sleep(3000);
		
		String script = "window.scrollTo(0, 500);";
		((JavascriptExecutor) Config.driver).executeScript(script);
		
		WebDriverWait wait= new WebDriverWait(Config.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(commander));
		
		Config.actions.moveToElement(commander).perform();
		commander.click();
		
		System.out.println("test3");
			}
		}
		
		
		} catch (Exception e) {
		}
		
	}
	

}
