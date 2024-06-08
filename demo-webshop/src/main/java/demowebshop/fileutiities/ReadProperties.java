package demowebshop.fileutiities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
/**
 * @author Abeshakekumaur R S
 */
public class ReadProperties {
FileInputStream fis;

public String fetchProperties(String Key)
{
	try {
		fis=new FileInputStream("./src/test/resources/data.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties prop=new Properties();
	try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String data=prop.getProperty(Key);
	return data;

	
}
}
