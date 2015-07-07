package classes;

public class Financiamento 
{
	private double valorVeiculo, valorEntrada, taxaJuros, valoRendaMensal;
	private int numPrestacoes;
	public Financiamento(double valorVeiculo, double valorEntrada, double taxaJuros, double valoRendaMensal,
			int numPrestacoes) {
		super();
		this.valorVeiculo = valorVeiculo;
		this.valorEntrada = valorEntrada;
		this.taxaJuros = taxaJuros;
		this.valoRendaMensal = valoRendaMensal;
		this.numPrestacoes = numPrestacoes;
	}
	
	public double valorFinanciado()
	{
		return valorVeiculo - valorEntrada;
	}
	
	public double calculoPrestacao()
	{;
		return valorFinanciado()/(1-(1/Math.pow(1+taxaJuros, numPrestacoes)));
	}
	
	public double valorPrestacao()
	{
		return calculoPrestacao()/numPrestacoes;
	}
	
	public boolean aprovaFinanciamento()
	{
		double maximoPrestacao = valoRendaMensal * 0.4;
		if(calculoPrestacao() < maximoPrestacao) return true;
		return false;
	}
	
	
	public double getValorVeiculo() {
		return valorVeiculo;
	}
	public void setValorVeiculo(double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double getValoRendaMensal() {
		return valoRendaMensal;
	}
	public void setValoRendaMensal(double valoRendaMensal) {
		this.valoRendaMensal = valoRendaMensal;
	}
	public int getNumPrestacoes() {
		return numPrestacoes;
	}
	public void setNumPrestacoes(int numPrestacoes) {
		this.numPrestacoes = numPrestacoes;
	}

	public double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	
}
