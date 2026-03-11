package com.miempresa.entidad;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	@Test
	void testgetNombre() {
		Producto p1 = new Producto("Lámpara", 37.9);
		String resultado = p1.getNombre();
		String resultadoEsperado = "Lámpara";
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	void testgetPrecio() {
		Producto p2 = new Producto("Lámpara", 37.9);
		double resul = p2.getPrecio();
		double resultEsperado = 37.9;
		assertEquals(resultEsperado, resul, 0.001);
	}
	
	@Test
	void testSetNombre() {
		Producto p1 = new Producto("Lámpara", 37.9);
		p1.setNombre("Sofá");
		String resultado = p1.getNombre();
		String resultadoEsperado = "Sofá";
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testSetPrecio() {
		Producto p1 = new Producto("Lámpara", 37.9);
		p1.setPrecio(30);
		double resultado = p1.getPrecio();
		double resultadoEsperado = 30;
		assertEquals(resultadoEsperado, resultado, 0.001);
		 
		assertThrows(IllegalArgumentException.class, () -> {
	        p1.setPrecio(-10);
	    });
	}
}
