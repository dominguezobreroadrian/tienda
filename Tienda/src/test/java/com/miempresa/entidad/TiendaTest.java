package com.miempresa.entidad;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	@Test
	void agregarProducto() {
		Producto p1 = new Producto("Sofá", 90);
		Tienda t1 = new Tienda();
		t1.agregarProducto(p1);
		List<Producto> resultado = t1.obtenerProductos();
		
		assertEquals(1, resultado.size());
	}
	
	@Test
	void obtenerProductos() {
		Producto p1 = new Producto("Sofá", 90);
		Tienda t1 = new Tienda();
		t1.agregarProducto(p1);
		List<Producto> resultado = t1.obtenerProductos();
		assertEquals("Sofá", resultado.get(0).getNombre());
	} 
	@Test
	void calcularPrecioTotal() {
		Producto p1 = new Producto("Sofá", 90.5);
		Producto p2 = new Producto("Lámpara", 90.5);
		Tienda t1 = new Tienda();
		
		t1.agregarProducto(p1);
		t1.agregarProducto(p2);
		
		double resultado = t1.calcularPrecioTotal();
		assertEquals(181.0, resultado, 0.001);
	}
	
	
}
