package com.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class ActionDriver {


		private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
		private String browser;
		private Logger log;

		public ActionDriver(String browser, Logger log) {
			this.browser = browser.toLowerCase();
			this.log = log;
		}
		@Parameters({ "browser" })
		public WebDriver createDriver() {
			// Create driver
			log.info("Create driver: " + browser);

			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver.set(new ChromeDriver());
				break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
				driver.set(new FirefoxDriver());
				break;

			default:
				System.out.println("Do not know how to start: " + browser + ", starting chrome.");
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver.set(new ChromeDriver());
				break;
			}

			return driver.get();
		}
}
