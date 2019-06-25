package com.ateliwareqa.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;

public class AlertasOnlinePage extends PageObject {

    public String checkTheUrl(){

        String url = getDriver().getCurrentUrl();
        return url;
    }
}
