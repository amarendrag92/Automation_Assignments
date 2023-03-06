package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://www.facebook.com/");
		//a[text()='Create new account']
		//a[contains(text(),'Create new')]

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("leaftest");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("auto_demo@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("auto_demo@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("leaftest123@gmail.com");

		// ctrl+2 --l		 
		WebElement bth_day = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(bth_day);
		day.selectByIndex(6);


		WebElement bth_mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon = new Select(bth_mon);
		mon.selectByVisibleText("Apr");

		// Thread.sleep(2000);
		WebElement bth_yrs = driver.findElement(By.xpath("//select[@id='year']"));


		Select yrs = new Select(bth_yrs);
		yrs.selectByValue("2000");



		driver.findElement(By.xpath("//label[text()='Female']")).click();


		driver.findElement(By.xpath("//button[@name='websubmit']")).click();


	}

}
