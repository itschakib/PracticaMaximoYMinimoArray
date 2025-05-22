package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import clases.Funciones;

public class TestMinimo {

	@Test
	public void testMinimoPositivos() {
		// array con valores positivos y 0
		int[] datos = { 5, 3, 7, 1, 2, 6, 4, 8, 9, 0 };
		int resultado = Funciones.minimoArray(datos);
		assertEquals(0, resultado);
	}

	@Test
	public void testMinimoNegativos() {
		// solo negativos y 0 y el minimo es -9
		int[] datos = { -3, -1, -6, -2, -7, -5, -9, -4, -8, 0 };
		int resultado = Funciones.minimoArray(datos);
		assertEquals(-9, resultado);
	}

	@Test
	public void testMinimoMixto() {
		// con positivos y negativos y 0
		int[] datos = { 4, -1, 0, -3, 2, -2 };
		int resultado = Funciones.minimoArray(datos);
		assertEquals(-3, resultado);
	}

	@Test(expected = IllegalArgumentException.class)
	// aqui un test que lanza excepcion si el array esta vacio
	public void testArrayVacioExcepcion() {
		int[] datos = {};
		Funciones.minimoArray(datos);
	}
}
