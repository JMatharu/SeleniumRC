package com.jmatharu.seleniumRC;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class TestWordPressMultiTest {

	// In this test you will create as many test cases and "Before" and "After"
	// scenario will run just one

	static Selenium selenium;

	@BeforeClass
	public static void setup() {
		selenium = new DefaultSelenium("localhost", 4444, "*googlechrome",
				"http://demo.opensourcecms.com/");
		selenium.start();
	}

	@Test
	public void testloginWordPress() throws InterruptedException {
		selenium.open("wordpress/wp-login.php");
		selenium.type("id=user_login", "admin");
		selenium.type("id=user_pass", "demo123");
		selenium.click("id=wp-submit");
		//Thread.sleep(2000);
		selenium.waitForPageToLoad("10000");
	}

	@Test
	public void testloginWordPress2() throws InterruptedException {
		selenium.open("wordpress/wp-login.php");
		selenium.type("id=user_login", "admin");
		selenium.type("id=user_pass", "demo123");
		selenium.click("id=wp-submit");
		//Thread.sleep(2000);
		selenium.waitForPageToLoad("100000");
	}

	@AfterClass
	public static void done() {
		selenium.stop();
	}

}
