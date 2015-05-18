package com.jmatharu.seleniumRC;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class TestWebPage {

	Selenium selenium;

	@Before
	public void setup() {
		// for IE = "internetexplorer" // for Firefox = "firefox"
		// Root Portal - http://www.opensourcecms.com/
		// Portal Details and Credentials -
		// http://www.opensourcecms.com/scripts/details.php?scriptid=88&name=WordPress
		// Portal to test -
		// http://demo.opensourcecms.com/wordpress/wp-login.php;
		// in which "http://demo.opensourcecms.com" is domain
		// and
		// "wordpress/wp-login.php" is Location where I need to go.
		selenium = new DefaultSelenium("localhost", 4444, "*googlechrome",
				"http://demo.opensourcecms.com/");
		selenium.start();
	}

	@Test
	public void loginWordPress() throws InterruptedException {
		selenium.open("wordpress/wp-login.php");
		selenium.type("id=user_login", "admin");
		selenium.type("id=user_pass", "demo123");
		selenium.click("id=wp-submit");
		selenium.waitForPageToLoad("10000");
		selenium.click("link=Posts");
		selenium.waitForPageToLoad("10000");
		selenium.click("link=Add New");
		selenium.waitForPageToLoad("10000");
		selenium.type("id=title", "New Jagdeep Blog Post!");
		selenium.type("id=content",
				"This is first Blog Post from Selenium RC Automatio Tool, by Jagdeep Matharu");
		selenium.click("id=publish");
		selenium.waitForPageToLoad("10000");
		selenium.click("link=All Posts");
		Thread.sleep(10000);

	}

	@After
	public void done() {
		selenium.stop();
	}
}
