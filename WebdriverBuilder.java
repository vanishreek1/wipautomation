package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBuilder {
  static WebDriver dr;

  public static WebDriver getdriver() {
    if (dr == null) {
      System.setProperty("webdriver.chrome.driver", "/Users/vanishree/Downloads/chromedriver");
      dr = new ChromeDriver();
    }
    return dr;
  }

}
