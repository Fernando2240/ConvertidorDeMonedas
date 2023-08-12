package Modelo;

import java.util.ArrayList;

public class Tiempo extends ObjetoAconvertir{
	
	private static ArrayList<ObjetoAconvertir> tiempos = new ArrayList<>();

	public Tiempo(String nombre, double equivalencia) {
		super(nombre, equivalencia);
		tiempos.add(this);
	}

	@Override
	public ArrayList<ObjetoAconvertir> getObjetos() {
		
		return tiempos;
	}

}
