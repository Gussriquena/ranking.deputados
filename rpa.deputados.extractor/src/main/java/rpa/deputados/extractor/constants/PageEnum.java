package rpa.deputados.extractor.constants;

import rpa.deputados.extractor.util.ConfigReader;

public enum PageEnum {
	
	URL_CAMARA_LISTA_FOLHA(ConfigReader.read("url.camara.lista.folha"));
	
	private String value;
	
	private PageEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
