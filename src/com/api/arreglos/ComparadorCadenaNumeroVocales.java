package com.api.arreglos;

import java.util.Comparator;

public class ComparadorCadenaNumeroVocales implements Comparator<String> {

	private int cuentaVocales(String cadena) {
		int numeroVocales = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			switch(cadena.toUpperCase().charAt(i)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				numeroVocales++;
				break;
			}
		}
		
		return numeroVocales;
	}
	
	@Override
	public int compare(String o1, String o2) {
		return cuentaVocales(o1) - cuentaVocales(o2);
	}

}
