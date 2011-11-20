package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dojo.AnoBissexto;

public class AnoBissextoTest {

	@Test
	public void verificaSeEUmAnoBissexto2011() {
		String anoBissexto = AnoBissexto.calculaAnoBissexto(2011);
		assertEquals("2011 não é um ano bissexto!", anoBissexto);
	}
	
	@Test
	public void verificaSeEUmAnoBissexto1600() {
		String anoBissexto = AnoBissexto.calculaAnoBissexto(1600);
		assertEquals("1600 é um ano bissexto!", anoBissexto);
	}
	
	@Test
	public void verificaSeEUmAnoBissexto1732() {
		String anoBissexto = AnoBissexto.calculaAnoBissexto(1732);
		assertEquals("1732 é um ano bissexto!", anoBissexto);
	}
	
	@Test
	public void verificaSeEUmAnoBissexto1742() {
		String anoBissexto = AnoBissexto.calculaAnoBissexto(1742);
		assertEquals("1742 não é um ano bissexto!", anoBissexto);
	}

}


