package week4.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentXPath {

	public static void main(String[] args) throws InterruptedException {
		
		
		EdgeOptions op = new EdgeOptions();
		op.addArguments("--guest");	
		EdgeDriver driver=new EdgeDriver(op);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sri");
		driver.findElement(By.name("lastname")).sendKeys("sri");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7358421030");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Rockstar");
		WebElement a=driver.findElement(By.id("day"));
		Select obj=new Select(a);
		obj.selectByValue("4");
		WebElement b=driver.findElement(By.id("month"));
		Select obj1=new Select(b);
		obj1.selectByValue("4");
		WebElement c=driver.findElement(By.id("year"));
		Select obj2=new Select(c);
		obj2.selectByValue("2021");
		driver.findElement(By.xpath("//label[contains (text(),'Fem')]")).click();
		
		
		
		
		
		
	}
	
}
