package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

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
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException
	{
		if (direccion == null) 
		{
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		
		if (pasos < 1 || pasos > 7) 
		{
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		
		String movimientoNoValido = "ERROR: Movimiento no válido (se sale del tablero).";
		
		switch(direccion) 
		{
		case NORTE:
			try 
			{
				posicion.setFila(posicion.getColumna() + pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		case SUR:
			try 
			{
				posicion.setFila(posicion.getColumna() - pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		case ESTE:
			try 
			{
				posicion.setFila(posicion.getColumna() + pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		case OESTE:
			try 
			{
				posicion.setFila(posicion.getColumna() - pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		case NORESTE:
			try 
			{
				posicion.setFila(posicion.getColumna() + pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		case SURESTE:
			try 
			{
				posicion.setFila(posicion.getColumna() - pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		case NOROESTE:
			try 
			{
				posicion.setFila(posicion.getColumna() + pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		case SUROESTE:
			try 
			{
				posicion.setFila(posicion.getColumna() - pasos);
				
			}catch (IllegalArgumentException e) 
			{
				throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
			}
			break;
		default:
			break;
		}
	}



	@Override
	public String toString() 
	{
		return String.format("Reina [color=Blanco, posicion=(fila=1, columna=d]", color, posicion);
	}
	
	
	
	
}
