package com.curso.Proyecto003_TresEnRaya;

import javax.management.RuntimeErrorException;

/*Requisito 01
 * Una pieza puede colocarse en cualquier espacio de un tablero de 3x3
 * 	- 
 */

public class TresEnRaya {
	
	//atributos
	
	private Character[][] tablero;
	private Character jugadorActual;
	
	public Character getJugadorActual() {
		return jugadorActual;
	}

	//constructor
	public TresEnRaya() {
		this.tablero = new Character[3][3]; //todas las casillas tendra null
		this.jugadorActual = 'X';
	}
	
	//metodos

	public int suma(int n, int n2 ) {
	return n + n2;
	}
	
	public void jugar(int x, int y) {
		
		//valida x
		validarCordenadaX(x);
		
		//valida y
		
		validarCordenadaY(y);
		
		//valida que no hay una pieza
		ponerFicha(x,y);
		
		
			
		
	} //fin poner ficha

	public Character verFicha(int x, int y) {
	
		
		//TODO validar x e y
	return this.tablero[x][y];
	}
	
	private void validarCordenadaX(int x) {
		if(x<0 || x >2) {
			throw new RuntimeException("La ficha no se puede pocicionar "
			+ "fuera del tablero, " 
			+ "Coordenada x mal ");
		}
	}
	
	private void validarCordenadaY(int y) {
		
		if(y<0 || y >2) {
			throw new RuntimeException("La ficha no se puede pocicionar "
			+ "fuera del tablero, " 
			+ "Coordenada y mal ");
		}
	}
	
	private void ponerFicha(int x, int y) {
		if (tablero[x][y] != null) {
			throw new RuntimeException(" Ya hay una ficha en esta pocicion");
		}
		
		tablero [x][y]= this.jugadorActual;
		
		if (this.jugadorActual == 'X') {
			this.jugadorActual = 'O';
		}else {
			this.jugadorActual = 'X';
		}
	}
	
	private boolean comprobarFichaH() {
		
	}
	
}
