package Modelo;

import java.util.ArrayList;

public class Distancia extends ObjetoAconvertir{

private static ArrayList<ObjetoAconvertir> unidades = new ArrayList<>();
	
	public Distancia(String nombre, double equivalencia) {
		super(nombre, equivalencia);
		unidades.add(this);
	}

	@Override
	public ArrayList<ObjetoAconvertir> getObjetos() {
		return unidades;
	}

}
