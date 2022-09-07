package org.securekloud;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeureKloud {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH\\eclipse-workspace\\SanthoshSecureKloud\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("8838450776");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Vinitha@123");
		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btn.click();
		Thread.sleep(3000);
		WebElement appliance = driver.findElement(By.xpath("(//div[@class='xtXmba'])[7]"));
		appliance.click();
		Thread.sleep(3000);
		WebElement tvAppliance = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		tvAppliance.click();
		Thread.sleep(5000);
    	WebElement inverter = driver.findElement(By.xpath("//a[@title='Inverter AC']"));
		inverter.click();
		WebElement voltas = driver.findElement(By.xpath("//div[text()='Voltas 1.5 Ton 5 Star Split Inverter AC  - White']"));
		voltas.click();
		String voltasHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String eachWindow : windowHandles) {
			if (voltasHandle !=eachWindow) {
				driver.switchTo().window(eachWindow);}}
		WebElement goToCart = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		goToCart.click();
		Thread.sleep(3000);
		WebElement sc = driver.findElement(By.xpath("//a[text()='Infringement']"));
		js.executeScript("arguments[0].scrollIntoView(true)", sc);
        driver.findElement(By.xpath("(//button[@class='_23FHuj'][2])")).click();
		WebElement discount = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]"));
		System.out.println(discount.getText());
		String total = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/span/div/div/span")).getText();
		System.out.println("Total Amount  :"+ total );
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button")).click();
		WebElement am = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[3]/div/span/div/div/div"));
		System.out.println("Total payable amount :" + am.getText());
		driver.navigate().back();
		WebElement sc1 = driver.findElement(By.xpath("//a[text()='Infringement']"));
		js.executeScript("arguments[0].scrollIntoView(true)", sc1);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		driver.findElement(By.xpath("(//div[text()='Remove'][1])")).click();
		
		
	
}


	}

