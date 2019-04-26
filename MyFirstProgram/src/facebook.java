import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chint\\ChromeWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//ID
		//driver.findElement(By.id("u_0_c")).sendKeys("chintan");
		//driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
	//	driver.findElement(By.id("u_0_l")).sendKeys("Sugandhi");
		
				
		//name
	//	driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		
		//ClassName
		//driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		//driver.findElement(By.className("inputtext")).clear();
		//driver.findElement(By.className("inputtext")).sendKeys("Sugandhi");
		
		
		//LinkText
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.navigate().back();
		
		//PartialLinkText
		//driver.findElement(By.partialLinkText("account?")).click();
		
		//driver.navigate().back();	
		//driver.navigate().forward();
		
		//CSS
		//driver.findElement(By.cssSelector("#pass")).sendKeys("Sugandhi");
		
		//TagName
	//	List<WebElement> list = driver.findElements(By.tagName("a"));
		//System.out.println(list.size());
		
		//Xpath
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("jain");
	driver.findElement(By.xpath("//*[@name='lastname']//preceding::input[1]")).sendKeys("chintan");
	
	
	//*[contains(@name, 'firstname')]
	//*[contains(text(), "It's free")] this one we can use when we need to verify the contents
	// within contains also we can use and , or operators also
	//*[contains(@name,'firstname') and contains(@type,'text')]
	//*[contains(text(),'always will be.') or contains(text(),"It's")]

	//*[starts-with(@name,"first")]
	
	// uses of precedings and following
	//input[@name='lastname' and @id='u_0_l']    or write it in shorter form with one unique attribute
	//*[@id='u_0_l']//preceding::input[17]
	//*[@id='u_0_l']//following::input[6]	
	
	
	}

}
