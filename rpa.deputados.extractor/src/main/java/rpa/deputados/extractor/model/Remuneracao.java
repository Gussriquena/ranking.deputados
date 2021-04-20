package rpa.deputados.extractor.model;

import java.math.BigDecimal;

public class Remuneracao {
	
	private int idRemuneracao;
	private int idDeputado;
	private BigDecimal verbaGabinete;
	private BigDecimal auxilioMoradia;
	private String mes;
	private String ano;
	private BigDecimal viagens;
	private int aptoFuncional;
	private BigDecimal remuneracaoNatalina;
	private BigDecimal remuneracaoComplementar;
	private BigDecimal remuneracaoLiquida;
	private BigDecimal remuneracaoVantagens;
	
	public Remuneracao() {
		
	}
	
	public Remuneracao(int idRemuneracao, int idDeputado, BigDecimal verbaGabinete, BigDecimal auxilioMoradia,
			String mes, String ano, BigDecimal viagens, int aptoFuncional, BigDecimal remuneracaoNatalina,
			BigDecimal remuneracaoComplementar, BigDecimal remuneracaoLiquida, BigDecimal remuneracaoVantagens) {
		this.idRemuneracao = idRemuneracao;
		this.idDeputado = idDeputado;
		this.verbaGabinete = verbaGabinete;
		this.auxilioMoradia = auxilioMoradia;
		this.mes = mes;
		this.ano = ano;
		this.viagens = viagens;
		this.aptoFuncional = aptoFuncional;
		this.remuneracaoNatalina = remuneracaoNatalina;
		this.remuneracaoComplementar = remuneracaoComplementar;
		this.remuneracaoLiquida = remuneracaoLiquida;
		this.remuneracaoVantagens = remuneracaoVantagens;
	}

	public int getIdRemuneracao() {
		return idRemuneracao;
	}

	public void setIdRemuneracao(int idRemuneracao) {
		this.idRemuneracao = idRemuneracao;
	}

	public int getIdDeputado() {
		return idDeputado;
	}

	public void setIdDeputado(int idDeputado) {
		this.idDeputado = idDeputado;
	}

	public BigDecimal getVerbaGabinete() {
		return verbaGabinete;
	}

	public void setVerbaGabinete(BigDecimal verbaGabinete) {
		this.verbaGabinete = verbaGabinete;
	}

	public BigDecimal getAuxilioMoradia() {
		return auxilioMoradia;
	}

	public void setAuxilioMoradia(BigDecimal auxilioMoradia) {
		this.auxilioMoradia = auxilioMoradia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public BigDecimal getViagens() {
		return viagens;
	}

	public void setViagens(BigDecimal viagens) {
		this.viagens = viagens;
	}

	public int getAptoFuncional() {
		return aptoFuncional;
	}

	public void setAptoFuncional(int aptoFuncional) {
		this.aptoFuncional = aptoFuncional;
	}

	public BigDecimal getRemuneracaoNatalina() {
		return remuneracaoNatalina;
	}

	public void setRemuneracaoNatalina(BigDecimal remuneracaoNatalina) {
		this.remuneracaoNatalina = remuneracaoNatalina;
	}

	public BigDecimal getRemuneracaoComplementar() {
		return remuneracaoComplementar;
	}

	public void setRemuneracaoComplementar(BigDecimal remuneracaoComplementar) {
		this.remuneracaoComplementar = remuneracaoComplementar;
	}

	public BigDecimal getRemuneracaoLiquida() {
		return remuneracaoLiquida;
	}

	public void setRemuneracaoLiquida(BigDecimal remuneracaoLiquida) {
		this.remuneracaoLiquida = remuneracaoLiquida;
	}

	public BigDecimal getRemuneracaoVantagens() {
		return remuneracaoVantagens;
	}

	public void setRemuneracaoVantagens(BigDecimal remuneracaoVantagens) {
		this.remuneracaoVantagens = remuneracaoVantagens;
	}
	
}
