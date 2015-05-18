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
		// Portal to test - http://demo.opensourcecms.com/wordpress/wp-login.php
		selenium = new DefaultSelenium("localhost", 4444, "*googlechrome*",
				"http://demo.opensourcecms.com/");
		selenium.start();
	}

	@Test
	public void assignment4emerging() {

	}

	@After
	public void done() {
		selenium.stop();
	}
}
