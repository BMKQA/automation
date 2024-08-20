package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MyAppTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public  void test() {
        System.out.println("Hello World!");
        WebDriver wb=new EdgeDriver();
        try {
            wb.manage().window().fullscreen();
            wb.get("https://app-adidas.trustrace.xyz");
            System.out.println(wb.getTitle());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }finally{
            wb.quit();
        }
    }
}
