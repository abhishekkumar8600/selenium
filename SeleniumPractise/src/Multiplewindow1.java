import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> i=s.iterator();
		String pw=i.next();
		String cw=i.next();
		
		driver.switchTo().window(cw);
		System.out.println(driver.getTitle());

	}

}
