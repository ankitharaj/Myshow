package org.sspart.bookmy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITHA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//selecting url
		driver.get("https://in.bookmyshow.com/hyderabad");
		
		driver.findElement(By.xpath("//*[text()=\"Not Now\"]")).click();
		
		//clicking on search button
		driver.findElement(By.id("input-search-box")).click();
		
		//selecting movie
		driver.findElement(By.xpath("//*[text()=\"Majili (UA)\"]")).click();
		
		//theater
		driver.findElement(By.xpath("//*[text()=\"AMB Cinemas: Gachibowli\"]")).click();
		
		//time
		driver.findElement(By.xpath("//a[text()=\"10:40 PM\"]")).click();
		
		//accepting terms
		driver.findElement(By.xpath("//*[text()=\"Accept\"]")).click();
		
		//sets
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"pop_4\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"action-btn\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		List<WebElement>elements=driver.findElements(By.xpath("//*[@id=\"layout\"]/table//*[@class=\"seatR Setrow1\"]"));
		
		int selectedSeats=0;
		for(WebElement ele: elements) {
			
			List<WebElement>seats=ele.findElements(By.xpath("//a[@class=\"_available\"]"));
			
			int expectedSeats=0;
			
			for(WebElement seat:seats) {
				
				expectedSeats=Integer.parseInt(seat.getText().trim());
				
			}
				
			
		}
		
		driver.findElement(By.xpath("//*[@id=\"B_11_12\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"B_11_13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"B_11_14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"B_11_15\"]")).click();
		
		//paying
		driver.findElement(By.xpath("//*[@id=\"btmcntbook\"]")).click();
		
		driver.quit();

	}
	
	
	
}
