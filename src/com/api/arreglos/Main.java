package com.api.arreglos;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] arrStr = { "Impresora", "peto", "mar", "orilla", "Orilla" };

		Arrays.sort(arrStr, new ComparadorLongitudCadenas());
		System.out.println(Arrays.toString(arrStr));

		Arrays.sort(arrStr, new ComparadorCadenaNumeroVocales());
		System.out.println(Arrays.toString(arrStr));

	}

}
