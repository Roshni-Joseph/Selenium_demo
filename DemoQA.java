package tests;

import com.sun.source.tree.AssertTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddDeleteProduct;
import utils.QaProps;

import javax.lang.model.element.Element;

import java.util.List;

import static java.lang.Thread.sleep;

public class DemoQA extends BaseQA{



//    @Test
//    public void testCase1() {
//
//
//        driver.get("https://www.amazon.in/");
//
//        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//
//        element.sendKeys("mobiles");
//        element.sendKeys(Keys.ENTER);
//
//        String search = driver.findElement(By.xpath("//span[@class=\"a-color-state a-text-bold\"]")).getText();
//        Assert.assertEquals(search,"\"mobiles\"");
////        if(search.equals("\"mobiles\"")){
////            System.out.println("Displayed");
////        }
////        else {
////            System.out.println("Not Displayed");
////        }
//
//    }




    @Test
    public void testCase2(){
        driver.get("https://leafground.com/table.xhtml");
        WebElement table = driver.findElement(By.xpath("(//table[@role=\"grid\"])[2]"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i=0;i<rows.size();i++){
            List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
            for (int j=0;j<column.size();j++){
                System.out.println(column.get(j).getText());
            }
        }


    }

    @Test
    public  void testCase3() throws InterruptedException {
        driver.get(url+"/grid.xhtml");

//        QaProps qaProps = new QaProps();
//        QaProps.init();



        AddDeleteProduct newproducts = new AddDeleteProduct(driver);
        newproducts.getAddProduct().click();
        Thread.sleep(2000);
        newproducts.getProductName().sendKeys("New_product");
        newproducts.getYesButton().click();

//        driver.findElement(By.className("ui-chkbox-icon ui-icon ui-c ui-icon-check")).click();
//
//
//        driver.findElement(By.id("form:dt-products:0:j_idt115")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[17]")).click();

//        driver.findElement(By.id("form:j_idt90")).click();


//        driver.findElement(By.xpath("(//input[@role=\"textbox\"])[5]")).sendKeys("New_product");
//
//        driver.findElement(By.id("form:j_idt153")).click();
//        String prdt = driver.findElement(By.className("ui-growl-title")).getText();
//        Assert.assertEquals(prdt,"\"New product\"");

    }

//    @Test
//    public void testCase4(){
//
//    }






}
