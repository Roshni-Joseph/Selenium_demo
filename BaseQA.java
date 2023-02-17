package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AddDeleteProduct;
import utils.QaProps;

import javax.xml.datatype.Duration;

public class BaseQA {
    WebDriver driver;
    String url;

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5,SECONDS);
        url = QaProps.getValue("url");


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}