import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//limiting webdriver scope to footer section
		WebElement footerdriver=driver.findElement(By.cssSelector("div#gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//again limiting webdriver scope to specific row of footer section
		 WebElement footerrow=footerdriver.findElement(By.xpath("//tbody/tr[1]/td[2]/ul[1]"));
		 System.out.println(footerrow.findElements(By.tagName("a")).size());
		 
		 //click on each link and find if they r opening
		 
		 for(int i=1;i<footerrow.findElements(By.tagName("a")).size();i++)
		 {
			 String clickenlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		    footerrow.findElements(By.tagName("a")).get(i).sendKeys(clickenlinktab); 
		    
		 }
		    
		    //to get title of each opened page
		    Set<String> abc=driver.getWindowHandles();
		    Iterator<String> pw=abc.iterator();
		    
		 
		    while(pw.hasNext())
		    {
		    	driver.switchTo().window(pw.next());
		    	driver.getTitle();
		    }
		    
		    
		 
		
		
		//driver.quit();

	}

}
