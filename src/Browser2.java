import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {

        public WebDriver invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kadir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver kadir=new ChromeDriver();
        return kadir;
    }
}
