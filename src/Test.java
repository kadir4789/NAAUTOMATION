import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        chrome();
        WebDriver driver;
    }
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kadir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
    }
}
