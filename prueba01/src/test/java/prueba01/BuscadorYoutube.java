package prueba01;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscadorYoutube {
private WebDriver driver;
@Before
	public void setUp() {
	
	System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	
}
@Test
public void testYoutube(){
	
	WebElement searchbox = driver.findElement(By.name("search_query"));
	searchbox.clear();
	
	searchbox.sendKeys("rock de los 80s");
	
	searchbox.submit();
	WebElement segundaopcion = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/div/yt-formatted-string"));
	segundaopcion.click();
}


}
