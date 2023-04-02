import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
        private WebDriver webDriver;//создание переменной webDriver

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();//конфигурация хром драйвера, есть и другие
        webDriver = new ChromeDriver();//иницилизация переменной, на этом этапи открывается страничка драйвера
    }

    @Test
    public void test() {

        webDriver.navigate().to("https://www.google.com/");//открываем страничку сайта
        //веб элемент                     таким способом найходит элементы и поиск по икспасу
        WebElement webElement = webDriver.findElement(By.xpath("//*[@name='q']"));
        webElement.sendKeys("yandex");//вводим в поле текст
        webDriver.quit();//закрываем брайузер
    }

    /*WebDriver - Самый важный компонент, который ответствен за управление браузером.
    Тесты строятся вокруг работы с экземпляром этой сущности.

    WebElement - Не менее важная сущность, которая абстрактно описывает все элементы на веб-страницах,
    будь то кнопки, ссылки, поля для ввода, чекбоксы или что-то другое. В реализации WebElement используются
    методы взаимодействия с этими элементами и получения их статуса, например, видимости на веб-странице.

    By - Эта сущность работает с локатором элемента; сюда передаётся селектор, например CSS, id или XPATH.     */
}
