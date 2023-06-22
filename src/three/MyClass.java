package three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) {
		

    WebDriver driver = new ChromeDriver();
    WebDriverManager.chromedriver().setup();
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys ("secret_sauce");
    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
    

	}

}
