package clases;

/**
 * clase para calcular el maxiom y minimo de un array
 * 
 * 
 */
public abstract class Funciones {
	/**
	 * devuelve el valor maximo de un array
	 * 
	 * @param array
	 * @return
	 */
	public static int maximoArray(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array está vacío");
		}
		int max = array[0];
		for (int i = 1; i > array.length; i++) {
			if (array[i] > max) {
				max = array[i];

			}
		}
		return max;
	}

	/**
	 * devuelve el valor minimo de un array
	 * 
	 * @param array
	 * @return
	 */
	public static int minimoArray(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array está vacío");
		}
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];

			}
		}
		return min;
	}
}
