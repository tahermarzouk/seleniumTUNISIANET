import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testTP {
        WebDriver driver;

        @Before
        public void prepareDriver(){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        @Test
        public void achatTest() throws InterruptedException {


            driver.get("https://www.tunisianet.com.tn/");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


            // Click on  user
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg")).click();

            // Click on  "Connexion"
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".user-down > li > a > span")).click();


            // Write email
            Thread.sleep(2000);
            driver.findElement(By.name("email")).sendKeys("userTunisiaNet2021@gmail.com");

            // Write password
            Thread.sleep(2000);
            driver.findElement(By.name("password")).sendKeys("TunisiaNet2021");


            // Click  connexion
            Thread.sleep(2000);
            driver.findElement(By.id("submit-login")).click();


            // Search PC portable MacBook M1 13.3
            Thread.sleep(2000);
            driver.findElement(By.id("search_query_top")).sendKeys("PC portable MacBook M1 13.3 ");

            // Click  search
            Thread.sleep(2000);
            driver.findElement(By.name("submit_search")).click();

            // Click first product
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div/div[1]/article/div/div[2]/h2/a")).click();

            // Add product to cart
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();

            // Click commander
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div/div[2]/div/div/a")).click();

            // Confirm order
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div/a")).click();

        }

        @After
        public void quitDriver() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

    }















