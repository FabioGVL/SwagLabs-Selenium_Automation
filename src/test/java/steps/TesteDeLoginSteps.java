package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TesteDeLoginSteps{

    WebDriver robozinho;

    @Before
    public void inicio(){

        System.setProperty("webdriver.chrome.driver",
                "C:\\Windows\\chromedriver.exe");

        robozinho = new ChromeDriver();
        robozinho.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void fim(){

        robozinho.quit();
    }

    @Dado("que o usuario esta na tela de login")
    public void que_o_usuario_esta_na_tela_de_login() {

        robozinho.get("https://www.saucedemo.com");

    }

    @Quando("preenche username com {string} e password com {string}")
    public void preenche_username_com_e_password_com(String usuario, String senha)  {

        robozinho.findElement(By.id("user-name")).sendKeys(usuario);
        robozinho.findElement(By.id("password")).sendKeys(senha);

    }

    @E("clica no botao LOGIN")
    public void clica_no_botao_login() {

        robozinho.findElement(By.id("login-button")).click();

    }

    @Entao("deve ter {string}")
    public void deve_ter(String resultado) {

        if(resultado.equals("sucesso")){

            Assertions.assertEquals("https://www.saucedemo.com/inventory.html",
                    robozinho.getCurrentUrl());
        }

        if(resultado.equals("invalido1")){

            Assertions.assertEquals("Epic sadface: Username and password do not match any user in this service",
                    robozinho.findElement(By.tagName("h3")).getText());
        }

        if(resultado.equals("invalido2")){

            Assertions.assertEquals("Epic sadface: Password is required",
                    robozinho.findElement(By.tagName("h3")).getText());
        }

        if(resultado.equals("invalido3")){

            Assertions.assertEquals("Epic sadface: Username is required",
                    robozinho.findElement(By.tagName("h3")).getText());
        }

    }

}