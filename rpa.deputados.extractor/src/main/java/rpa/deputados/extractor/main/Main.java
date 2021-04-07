package rpa.deputados.extractor.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import rpa.deputados.extractor.controller.CamaraController;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("resources\\log4j.properties");
		
		log.info("Starting flow");
		
		CamaraController camaraController = new CamaraController();
		camaraController.initFlow();
		
		log.info("Process ended");
	}
}
