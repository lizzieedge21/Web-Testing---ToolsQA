package com.sparta.ee;

import org.openqa.selenium.WebDriver;

public class TitleLink {

    WebDriver webDriver;

    public TitleLink(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getUrl() {
        return webDriver.getCurrentUrl();
    }


}
