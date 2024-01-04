package week3.day3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafGround {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("j_idt88:name")).sendKeys("kalvin");
		driver.findElement(By.name("j_idt88:j_idt91")).clear();
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("India");
		WebElement a=driver.findElement(By.name("j_idt88:j_idt93"));
		if (a.isEnabled()) {
			System.out.println("option not verified");
		} else {
System.out.println("Option is verified");
		}
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
	  WebElement b	=driver.findElement(By.name("j_idt88:j_idt97"));
	  //b.clear();
	  //b.sendKeys("kELVIN");
	  String attribute = b.getAttribute("value");
	  System.out.println( attribute);
	  driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("Kalvinbritto20@gmail.com",Keys.TAB);
	  driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("i am kalvin i am learining testing");
	  
	  

	}

}
