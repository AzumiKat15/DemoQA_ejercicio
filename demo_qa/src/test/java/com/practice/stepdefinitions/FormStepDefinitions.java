package com.practice.stepdefinitions;

import com.practice.pages.FormPage;
import com.practice.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.Locale;
import java.util.logging.Logger;


public class FormStepDefinitions extends WebUI {



    public static Logger LOGGER = Logger.getLogger(String.valueOf(FormStepDefinitions.class));

    @Given("el administrador esta en la pagina principal")
    public void elAdministradorEstaEnLaPaginaPrincipal() {

        generalSetUp();
        LOGGER.info("Inicio de automatización");

    }

    @When("navega hasta la opcion")
    public void navegaHastaLaOpcion() {
        //inicializa la opcion
        FormPage formPage = new FormPage(super.driver);
        formPage.fillMandatoryFields();
    }

    @When("completa los campos con la informacion del estudiate")
    public void completaLosCamposConLaInformacionDelEstudiate() {

    }

    @Then("debe observar una ventana con la informacion ingresada")
    public void debeObservarUnaVentanaConLaInformacionIngresada() throws InterruptedException {

        Thread.sleep(5000);
        Assertions.assertEquals(
                "pedro",
                "David",
        String.format("Los valores suministrados no son los esperados %s ", "pedro", "David")
);
        quiteDriver();
    }

}


    
