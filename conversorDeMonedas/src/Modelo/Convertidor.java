package Modelo;

import javax.swing.JOptionPane;

import Excepciones.NegativosException;

public class Convertidor {
	
	
	
	private double convertir(double cantidad, ObjetoAconvertir tipo) {
		return Math.round((cantidad *1000.0)/ tipo.getEquivalencia())/1000.0;
	}

	private double convertirInverso(double cantidad, ObjetoAconvertir tipo) {
		return Math.round(cantidad * tipo.getEquivalencia()*1000.0)/1000.0;
	}
	
	private String[] llenarOpcionesConversion(String unidad, ObjetoAconvertir tipo) {
		String[] opciones = new String[tipo.getObjetos().size() * 2];

		int index = 0;
		for (ObjetoAconvertir moneda : tipo.getObjetos()) {
			opciones[index] = "De " + unidad + " a " + moneda.getNombre();
			opciones[tipo.getObjetos().size() + index] = "De " + moneda.getNombre() + " a " + unidad;
			index++;
		}
		return opciones;
	}
	
	public void iniciar(String unidad,ObjetoAconvertir tipo) {
		
		boolean bandera = false;
			
					while (!bandera) {
						try {
							conversor(unidad, tipo);
							bandera = true;

						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Solo se aceptan numeros");
							bandera = false;
						} catch (NegativosException ex) {
							JOptionPane.showMessageDialog(null, "Por favor ingrese un numero mayor a cero");
							bandera = false;
						}
		}

	}
	
	private void conversor(String unidad,ObjetoAconvertir tipo) {
		double cantidad;
		
		cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Indique la cantidad a convertir",
				"Convertir", JOptionPane.DEFAULT_OPTION));
		if (cantidad < 0 ) {
			throw new NegativosException();
		}

		String cambio = JOptionPane.showInputDialog(null, "Seleccione la opcion de conversion ", "Pasar",
				JOptionPane.QUESTION_MESSAGE, null, llenarOpcionesConversion(unidad, tipo), "Seleccione").toString();
		
		buscar(cambio, cantidad, unidad, tipo);
			
	}
	
	private void buscar(String cambio,double cantidad, String unidad, ObjetoAconvertir tipo ) {
		if (cambio.indexOf(unidad) != 3) {
			for (ObjetoAconvertir objeto : tipo.getObjetos()) {
				if (cambio.contains(objeto.getNombre())) {
					JOptionPane.showMessageDialog(null,
							"Usted tiene $" + convertirInverso(cantidad, objeto) + " " + unidad);
					break;
				}
			}
		} else {
			for (ObjetoAconvertir objeto : tipo.getObjetos()) {
				if (cambio.contains(objeto.getNombre())) {
					JOptionPane.showMessageDialog(null,
							"Usted tiene $" + convertir(cantidad, objeto) + " " + objeto.getNombre());
					break;
				}
				
			}
		}
	}
}
