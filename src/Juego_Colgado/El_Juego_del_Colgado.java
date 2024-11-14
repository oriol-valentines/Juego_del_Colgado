package Juego_Colgado;

import java.util.Scanner;

public class El_Juego_del_Colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//VARIABLES PARA EL JUEGO
		int jugadores = 0;
		int rondas = 0;
		int partida = 0;
		
		//ENTRADA DE INFO 
		Scanner x = new Scanner(System.in);
		
		//PRIMERA PANTALLA QUE MOSTRARA
		System.out.println(" _____________________");
		System.out.println("|                     |");
		System.out.println("| JUEGO DEL COLGADO!! |");
		System.out.println("|_____________________|");
		
		
		//DEFINIR LAS RONDAS
		System.out.print("¿Cuantas rondas quiere jugar? ");
		rondas = x.nextInt();
		for(int ronda = 2; ronda <= rondas; ronda++) {
			System.out.println("Ronda " + ronda);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
