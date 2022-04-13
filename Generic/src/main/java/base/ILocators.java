package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ILocators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shefu\\IdeaProjects\\NewProject\\Generic\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement seachfieldtxt = driver.findElement(By.name("field-keywords"));
        seachfieldtxt.sendKeys("Computer");
        WebElement Searchicon = driver.findElement(By.id("nav-search-submit-button"));
      Searchicon.click();
    WebElement linktxt =  driver.findElement(By.linkText("Registry"));
    linktxt.click();


    }
}
