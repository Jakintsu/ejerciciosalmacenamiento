package com.api.arreglos;

import java.util.Comparator;

public class ComparadorLongitudCadenas implements Comparator<String> {

	 public ComparadorLongitudCadenas() {
	}
	
	@Override
	public int compare(String o1, String o2) {
		return o2.length() - o1.length();
	}

}
