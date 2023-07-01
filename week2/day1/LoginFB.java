package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFB {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ranjith");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");

		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select secSource = new Select(sourceDD);
		secSource.selectByIndex(4);

		//WebElement sourceDD1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		//Select secSource1 = new Select (sourceDD1);
		//secSource1.selectByIndex(2);

		//WebElement sourceDD2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//Select secSource2 = new Select (sourceDD2);
		//secSource2.selectByIndex(5);

		WebElement sourceDD1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select secSource1 = new Select (sourceDD1);
		secSource1.selectByVisibleText("Automobile");

		WebElement sourceDD2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select secSource2 = new Select (sourceDD2);
		secSource2.selectByValue("OWN_CCORP");

		driver.findElement(By.className("smallSubmit")).click();

		driver.close();

	}

}
