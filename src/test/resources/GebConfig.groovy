/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

// Use firefox as the default
// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
//driver = { new FirefoxDriver() }
driver = { new ChromeDriver() }

environments {
	
	// run as “gradle -Dgeb.env=chrome cucumber”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}
	
	// run as “gradle -Dgeb.env=phantomjs cucumber”
	// See: https://github.com/detro/ghostdriver
	phantomjs {
		driver = { new PhantomJSDriver() }
	}

}

baseUrl = "http://dl2k469v.am.mot-mobility.com:8080/productanalytics"

baseNavigatorWaiting = true