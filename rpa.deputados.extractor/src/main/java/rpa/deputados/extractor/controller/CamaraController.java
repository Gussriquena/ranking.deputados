package rpa.deputados.extractor.controller;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
			
			Elements tableAuxilio = document.select("div[id='tabela-em-dinheiro-modal'] [id='conteudo-tabela-comparativa'] tbody td ~ td ~ td ~ td");
			
			String valorAuxilioMoradia = tableAuxilio.get(0).toString();
			
			log.info(valorAuxilioMoradia.replaceAll("\\D", ""));
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

}
