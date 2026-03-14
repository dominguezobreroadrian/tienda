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
		assertEquals(resultado.get(0).getNombre(), "Sofá");
	} 
	@Test
	void calcularPrecioTotal() {
		Producto p1 = new Producto("Sofá", 90);
		Tienda t1 = new Tienda();
		t1.agregarProducto(p1);
		
		assertEquals(90, t1.calcularPrecioTotal(), 0.001);
	}
	
	
}
