package com.colecciones;

import java.util.ArrayList;

public class ArraysListVocales {

	public String[] obtenerArrCad5Vocales(String[] arrCad) {
		if (arrCad == null) {
			throw new IllegalArgumentException("Parámetro no válido");
		}
		ArrayList<String> arrListCadenas5Vocales = new ArrayList<String>();

		for (String cadena : arrCad) {
			if (cadena != null) {
				String cadAux = new String(cadena.toUpperCase());
				if (cadAux.indexOf("A") != -1 && cadAux.indexOf("E") != -1 && cadAux.indexOf("I") != -1
						&& cadAux.indexOf("O") != -1 && cadAux.indexOf("U") != -1) {
					arrListCadenas5Vocales.add(cadena);

				}
			}
		}
		
		if(arrListCadenas5Vocales.size() > 0) {
			return arrListCadenas5Vocales.toArray(new String[arrListCadenas5Vocales.size()]);
		}else {
			return null;
		}
	}
	
	public void obtenerArrListSinCadenasRepetidas(ArrayList<String> arrList) {
		if(arrList == null) {
			throw new IllegalArgumentException("Parámetro no válido");
		}
		
		for(int i = 0; i < arrList.size(); i++) {
			if(arrList.lastIndexOf(arrList.get(i))!=i) {
				arrList.remove(i);
				i--;
			}
		}
	}

}
