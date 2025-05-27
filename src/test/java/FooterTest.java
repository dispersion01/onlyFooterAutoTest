import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

import static org.junit.Assert.assertNotNull;


public class FooterTest {

  private WebDriver driver;

    @Before
    public void setUp(){
         driver = new ChromeDriver();
    }

    @Test
    public void testFooter(){
        driver.get("https://only.digital");

        WebElement footer = driver.findElement(By.tagName("footer"));

        assertNotNull ("Footer найден", footer);

        /*  WebElement logo = driver.findElement(By.cssSelector(".footer-logo"));
        Assert.assertTrue("Логотип в футере найден",logo.isDisplayed());

        WebElement contact = driver.findElement(By.cssSelector(".footer-contacts"));
        Assert.assertTrue("Контакты в футере найдены", contact.isDisplayed()); 

        WebElement classElement = driver.findElement(By.className("footer"));
        assertNotNull("Класс футер найден", classElement.isDisplayed()); */
    }
    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
