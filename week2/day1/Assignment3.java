package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ranji");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ranjith@testleaf.com");

		WebElement stateGeo = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select secState = new Select(stateGeo); 
		secState.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Title is: "+ driver.getTitle());

		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New One");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("What to Say");
		driver.findElement(By.className("smallSubmit")).click();

		//driver.findElement(By.linkText("Edit")).click();
		//driver.findElement(By.id("updateLeadForm_description")).clear();
		//driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium Testing");
		//driver.findElement(By.name("submitButton")).click();

		System.out.println("The Title is: "+ driver.getTitle());
		
		driver.close();

	}

}
