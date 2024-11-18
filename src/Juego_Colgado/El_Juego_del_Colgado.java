package Juego_Colgado;

import java.util.Scanner;
import java.util.Arrays;

public class El_Juego_del_Colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//VARIABLES PARA EL JUEGO
		String partida;
		String palabras;
		String[] palabrasS;
				
						
		//ENTRADA DE INFO 
		Scanner x = new Scanner(System.in);
						
		//PRIMERA PANTALLA QUE MOSTRARA
		System.out.println(" _____________________");
		System.out.println("|                     |");
		System.out.println("| JUEGO DEL COLGADO!! |");
		System.out.println("|_____________________|");
						
		//INTRODUCIR LA PALABRA SECRETA
		System.out.print("Introduce la palabra secreta: " );
		palabras = x.nextLine().toLowerCase();
		palabrasS = palabras.split(" "); //EL SPLIT SEPARA LOS CARACTERES PARA PODER GUARDARLOS 
		// palabrasS = palabras.toCharArray(); ESTA ES OTRA FORMA PARA INSERTAR LA PALABRA EN EL ARRAY VACIO
				
		/* for (int i = 0; i<palabrasS.length; i++) { //PRUEBA PARA VER SI MUESTRA LA PALABRA SECRETA
					System.out.print(palabrasS[i]);
		}
		*/
				
				
		//DEFINIR LOS JUGADORES
		System.out.print("¿Cuantos jugadores quieren jugar? ");
		int jugadoresNum = x.nextInt();
				
		int[] jugadores;
		jugadores = new int[jugadoresNum];
				
		int[] vidas;
		vidas = new int[jugadores.length];
		for (int i = 0; i < vidas.length; i++) {
			vidas[i] = 6;
		}
				
		for(int jugador = 1; jugador <= jugadores; jugador++) {
			if (jugadores == 1) {
				System.out.print("No se puede jugar menos de dos rondas!! ");
				break;
			}
			System.out.println("Jugador " + jugador);
			System.out.print("Inserta la letra que creas que va a aparecer en el texto: ");
			char letra = x.next().toLowerCase().charAt(0);
					
							
							
							
							
		}
				
				
				
		//if (Array.equals(nombre_array1, nombre_Array2)){
		// if (nombre_string == Array.toString(nombre_array)){
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
