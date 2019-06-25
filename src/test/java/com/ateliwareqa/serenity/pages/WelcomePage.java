package com.ateliwareqa.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

public class WelcomePage extends PageObject {

    @FindBy(linkText = "Alertas online")
    private WebElementFacade alertasOnlineLink;

    public void click_on_alertas_online (){
        alertasOnlineLink.click();
    }

}
