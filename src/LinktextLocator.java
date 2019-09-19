import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextLocator {

    public static WebDriver kadir;
    public static void main(String[] args) throws InterruptedException {
        String expectedValue = "Sizin İçin Buradayız!";
        invokeChromeBrowser();
        kadir.manage().window().maximize();
        kadir.get("http://www.flypgs.com");
        kadir.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
        Thread.sleep(2000);
        kadir.findElement(By.linkText("BİZE YAZIN")).click();
        Thread.sleep(5000);
        System.out.println("Validation"+ isTextTrue(expectedValue));
    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kadir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        kadir = new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue){

        String resultValue = kadir.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}
