package rpa.deputados.extractor.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("resources\\log4j.properties");
		
		log.info("Hello world");
	}
}
