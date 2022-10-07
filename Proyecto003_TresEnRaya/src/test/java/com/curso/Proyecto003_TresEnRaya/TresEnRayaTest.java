package com.curso.Proyecto003_TresEnRaya;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TresEnRayaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sumarDosMasDosDara4() {
		//datos entrada
		
		TresEnRaya juego = new TresEnRaya();
		int n=2;
		int n2=2;
		
		//resultado esperado
		
		int espero = 4;
		
		//resultado real
		
		int r= juego.suma(n,n2);
		
		//si no coinciden fallo
		
		if (espero != r) fail("No ha sumado 2+2=4 sino que el resultado " + r); 
		
		
	}
	@Test(expected = RuntimeException.class)
	public void PonerFichaCoordenadaXMalLanzaUnaExcepcion() {
		
		TresEnRaya juego = new TresEnRaya();
		// 3 filas y 3 columnas (0 a 2)
		juego.jugar(4,2); //falla si no lanza un RuntimeException
		
	}
	
	@Test(expected = RuntimeException.class)
	public void PonerFichaCoordenadaYMalLanzaUnaExcepcion() {
		
		TresEnRaya juego = new TresEnRaya();
		// 3 filas y 3 columnas (0 a 2)
		juego.jugar(2,4); //falla si no lanza un RuntimeException
		
	}
	
	@Test(expected = RuntimeException.class)
	public void ponerFichaEnPocicionQueYaHayOtraLanzaUnaExcepcion() {
		
		//Preparar escenario 
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		
		juego.jugar(0, 0); //debe lanzar una excepcion
		
		
	}
	
	@Test
	public void ponerFichaXeYBienEsperaQueEnEstaPocicioNoSeaNull() {
		
		TresEnRaya juego = new TresEnRaya();
		
		juego.jugar(0, 0); 
		
		if (juego.verFicha(0,0) == null) {
			fail("La ficha debe esta en pocicion y no hay ficha");
		}
		
	}

}
