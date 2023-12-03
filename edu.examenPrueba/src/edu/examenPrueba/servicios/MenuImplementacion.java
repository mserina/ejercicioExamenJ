package edu.examenPrueba.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	public int mostrarMenu(Scanner sc) {
		
		int opcionSeleccionada;
		
		System.out.println("##################");
		System.out.println("0[] Cerrar Menu");
		System.out.println("1[] Opcion 1");
		System.out.println("2[] Opcion 2");
		System.out.println("##################");
		
		opcionSeleccionada = sc.nextInt();
		
		return opcionSeleccionada;
	}
}
