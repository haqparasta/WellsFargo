package core;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Base {

	// This is the parent of all classes in this framework.
	// It will contain all of the properties of the WebDriver
	// It will also have all of the properties of logger log4j
	// The base class will read input from projectProperty.properties file such as
	// the framework url, implicit wait and pageLoadTimeoutWait

	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private static String projectPropertyFilePath = ".\\src\\test\\resources\\InputData\\projectProperty.properties";
	private static String log4JFilePath = ".\\src\\test\\resources\\InputData\\log4j.properties";

	public Base() {
		
		//We will use BufferReader

	}

}
