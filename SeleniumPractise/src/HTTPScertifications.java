import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPScertifications {

	public static void main(String[] args) {
		//SSL CERTIFICATIONS
		//DESIRED CAPABALITIES
		//GENERAL CHROME PROFILE
		DesiredCapabilities ch=new DesiredCapabilities();
		ch.acceptInsecureCerts();
		//BELONGS TO LOCAL BROWSER
		ChromeOptions o=new ChromeOptions();
		o.merge(ch);
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver(o);
		

	}

}
