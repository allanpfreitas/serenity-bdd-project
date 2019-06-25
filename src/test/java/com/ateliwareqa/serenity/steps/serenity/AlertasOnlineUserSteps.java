package com.ateliwareqa.serenity.steps.serenity;

import com.ateliwareqa.serenity.pages.AlertasOnlinePage;
import com.ateliwareqa.serenity.pages.LoginPage;
import com.ateliwareqa.serenity.pages.WelcomePage;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;


public class AlertasOnlineUserSteps {

    LoginPage loginpage;
    WelcomePage welcomepage;
    AlertasOnlinePage alertaspage;

    @Step
    public void login(String user, String pass){
        loginpage.open();
        loginpage.make_login(user,pass);
    }

    @Step
    public void clickOnAlertasOnline(){
        welcomepage.click_on_alertas_online();
    }

    @Step
    public void deveSerExibidoTodosAlertas(){

        assertEquals("http://ec2-13-59-41-131.us-east-2.compute.amazonaws.com:4000/",alertaspage.checkTheUrl());

    }


}
