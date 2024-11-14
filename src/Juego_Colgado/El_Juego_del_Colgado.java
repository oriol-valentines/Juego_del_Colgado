package Juego_Colgado;

import java.util.Scanner;
import java.util.Random;

public class El_Juego_del_Colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//VARIABLES PARA EL JUEGO
		int jugadores = 2;
		int rondas = 0;
		String[] palabras = new String[4];
		palabras[0] = "hola";
		palabras[1] = "lindo";
		palabras[2] = "gustar";
		palabras[3] = "pantalla";
		palabras[4] = "morder";
		String partida;
		
		//ENTRADA DE INFO 
		Scanner x = new Scanner(System.in);
		
		//PRIMERA PANTALLA QUE MOSTRARA
		System.out.println(" _____________________");
		System.out.println("|                     |");
		System.out.println("| JUEGO DEL COLGADO!! |");
		System.out.println("|_____________________|");
		
		
		//DEFINIR LAS RONDAS Y JUGADORES
		System.out.print("¿Cuantas rondas quiere jugar? ");
		rondas = x.nextInt();
		if(rondas == 1) {
			System.out.println("No se puede jugar solamente 1 ronda, como minimo deves jugar 2 rondas");
			return;
		}
		System.out.print("¿Cuantos Jugadores? ");
		jugadores = x.nextInt();
		for(int ronda = 1; ronda <= rondas; ronda++) {
			System.out.println("Ronda " + ronda);
			for(int jugador = 1; jugador <= jugadores; jugador++) {
				System.out.println("Jugador " + jugador);
				
				System.out.print("Inserta: ");
				jugador = x.nextInt();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
