package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo CirculoDeRadio2 = new Circulo ();
		CirculoDeRadio2.definiendoElRadio (2.00);
		assertEquals (2.00, CirculoDeRadio2.conocerElRadio().doubleValue(), 0.10 );	
		
	}
			
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo CirculoDeRadio3Punto7 = new Circulo ();
		CirculoDeRadio3Punto7.definiendoElRadio (3.70);
		assertEquals (3.70, CirculoDeRadio3Punto7.conocerElRadio().doubleValue(), 0.10 );	
		
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo CirculoDeRadio5 = new Circulo ();
		CirculoDeRadio5.definiendoElRadio (5.00);
		assertEquals (5.00, CirculoDeRadio5.conocerElRadio().doubleValue(), 0.10 );	
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo CirculoDeRadio10Punto9 = new Circulo ();
		CirculoDeRadio10Punto9.definiendoElRadio (10.90);
		assertEquals (10.90, CirculoDeRadio10Punto9.conocerElRadio().doubleValue(), 0.10 );	
		
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo CirculoDeRadio9Punto8 = new Circulo ();
		CirculoDeRadio9Punto8.definiendoElRadio (9.80);
		assertEquals (61.57, CirculoDeRadio9Punto8.conocerElPerimetro().doubleValue(), 0.10);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto7() {
		Circulo CirculoDeRadio16Punto6 = new Circulo ();
		CirculoDeRadio16Punto6.definiendoElRadio(16.6);
		assertEquals (865.67, CirculoDeRadio16Punto6.conocerElArea().doubleValue (), 0.10);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		

		
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
