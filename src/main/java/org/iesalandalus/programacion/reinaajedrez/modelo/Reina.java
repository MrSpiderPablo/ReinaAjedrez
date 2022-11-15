package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina 
{
	private Color color;
	private Posicion posicion;
	
	
	
	
	public Reina() 
	{
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}
	
	

	public Reina(Color color) 
	{
		this();
		this.color = color;
		
		if (Color.NEGRO != null) 
		{
			posicion = new Posicion(8, 'd');
			
		}else if (Color.BLANCO != null) 
		{
			posicion = new Posicion(1, 'd');
		}
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
