package lis;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(lis.Listenerstest.class)
public class Login {
WebDriver driver;
@Test
public void met1() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kd21221\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
    
}
@Test 
public void met2() {
	WebElement w=driver.findElement(By.name("username"));
	w.sendKeys("rameshadepu");
	System.out.println(w.getAttribute("value"));
	
}
}
