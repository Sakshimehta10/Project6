package com.mindtree.selenium;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		Actions ac=new Actions(driver);
		
		//this code is select text and click
		driver.findElement(By.linkText("Hovers")).click();
		WebElement element=driver.findElement(By.xpath("//div[@class='figure']"));
		((JavascriptExecutor)driver).executeScript("var mouseEvent=document.createEvent('mouseover',true,true);argrument[0].dispatchEvent(mouseEvent);",element);
		//ac.moveToElement(driver.findElement(By.xpath("//div[@class='figure']")));
		
		
		
			}
			
			
		
		

	}

