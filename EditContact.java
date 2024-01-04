package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditContact {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("ragnork");
		driver.findElement(By.id("lastNameField")).sendKeys("s");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("luffy");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Uzumaki");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hello");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("luffy2001@gmail.com");
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj=new Select(state);
		obj.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("check state");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		if (title.contains("View Contact")) {
			System.out.println(title+" is verified");
			
		} else {System.out.println(title+" is not verified");

		}
	}

}

