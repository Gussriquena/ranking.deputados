package rpa.deputados.extractor.controller;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CamaraController {
	
	private static Logger log = Logger.getLogger(CamaraController.class);
	
	public void initFlow() {
		
		
		try {
			Document document = Jsoup.connect("https://www.camara.leg.br/transparencia/gastos-parlamentares")
					.data("legislatura", "56")
					.data("ano", "2021")
					.data("mes", "JAN")
					.data("por", "deputado")
					.data("deputado", "141372")
					.get();
			
			Elements todosValores = document.select("p[class='gastos__resumo-texto gastos__resumo-texto--destaque']");
			for (Element element : todosValores) {
				log.info(element.toString());
				// 1 - cota parlamentar
				// 2 - verba de gabinete
				// 3 - auxilio moradia
				// 4 - salário bruto
				//log.info(element.toString().replaceAll("\\D", ""));
			}
			
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

}
