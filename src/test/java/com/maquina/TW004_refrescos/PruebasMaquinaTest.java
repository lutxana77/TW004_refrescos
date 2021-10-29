package com.maquina.TW004_refrescos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebasMaquinaTest {

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
	public void testCrearInformes() {
		
		Refresco ab = new Refresco("Cola",80,25);
		
		Maquina abba = new Maquina( 200, ab);
		
		
		System.out.println("------------------");
		System.out.println(abba.getRefresco().toString());
		System.out.println("Ventas realizadas "+abba.getCantidadVentas());
		System.out.println("Ganancias obtenidas "+abba.getGanancias());
		System.out.println("------------------");
		
		fail("Not yet implemented");
	}
	
	

}
