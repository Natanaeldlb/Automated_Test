
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class driver {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\natanael.batista\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kabum.com.br");

        WebElement cookiesAcept = driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookiesAcept.click();

        WebElement boxSearch = driver.findElement(By.id("input-busca"));
        boxSearch.sendKeys("Placa Mãe");

        WebElement buttonSearch = driver.findElement(By.className("hDoVLp"));
        buttonSearch.click();

        WebElement resPage = driver.findElement(By.className("nameCard"));
        String result = resPage.getText();

        if (result.contains("Placa") || result.contains("Mãe")) {
            System.out.println("Primeiro Teste realizado com Sucesso");
        } else {
            System.out.println("Erro na Pesquisa");
        }


            WebElement boxSearch2 = driver.findElement(By.id("input-busca"));
            boxSearch2.clear();

            WebElement boxSearch3 = driver.findElement(By.id("input-busca"));
            boxSearch3.sendKeys("Placa de Video");

            WebElement button = driver.findElement(By.className("lipMks"));
            button.click();

            WebElement resPage2 = driver.findElement(By.className("nameCard"));
            String result2 = resPage2.getText();

            if (result2.contains("Placa") || result2.contains("Video")) {
                System.out.println("Segundo teste realizado com sucesso.");
            } else {
                System.out.println("Erro na Pesquisa");
            }
            driver.close();
        }
    }

