package com.sparta.ee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import javax.swing.*;

public class HomePage {
    WebDriver webDriver;
    By homepage = new By.ByLinkText("home");
    By title = new By.ByTagName("Header");
    By picture = new By.ByClassName("Advertisement-section");

    public HomePage (WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        webDriver.get("https://demoqa.com/automation-practice-form");
    }

    public void goToHomePage () {
        webDriver.findElement(homepage).click();
    }

    public TitleLink checkTitle () {
        webDriver.findElement(title).click();
        return new TitleLink(webDriver);
    }

    public boolean checkFirstNameBox () {
        WebElement namebox = webDriver.findElement(By.id("firstName"));
        namebox.sendKeys("Lizzie");
        namebox.submit();
        return namebox.isDisplayed();
    }

    public boolean checkLastNameBox () {
        WebElement namebox = webDriver.findElement(By.id("lastName"));
        namebox.sendKeys("Edge");
        namebox.submit();
        return namebox.isDisplayed();
    }

    public boolean checkEmailBox () {
        WebElement email = webDriver.findElement(By.id("userEmail"));
        email.sendKeys("elizabeth.edge@yahoo.com");
        return email.isDisplayed();
    }

    public Color checkIsEmailBoxRed () {
        WebElement email = webDriver.findElement(By.id("userEmail"));
        email.sendKeys("Hello");
        email.submit();
        Color colourValue = Color.fromString(email.getCssValue("border-color"));
        return colourValue;
    }

    public PicturePage checkPictureLink () {
       webDriver.findElement(picture).click();
       return new PicturePage(webDriver);
    }

    public Color nameBoxRed () {
        WebElement box = webDriver.findElement(By.id("firstName"));
        box.sendKeys(" ");
        box.submit();
        Color errorColour = Color.fromString(box.getCssValue("border-color"));
        return errorColour;
        }

        public Color nameBoxGreen () {
        WebElement box = webDriver.findElement(By.id("firstName"));
        box.sendKeys("Elizabeth");
        box.submit();
        Color errorColour = Color.fromString(box.getCssValue("border-color"));
        return errorColour;
        }

        public boolean dropBox () {
        String dropbox = webDriver.findElement(By.className("header-wrapper")).getText();
            return dropbox.contains("Text Box");
        }

    }














