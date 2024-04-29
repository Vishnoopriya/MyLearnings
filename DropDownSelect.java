import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.lu.a;

public class DropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		password.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement dbElement= driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dbSelect =new Select(dbElement);
		dbSelect.selectByValue("IND_AEROSPACE");
		
		WebElement dbElement2=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dbSelect2 = new Select(dbElement2);
		dbSelect2.selectByValue("OWN_LLC_LLP");
		
		
	
		
	
	}
}
