import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newdemotours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chint\\ChromeWebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("chintan");
driver.findElement(By.name("lastName")).sendKeys("Clark"); 
driver.findElement(By.name("phone")).sendKeys("2342342341"); 
				
		
	}

}
