package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import clases.Funciones;

public class TestMaximo {

	@Test
	public void testMaximoPositivos() {
		// en este test testamos un array con solo num positivos
		int[] datos = { 4, 2, 9, 1, 6, 0, 7, 5, 3, 8 };
		int resultado = Funciones.maximoArray(datos);
		assertEquals(9, resultado);
	}

	@Test
	public void testMaximoNegativos() {
		// y aqui solo uso negativos y 0 prq el resultado debe que ser 0
		int[] datos = { -1, -4, -2, -7, -3, -6, -9, -5, -8, 0 };
		int resultado = Funciones.maximoArray(datos);
		assertEquals(0, resultado);
	}

	@Test
	public void testMaximoMixto() {
		// aqui prueba con num pos y neg
		int[] datos = { -5, 3, 0, -2, 4, -1 };
		int resultado = Funciones.maximoArray(datos);
		assertEquals(4, resultado);
	}

	@Test(expected = IllegalArgumentException.class)
	// aqui un test que lanza excepcion si el array esta vacio
	public void testArrayVacioExcepcion() {
		int[] datos = {};
		Funciones.maximoArray(datos);
	}
}
