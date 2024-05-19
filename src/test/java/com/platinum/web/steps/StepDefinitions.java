package com.platinum.web.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class StepDefinitions {
    WebDriver driver;

    @Given("El usuario está en la página de inicio de IPLACEX")
    public void el_usuario_está_en_la_página_de_inicio_de_IPLACEX() {
        driver = new ChromeDriver();
        driver.get("https://www.iplacex.cl");
    }

    @When("El usuario navega a la pestaña {string}")
    public void el_usuario_navega_a_la_pestaña(String string) {
    	// Aqui debo implementar la lógica de búsqueda me perdiii aqui
    }

    @When("El usuario selecciona {string}")
    public void el_usuario_selecciona(String string) {
    	// Aqui debo implementar la lógica de búsqueda me perdiii aqui
    }

    @When("El usuario introduce {string} en el campo de búsqueda")
    public void el_usuario_introduce_en_el_campo_de_búsqueda(String string) {
        // Aqui debo implementar la lógica de búsqueda me perdiii aqui
    }

    @Then("Se muestran los resultados de búsqueda relacionados")
    public void se_muestran_los_resultados_de_búsqueda_relacionados() {
    	// Aqui debo implementar la lógica de búsqueda me perdiii aqui
    }
}
