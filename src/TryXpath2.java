import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryXpath2 {
    public static void main(String[] args) throws InterruptedException {

        Browser2 myBrowser = new Browser2();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.skyscanner.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
