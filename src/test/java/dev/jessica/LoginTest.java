package dev.jessica;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception{
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.br/");
    }


    @AfterEach
    void tearDown() throws Exception{
    }

    @Test
    void test() throws Exception {
        WebElement clicarFazerLogin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        clicarFazerLogin.click();
        Thread.sleep(300);
        WebElement inserirEmail =driver.findElement(By.id("ap_email"));
        Thread.sleep(300);
        inserirEmail.sendKeys("INSIRA SEU EMAIL" + Keys.ENTER);

        WebElement inserirSenha = driver.findElement(By.id("ap_password"));
        inserirSenha.sendKeys("INSIRA SUA SENHA" + Keys.ENTER);
        Thread.sleep(100);

        WebElement buscarlivro = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        buscarlivro.click();
        buscarlivro.sendKeys("A guerra da Papoula" + Keys.ENTER);
        Thread.sleep(250);

        WebElement selecionarLivro = driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > div > div > div > div.s-product-image-container.aok-relative.s-image-overlay-grey.s-text-center.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img"));
        selecionarLivro.click();
        Thread.sleep(250);


        WebElement addCarrinho = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        addCarrinho.click();


    }
}
