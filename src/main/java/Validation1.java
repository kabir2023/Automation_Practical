import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation1 {
	WebDriver driver;
	

@Before
public void init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamra_0b9xx0w\\Downloads\\April_22-selenium\\Validation1\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://techfios.com/test/101/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@Test
public void toggle() throws InterruptedException {
	driver.findElement(By.name("allbox")).click();
	Thread.sleep(10000);
	driver.close();
}
}
