package com.sparta.ee;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SiteTesterPOM {

    WebDriver webDriver = new ChromeDriver();
    HomePage connector = new HomePage(webDriver);
    TitleLink titleLink = new TitleLink(webDriver);
    PicturePage picturePage = new PicturePage(webDriver);

    @Test
    public void checkFirstName () {
        Assertions.assertEquals(true, connector.checkFirstNameBox());
    }

    @Test
    @DisplayName("Can type Last Name")
    public void checkLastName () {
        Assertions.assertEquals(true, connector.checkLastNameBox());
    }

    @Test
    public void checkTitleLink () {
        Assertions.assertEquals("\"https://demoqa.com/", titleLink.getUrl());
    }


    @Test
    @DisplayName("Can click picture link")
    public void checkPictureLink () {
        Assertions.assertEquals("https://reflect.run/?utm_source=demoqaad&utm_medium=cpc&utm_campaign=robust", picturePage.getUrl());
    }


    @Test
    @DisplayName("Box is red when empty email isnt in right form")
    public void checkBoxIsRed () {
        Assertions.assertEquals("rgb(220, 53, 69)", connector.checkIsEmailBoxRed().asRgb());
    }


    @Test
    @DisplayName("Box is green when full")
    public void checkBoxIsGreen () {
        Assertions.assertEquals("rgb(119, 187, 236)", connector.nameBoxGreen().asRgb());
    }

    @Test
    @DisplayName("Name box is red because empty")
    public void checkNameBoxIsRed () {
        Assertions.assertEquals("rgb(220, 53, 69)", connector.nameBoxRed());
    }





  }
