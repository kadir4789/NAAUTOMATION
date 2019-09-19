import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static WebDriver kadir;
    public static void main(String[] args) {
        invokeChromeBrowser();
        kadir.get("http://www.facebook.com");
        kadir.findElement(By.name("firstname")).sendKeys("Kadir");
        kadir.findElement(By.name("lastname")).sendKeys("Gumus");

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kadir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        kadir = new ChromeDriver();
    }
}
