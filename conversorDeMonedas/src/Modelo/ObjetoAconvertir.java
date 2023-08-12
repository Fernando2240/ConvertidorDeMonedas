package Modelo;

import java.util.ArrayList;
/**
 * Esta clase es un modelo abstracto que sirve como referencia para convertir a otro sistema diferentes objetos
 */

public abstract class ObjetoAconvertir {
	private String nombre;
	private double equivalencia;
	
	public ObjetoAconvertir(String nombre, double equivalencia) {
		this.nombre = nombre;
		this.equivalencia = equivalencia;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEquivalencia() {
		return equivalencia;
	}
	
	public void setEquivalencia(double equivalencia) {
		this.equivalencia = equivalencia;
	}
	
	@Override
	public String toString(){
		return nombre;
		
	}

	public abstract ArrayList<ObjetoAconvertir> getObjetos();
}
