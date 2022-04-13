package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDriver {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shefu\\IdeaProjects\\NewProject\\Generic\\src\\main\\resources\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.navigate().to("https://www.amazon.com");
    driver.manage().window().maximize();//command to maximize the browser
    driver.navigate().back();//command to go backwards
        Thread.sleep(6000);
        driver.navigate().forward();//command to move forward
        driver.navigate().refresh();//command to refresh the browser
       String url= driver.getCurrentUrl();//store current url in the variable to get & print current url
        System.out.println(url);
        String windowhandle=driver.getWindowHandle();//for single window, also need to store variable
        // for multiple window - getWindowHandles
        System.out.println(windowhandle);
        driver.close();//or driver.quit (browser will close automatically)
//elements of the specific browser is every function that is there
        //7 to 9 locators - id, link text, Partial Linktext, Name, Tag name, Class name, Xpath, Css Selector

    }
}
