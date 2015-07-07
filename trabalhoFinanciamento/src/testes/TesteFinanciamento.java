package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Financiamento;

public class TesteFinanciamento {

	@Test
	public void testValorFinanciado() 
	{
		double valorCarro = 30000;
		double valorEntrada = 10000;
		double taxaJuros = 0.02;
		int nParcelas = 48;
		double valorRendaMensal = 2500;
		Financiamento finan = new Financiamento(valorCarro, valorEntrada, taxaJuros, valorRendaMensal, nParcelas);
		assertEquals(20000, finan.valorFinanciado(), 0.001);
	}
	
		
	
	@Test
	public void testCalculoPrestacao()
	{
		double valorCarro = 30000;
		double valorEntrada = 10000;
		double taxaJuros = 0.02;
		int nParcelas = 48;
		double valorRendaMensal = 2500;
		Financiamento finan = new Financiamento(valorCarro, valorEntrada, taxaJuros, valorRendaMensal, nParcelas);
		assertEquals(32601.835, finan.calculoPrestacao(), 0.001);
	}
	
	@Test
	public void testValorPrestacao()
	{
		double valorCarro = 30000;
		double valorEntrada = 10000;
		double taxaJuros = 0.02;
		int nParcelas = 48;
		double valorRendaMensal = 2500;
		Financiamento finan = new Financiamento(valorCarro, valorEntrada, taxaJuros, valorRendaMensal, nParcelas);
		assertEquals(679.204, finan.valorPrestacao(), 0.001);
	}

	
}
