package com.arreglos;

public class ArreglosUnaDimension {

	public String[] obtenerArrCad5Vocales(String[] arrCad) {
		if (arrCad == null) {
			throw new IllegalArgumentException("Argumento no válido");
		}

		String[] arrayAux = new String[arrCad.length];
		int numCad5Vocales = 0;
		String[] arraySinDatos;

		int j = 0;

		for (String cad : arrCad) {
			if (cad != null) {
				String cadAux = cad.toUpperCase();
				if (cadAux.indexOf("A") != -1 && cadAux.indexOf("E") != -1 && cadAux.indexOf("I") != -1
						&& cadAux.indexOf("O") != -1 && cadAux.indexOf("U") != -1) {
					arrayAux[j++] = cad;
					numCad5Vocales++;
				}
			}
		}

		if (numCad5Vocales > 0) {
			String arrCad5Vocales[] = new String[numCad5Vocales];
			for (int i = 0; i < numCad5Vocales; i++) {
				arrCad5Vocales[i] = arrayAux[i];
			}

			return arrCad5Vocales;
		} else {
			arraySinDatos = new String[numCad5Vocales];
			return arraySinDatos;
		}
		
		
	}
	
	public void ordenarArregloAlfabeticamente(String[] arrCad) {
		if(arrCad == null) {
			throw new IllegalArgumentException("No válido");
		}
		
		int numVeces = 0;
		
		for(int i = 0; i < arrCad.length; i++) {
			if(arrCad[i] != null) {
				for(int j = i+1; j < arrCad.length; j++) {
					if(arrCad[j] != null && arrCad[j].toUpperCase().compareTo(arrCad[i].toUpperCase()) <0) {
						String cadAux = arrCad[i];
						arrCad[i] = arrCad[j];
						arrCad[j] = cadAux;
						
					}
				}
			}
		}
	}

}
