import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositiveTicketTC2 {
    public static void main(String[] args) throws InterruptedException {
        Browser2 myBrowser = new Browser2();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc>>");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Ekrem7360!");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[starts-with(@type,'ema')]")).sendKeys("contains true");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
    }
}
