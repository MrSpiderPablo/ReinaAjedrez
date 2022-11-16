package org.iesalandalus.programacion.reinaajedrez;

import java.awt.Color;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola 
{
	private Consola() 
	{
		
	}
	
	public static void mostrarMenu() 
	{
		System.out.println("Opción 1: Crear reina por defecto");
		
		System.out.println("Opción 2: Crear reina eligiendo el color");
		
		System.out.println("Opción 3: Mover");
		
		System.out.println("Opción 4: Salir");
	}
	
	public static int elegirOpcionMenu() 
	{
		int opcion = 0;
		
		while (opcion < 1 || opcion > 4) 
		{
			System.out.println("Elija una opcion del menu: ");
			opcion = Entrada.entero();
		}
		return opcion;
	}
	
	
	public static void mostrarMenuDirecciones() 
	{
		System.out.println("Norte");
		
		System.out.println("Noreste");
		
		System.out.println("Este");
		
		System.out.println("Sureste");
		
		System.out.println("Sur");
		
		System.out.println("Suroeste");
		
		System.out.println("Oeste");
		
		System.out.println("Noroeste");
	}
	
	public static void despedirse() 
	{
		System.out.println("¡Que tenga suerte en su partida!");
	}
}
