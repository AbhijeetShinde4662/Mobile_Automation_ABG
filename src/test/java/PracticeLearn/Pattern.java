package PracticeLearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pattern {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		 Alert alert = driver.switchTo().alert();
		 String name = alert.getText();
		 alert.accept();
		 alert.dismiss();
	}}
/*
	}Looking for a Automation Software Test Engineer or Senior SDET Engineer role. I am skilled in java-selenium, testng, maven, appium, ci/cd pipeline, jenkins, github, bitbucket, BDD framework, functional, regression, accessibility testing

}Senior QA Engineer with over 7+ years of hands on experience in software testing, specializing in web and mobile automation using java, appium and selenium, API testing, and manual testing. Adept at designing and executing comprehensive test plans and developing advanced automation frameworks using tools like Selenium and Appium. Highly skilled in Java 
*/