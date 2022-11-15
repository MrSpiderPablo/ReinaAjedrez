package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina 
{
	private Color color;
	private Posicion posicion;
	
	
	
	
	public Reina() 
	{
		posicion = new Posicion(1, 'd');
	}


	public Color getColor() 
	{
		return color;
	}
	
	
	public void setColor(Color color) 
	{
		if (color == null) 
		{
			throw new NullPointerException("El color no puede ser nulo");
		}
		this.color = color;
	}
	
	
	public Posicion getPosicion() 
	{
		return posicion;
	}
	
	
	public void setPosicion(Posicion posicion) 
	{
		if (posicion == null) 
		{
			throw new NullPointerException("No se aceptan posiciones nulas");
		}
		this.posicion = posicion;
	}
	
	
}
