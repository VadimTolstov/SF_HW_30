package ru.sf;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {
   // public static final  Get get;
    private static final WebDriver webDriver;

    //статический конструктор в котором мы поместим наш путь к веб драйверу
    static {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Given("url of h&m {string}")
    public void url_of_h_m(String url) {
        webDriver.get(url);
    }
}
