import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create driver object for chrome browser
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chint\\ChromeWebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
//System.out.println(driver.getTitle());
//driver.findElement(By.id("")).clear();
driver.findElement(By.linkText("Forgot account?")).click();
	}

}
