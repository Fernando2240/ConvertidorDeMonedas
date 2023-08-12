package Modelo;

import java.util.ArrayList;

public class Moneda extends ObjetoAconvertir{

	private static ArrayList<ObjetoAconvertir> monedas = new ArrayList<>();
	
	public Moneda(String nombre, double equivalencia) {
		super(nombre, equivalencia);
		monedas.add(this);
	}

	@Override
	public ArrayList<ObjetoAconvertir> getObjetos() {
		return monedas;
	}

}
