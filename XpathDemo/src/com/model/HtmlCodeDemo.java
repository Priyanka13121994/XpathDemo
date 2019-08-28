package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlCodeDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Chrome76\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///F:/html/HTML.html");
	    driver.manage().window().maximize();
	    
	    //To get the Current url
	    String url=driver.getCurrentUrl();
	    System.out.println("The current url of the webpage is "+url);
	    
	    //To send the data in the username text box
	    WebElement username=driver.findElement(By.xpath("//div[@class='container']/child::input[@placeholder='Enter username']"));
	    username.sendKeys("Chetna");
	    String usenameval=username.getAttribute("value");
	    System.out.println("The value of the username is "+usenameval);
	    
	    //To fetch the label of username
	    WebElement usernameval=driver.findElement(By.xpath("//div[@class='container']/child::label"));
	    String usernameval1=usernameval.getText();
	    System.out.println("The label of username is "+usernameval1);
	    
	    //To enter the data in the password textbox
	    WebElement password=driver.findElement(By.id("pid"));
	    password.sendKeys("123456789");
	    String passwdval=password.getAttribute("value");
	    System.out.println("The value of the password is "+passwdval);
	    
	    //To fetch the label of the password
	    WebElement passval=driver.findElement(By.xpath("//input[@placeholder='Enter username']/following-sibling::label"));
	    String passwd=passval.getText();
	    System.out.println("The label of the password is "+passwd);
	    
	    //To select the values from the dropdown box
	    WebElement obj=driver.findElement(By.xpath("//select[@id='browser']"));
	    Select sel=new Select(obj);
	    sel.selectByValue("chrome");
	    
	    //To select the checkbox
	    driver.findElement(By.xpath("//input[@id='remme']")).click();
	    
	    driver.findElement(By.xpath("//button[@name='loginbtn']")).click();
	    driver.switchTo().alert().accept();
	    driver.navigate().back();
	    

	}

}
