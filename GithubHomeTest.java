package com.githubauto.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class GithubHomeTest {

  /**
   * 1. Open Browser, go to Github.com 2. Verify the title
   * 
   * Automation: Using page model actions > drive the pages > 1. Create a webdriver(firefox/chrome)
   * 2. Create a githubhome page instance and pass driver to it 3. GithubHomePage.load > will load
   * Github Home page 4. GithubHomePage.getTitle -> get the title 2. Load apge using "driver.get"
   * method get the title verify the title
   *
   */
  public WebDriver driver;

  public GithubHomeTest() {

    driver = WebdriverBuilder.getdriver();

  }

  @Test
  public void verifyTitleWithoutLogin() {
    GitHubHomePage homePage = new GitHubHomePage(driver);
    homePage.load();
    String title = homePage.getTitle();
    Assert.assertEquals("The world's leading software development platform · GitHub", title);

  }

  @Test
  public void verifyFeatureTitle() {
    GitHubHomePage home = new GitHubHomePage(driver);
    home.load();

    GitHubFeatures features = new GitHubFeatures(driver);
    home.GotoFeatures();

    String featureTitle = features.getTitle();
    System.out.println(featureTitle);
    Assert.assertEquals(
        "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub",
        featureTitle);
  }


}

// create a webdriverbuilder
// create a instance get driver
// that driver should return a static variable
// go through java singleton class and try to implement for webdriver builder
