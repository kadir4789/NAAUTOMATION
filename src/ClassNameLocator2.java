import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator2 {
    static WebDriver kadir;
    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        kadir.get("http://turkishairlines.com/");
        Thread.sleep(3000);
        kadir.findElement(By.className("thyHeaderLink")).click();
    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kadir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        kadir = new ChromeDriver();
        }
    }

