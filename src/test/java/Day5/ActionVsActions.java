package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	WebElement	button =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
	Actions act= new Actions(driver);
		
	//right click
	
	//act.contextClick().perform();
	
	Action myaction =act.contextClick(button).build();
	
	myaction.perform();
	
	driver.findElement(By.xpath("/html/body/ul/li[3]")).click(); //perform click on copy option

	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept(); //close the alert window
	}
}