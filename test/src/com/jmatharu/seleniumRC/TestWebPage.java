package com.jmatharu.seleniumRC;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestWebPage {

	@Before
	public void setup() {
		
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*googlechrome*", "http://assignment4emerging.herokuapp.com/login");
		selenium.start();
	}

	@Test
	public void assignment4emerging() {

	}

	@After
	public void done() {

	}

}
