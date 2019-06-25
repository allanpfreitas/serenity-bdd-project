package com.ateliwareqa.serenity.steps;

import com.ateliwareqa.serenity.pages.AlertasOnlinePage;
import com.ateliwareqa.serenity.pages.LoginPage;
import com.ateliwareqa.serenity.pages.WelcomePage;
import com.ateliwareqa.serenity.steps.serenity.AlertasOnlineUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AlertasOnlineSteps {

    String user = "admin@votorantim.com.br";
    String password = "admin@123";

    @Steps
    AlertasOnlineUserSteps loginPage;

    @Steps
    WelcomePage welcomePg;

    @Steps
    AlertasOnlinePage alertasOnPage;

    //AlertasOnlineUserSteps userSteps = new AlertasOnlineUserSteps();

    @Given("acesso o sistema como admin")
    public void logarComoAdmin(){
        loginPage.login(user,password);
    }

    @When("clicar na opção Alertas Online")
    public void clicarEmAlertasOnline(){
        welcomePg.click_on_alertas_online();
    }

    @Then("deve ser exibido todos os alertas")
    public void checarAUrl(){
        alertasOnPage.checkTheUrl();
    }
}
