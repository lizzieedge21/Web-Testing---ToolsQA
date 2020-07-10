package com.sparta.ee;

import org.openqa.selenium.WebDriver;

public class PicturePage {
    WebDriver webDriver;

    public PicturePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getUrl () {
        return webDriver.getCurrentUrl();
    }


}
