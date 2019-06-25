package com.ateliwareqa.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

public class LoginPage extends PageObject {

    @FindBy(id="session_email")
    private WebElementFacade login;

    @FindBy(id="session_password")
    private WebElementFacade pass;

    @FindBy(className = "submit-label")
    private WebElementFacade button;

    public void make_login (String user, String password){
        login.type(user);
        pass.type(password);
        button.click();

    }






}
