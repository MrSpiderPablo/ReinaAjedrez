package org.iesalandalus.programacion.reinaajedrez;


import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
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
	
	public static Color elegirColor() 
	{
		Color color = Color.BLANCO;
		int c = 0;
		
		while (c != 1 && c != 2) 
		{
			System.out.println("Elija un color(1 es blanco y 2 es negro):  ");
			c = Entrada.entero();
			switch(c) 
			{
			case 1:
				color = Color.BLANCO;
				break;
			case 2:
				color = Color.NEGRO;
				break;
			default:
			}
		}
		return color;
		
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
	
	public static Direccion elegirDireccion() 
	{
		Direccion direccion = Direccion.NORTE;
		int d = 0;
		while (d != 1 && d != 2 && d != 3 && d != 4 && d != 5 && d != 6 && d != 7 && d != 8)
		{
			System.out.println("Elija una direccion: ");
			d = Entrada.entero();
			switch(d) 
			{
			case 1:
				direccion = Direccion.NORTE;
				break;
			case 2:
				direccion = Direccion.NORESTE;
				break;
			case 3:
				direccion = Direccion.ESTE;
				break;
			case 4:
				direccion = Direccion.SURESTE;
				break;
			case 5:
				direccion = Direccion.SUR;
				break;
			case 6:
				direccion = Direccion.SUROESTE;
				break;
			case 7:
				direccion = Direccion.OESTE;
				break;
			case 8:
				direccion = Direccion.NOROESTE;
				break;
			default:
			}
		}
		return direccion;
		
	}
	
	public static int elegirPasos() 
	{
		int pasos = 0;
		
		System.out.println("Introduzca el numero de pasos a seguir: ");
		pasos = Entrada.entero();
		
		
		return pasos;
		
	}
	
	public static void despedirse() 
	{
		System.out.println("¡Que tenga suerte en su partida!");
	}
}
