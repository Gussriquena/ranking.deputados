package rpa.deputados.extractor.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import rpa.deputados.extractor.constants.PageEnum;

public class CamaraController {
	
	private static Logger log = Logger.getLogger(CamaraController.class);
	
	public void initFlow() {
		
		
		try {
			
			List<String> depNames = new ArrayList<>(); 
			
			for (int pageCount = 1; pageCount < 28; pageCount++) {
				Document document = Jsoup.connect(PageEnum.URL_CAMARA_LISTA_FOLHA.getValue())
						.data("search", "")
						.data("areaDeAtuacao", "")
						.data("categoriaFuncional", "Deputado")
						.data("amp;situacao", "Em%20exerc�cio")
						.data("pagina", "" + pageCount + "")
						.get();
				
				Elements allLinks = document.select("[class='tabela-responsiva__linha']");
				
				for (Element element : allLinks) {
					depNames.add(element.select("[data-th='Remunera��o'] > a").attr("href"));
					//log.info(element.select("[data-th='Nome'] > a").text() + " - " + element.select("[data-th='Remunera��o'] > a").attr("href"));
				
					// tr[class=tabela-responsiva__linha]
				}
			}
			
			//for (String depLink : depNames) {
				Document document = Jsoup.connect("https://www.camara.leg.br/transparencia/recursos-humanos/remuneracao/DEdGyYroXbwnBb8AO7eg")
						.data("ano", "2021")
						.data("mes", "3")
						.get();
				
				Elements tableRows = document.select("tr[class=tabela-responsiva__linha]");
				
				for (Element row : tableRows) {
					if (row.text().contains("Remunera��o ap�s Descontos Obrigat�rios")) {
						log.info(row.text());
					} else if(row.text().contains("Aux�lios")){
						log.info(row.text());
					} else if(row.text().contains("Di�rias")){
						log.info(row.text());
					} else if(row.text().contains("Gratifica��o Natalina")){
						log.info(row.text());
					} else if(row.text().contains("F�rias (1/3 Constitucional)")){
						log.info(row.text());
					} 
				}
			//}
			
			/*
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
				// 4 - sal�rio bruto
				//log.info(element.toString().replaceAll("\\D", ""));
			}*/
			
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

}
