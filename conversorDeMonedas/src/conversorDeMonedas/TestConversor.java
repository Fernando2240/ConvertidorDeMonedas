package conversorDeMonedas;

import javax.swing.*;

import Modelo.Convertidor;
import Modelo.Distancia;
import Modelo.Moneda;
import Modelo.ObjetoAconvertir;
import Modelo.Tiempo;

public class TestConversor {

	public static void main(String[] args) {
		ObjetoAconvertir dolar = new Moneda("Dolares", 4079.39);
		ObjetoAconvertir euro = new Moneda("Euros", 4477.62);
		ObjetoAconvertir libraEsterlina = new Moneda("Libras Esterlinas", 5190.68);
		ObjetoAconvertir yenJapones = new Moneda("Yen Japoneses", 28.39);
		ObjetoAconvertir wonSurcoreano = new Moneda("Won Surcoreanos", 3.10);
		Distancia mm = new Distancia("Milimetros",0.001);
		Distancia cm = new Distancia("Centimetros",0.01);
		Distancia km = new Distancia("Kilometros",1000);
		Tiempo minuto = new Tiempo("Minutos",60);
		Tiempo hora = new Tiempo("Horas",3600);
		Tiempo dia = new Tiempo("Dias",24*3600);
		
		Convertidor c1  = new Convertidor();	
		
		String[] opciones = {"Conversor de Monedas","Conversor de Distancia","Conversor de Tiempo"};
		
		int salir;
		do {
			String opcion = JOptionPane.showInputDialog(null, "Seleccione un conversor", "Menu", JOptionPane.QUESTION_MESSAGE, null,
					opciones, "Seleccione").toString();
			
			switch (opcion) {
			
			case "Conversor de Monedas":
				c1.iniciar("Pesos", dolar);
				break;

			case "Conversor de Distancia":
				c1.iniciar("metros", cm);
				break;
				
			case "Conversor de Tiempo":
				c1.iniciar("segundos", minuto);
				break;
			}
			
			salir = JOptionPane.showConfirmDialog(null, "Quiere realizar otra conversion", "Salir", JOptionPane.YES_NO_OPTION);
		}while(salir == 0);
		
		JOptionPane.showMessageDialog(null, "El programa finalizo");
	}

}
