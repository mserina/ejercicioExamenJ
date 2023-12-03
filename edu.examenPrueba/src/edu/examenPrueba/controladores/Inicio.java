package edu.examenPrueba.controladores;

import java.util.Scanner;

import edu.examenPrueba.servicios.MenuImplementacion;
import edu.examenPrueba.servicios.MenuInterfaz;

/*
 * Clase principal del programa
 * msm - 031223
 */
public class Inicio {
	/*
	 * Metodo main, que contiene el procedimiento de la aplicacion
	 * msm - 031223  
	 */
	
	public static void main (String[] args) {
		
		boolean cerrarMenu = false;
		int opcionSeleccionada;
		
		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		
		while (!cerrarMenu) {
			
			opcionSeleccionada = mi.mostrarMenu(sc);
			
			switch (opcionSeleccionada) {
			  case 0:
				  System.out.println("Cerrando programa");
				  cerrarMenu = true;
				  break;
			  case 1:
				  System.out.println("Ha seleccionado la opcion 1");
				  break;
			  case 2:
					System.out.println("Ha seleccionado la opcion 2");
				  break;
		      default:
		    	  System.out.println("Esa opcion no exisye");
		    	  break;
			
			}
		}

	}

}
