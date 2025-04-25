package com.home.learning.poc.app2.action;

import com.home.learning.poc.springlib.action.ActionComponent;

public class AppActionComponent extends ActionComponent {

    public void click(String localLocator){
        System.out.println("The locator from Framework " + localLocator);
    }

    public void clickAndWait(String localLocator, String validationLocator){
        //Read the locator value from the DB using hte received input.
        //Change string to By (Selenium Class)
        //Find locator using findElement(Selenium Method)
        //Click on the Method,
        // Wait for the validationLocator element to arrive.
        //Report the validation locator found or not
        System.out.println("The locator from app " + localLocator);
    }

    public void launchAppUrl(String url){
        System.out.println(url);
    }

}
