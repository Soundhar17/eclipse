package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\d106\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://testleaf.herokuapp.com/pages/frame.html");
		d.switchTo().frame(0);
		WebElement clickme = d.findElement(By.id("Click"));
		Thread.sleep(5000);
		clickme.click();
		
	}

}
