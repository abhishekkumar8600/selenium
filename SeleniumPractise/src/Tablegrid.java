import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30235/3rd-odi-australia-tour-of-england-2020");
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 ltst-wgt-hdr']"));
		int rows=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd--itms']")).size();
		System.out.println(rows);

	}

}
