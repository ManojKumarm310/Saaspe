package configuration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import ECommerce.AmazonCart;

public class propertyDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();

	}
	
	public static void getProperties() throws IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		InputStream input = new FileInputStream(path+"\\src\\configuration\\config.properties");
		prop.load(input);
		String browser =prop.getProperty("browser");
		System.out.println(browser);
		//AmazonCart.browsername = browser; 
	}
	
	public static void setProperties() throws IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		OutputStream output = new FileOutputStream(path+"\\src\\configuration\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, null);
	}

}
