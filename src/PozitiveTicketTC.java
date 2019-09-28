import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PozitiveTicketTC {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
         WebDriver driver = myBrowser.invokeChromeBrowser();
         driver.get("http://facebook.com");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("kdr.com>>");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("ekr");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[contains(@type,'mai')]")).sendKeys("contains mai");



    }
}
