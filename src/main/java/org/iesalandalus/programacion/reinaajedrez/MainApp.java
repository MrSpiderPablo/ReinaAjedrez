package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp 
{
	private static Reina reina;
	
	public static void main(String[] args) 
	{
		System.out.println("Opción 1: Crear reina por defecto");
		
		System.out.println("Opción 2: Crear reina eligiendo el color");
		
		System.out.println("Opción 3: Mover");
		
		System.out.println("Opción 4: Salir");
		
		int opcion;
		
		System.out.println("Elija una opcion:");
		opcion = Entrada.entero();
	}
}
