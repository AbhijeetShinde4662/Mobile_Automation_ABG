package PracticeLearn;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheBrokenLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		HttpURLConnection link = null;

		List allHyperlinksList = driver.findElements(By.tagName("a"));

		for (Object hyperLink : allHyperlinksList) {
			String url = ((WebElement) hyperLink).getAttribute("href");
			try {
				URL actualUrl = new URL(url);
				link = (HttpURLConnection) actualUrl.openConnection();
				link.setRequestMethod("HEAD");
				link.connect();

				int respCode = link.getResponseCode();

				if (respCode == 400) {
					System.out.println(url + " is a BROKEN link");
				} else {
					System.out.println(url + " is a VALID link");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}

}
