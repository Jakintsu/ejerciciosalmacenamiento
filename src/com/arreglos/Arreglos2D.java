package com.arreglos;

public class Arreglos2D {
	
	public char[][] rellenarMatriz(int numFilas){
		if(numFilas <= 0) {
			throw new IllegalArgumentException("Parámetro incorrecto");
		}
		char[][] matrizAsteriscos = new char[numFilas][2*numFilas-1];
		
		for(int i = 0, numAsteriscos = 1, posicionInicio = matrizAsteriscos[0].length/2;
				i < numFilas; i++, numAsteriscos+=2, posicionInicio--) {
			for(int j = 0; j < posicionInicio; j++) {
				matrizAsteriscos[i][j] = ' ';
			}
			
			for(int j = 0, pos = posicionInicio; j < numAsteriscos; j++ ) {
				matrizAsteriscos[i][pos++] = '*';
			}
			for(int j = posicionInicio + numAsteriscos; j < matrizAsteriscos[i].length; j++) {
				matrizAsteriscos[i][j] = ' ';
			}
		}
		
		return matrizAsteriscos;
	}

	public int[][] obtenerMatrizProducto(int matriz1[][], int matriz2[][]){
		if(matriz1 == null || matriz2 == null || (matriz1[0].length != matriz2.length)) {
			throw new IllegalArgumentException("Parámetros incorrectos");
		}
		
		int[][] matrizProducto = new int[matriz1.length][matriz2[0].length];
		
		for(int i = 0; i < matrizProducto.length; i++) {
			for(int j = 0; j < matrizProducto[i].length; j++) {
				for(int k = 0; k < matriz2.length; k++) {
					matrizProducto[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			}
		}
		
		return matrizProducto;
	}
	
	public int[][] obtenerDiagonales(int[][] matriz){
		if(matriz == null || matriz.length != matriz[0].length) {
			throw new IllegalArgumentException("Argumento no válido");
		}
		
		int[][] diagonales = new int[2][matriz.length];
		
		for(int i = 0, j = 0; i < matriz.length; i++, j++) {
			diagonales[0][j] = matriz[i][j];
			diagonales[1][j] = matriz[matriz.length - 1 -i][j];
		}
		
		return diagonales;
	}
	
	public int[][] obtenerLaterales(int[][] matriz){
		if(matriz == null) {
			throw new IllegalArgumentException("Parámetros incorrectos");
		}
		
		int[][] laterales = {new int[matriz[0].length], new int[matriz.length],
				new int[matriz[0].length], new int[matriz.length]};
		
		for(int i = 0; i < matriz[0].length; i++) {
			laterales[0][i] = matriz[0][i];
			laterales[2][i] = matriz[matriz.length - 1][i];
		}
		
		for(int i = 0; i < matriz.length; i++) {
			laterales[1][i] = matriz[i][matriz[0].length - 1];
			laterales[3][i] = matriz[i][0];
		}
	
		return laterales;
	}
	
}
