package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {


    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/Users/jovidonbegov/Desktop/selenium dependencies/drivers/geckodriver");

        WebDriver driver =new FirefoxDriver();

        driver.get("https:jira.cybertek.school.com");





    }
}