
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationChallenge {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");
        WebDriverWait wait = new WebDriverWait(driver, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Test@mail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password");
		driver.findElement(By.xpath("//label[normalize-space()='Can you enter name here through automation']//child::*")).click();
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//input[@placeholder='First Enter name']")))).sendKeys("Test First Name");
		driver.switchTo().frame("pact");
		WebElement tea = (WebElement) js
				.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#tea')");
		tea.sendKeys("Yes");
		
		WebElement pizza = (WebElement) js
				.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
		pizza.sendKeys("Pizza");
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys("Yes").perform();
		driver.switchTo().defaultContent();
		WebElement kils = (WebElement) js
				.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
		kils.sendKeys("Test User");
		WebElement frame = (WebElement) js
				.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#pact1')");
		driver.switchTo().frame(frame);
		driver.findElement(By.cssSelector("#jex")).sendKeys("Java");
		driver.switchTo().defaultContent();
		WebElement pizza2 = (WebElement) js
				.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
	pizza2.sendKeys("Chess burst");
	actions.sendKeys(Keys.TAB).perform();
	actions.sendKeys("No").perform();
	actions.sendKeys(Keys.TAB).perform();
	actions.sendKeys(Keys.TAB).perform();
	actions.sendKeys("Password").perform();
	driver.switchTo().frame("pact1");
	driver.findElement(By.id("inp_val")).sendKeys("ChroPath");
	driver.switchTo().frame("pact2");
	driver.findElement(By.id("jex")).sendKeys("Selector Hub");
	driver.switchTo().defaultContent();
		/**
		 * Google Form
		 */
	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[3]")));
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Suraj@gmail.com");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Suraj Kumar");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("India");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Cimpress");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Quality Engineer");
	
		
	
	}
}
