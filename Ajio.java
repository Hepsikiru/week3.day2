package week3.day2.practice;

import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Ajio {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			// Step 2: Instantaite the ChromeDriver
			//ChromeOptions options = new ChromeOptions();

			//options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver();
			
				
			// Loads a new web page in the current browser window
			// Maximise the screen
			driver.manage().window().maximize();
			
			driver.get("https://www.ajio.com/");
			//In the search box, type as "bags" and press enter
			
			driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
			
			Thread.sleep(2000);
			// To the left  of the screen under " Gender" click the "Men"

			driver.findElement(By.xpath("//label[@for='Men']")).click();
			Thread.sleep(2000);

			//options.addArguments("--disable-notifications");	
			 
		        		
		
			//Under "Category" click "Fashion Bags"
			driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
			Thread.sleep(2000);
			
			//options.addArguments("--disable-notifications");

			String totalItems = driver.findElement(By.className("length")).getText();
			System.out.println("Total number of items : " + totalItems);
	        //Get the list of brand of the products displayed in the page and print the list.
			System.out.println(" List of Brands");
			List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
			System.out.println(" Size :" + bagBrandList.size());

			for (WebElement webElement : bagBrandList) {
				String text = webElement.getText();
				System.out.println(text);
			}
			// Get the list of names of the bags and print it
			System.out.println(" Names of the Bags");
			List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
			
			
			for (WebElement webElement : bagNameList) {
				Thread.sleep(1000);
				String text = webElement.getText();
				System.out.println(text);
							}
		}
	}
		