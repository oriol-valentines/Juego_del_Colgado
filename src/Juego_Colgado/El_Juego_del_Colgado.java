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
		boolean palabraEncontrada = false;
				
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
		
		//AÑADIR EL CARACTER '_' EN LOS ESPACIOS QUE NO HAYA NINGUN CARACTER AUN.
		char[] progreso = new char[palabras.length()];
		Arrays.fill(progreso, '_'); //ARRAYS.FILL(CARACTER1, CARACTER2) ES PARA RELLENAR
		
		while(true) {
			
			for (int i = 0; i < jugadores.length; i++) {
				System.out.println("Jugador " + jugadores[i]);
			}
			
			System.out.print("Inserta la letra que creas que va a aparecer en el texto: ");
			char letra = x.next().toLowerCase().charAt(0);
			
			for (int i = 0; i < palabrasS.length; i++) {
				if(palabrasS[i].charAt(i) == letra) {
					progreso[i] = letra;
					palabraEncontrada = true;
				}
			}System.out.print("");
			
		}
		
		
			
			
					
					
					
					
		
		
		
		
		//if (Array.equals(nombre_array1, nombre_Array2)){
		// if (nombre_string == Array.toString(nombre_array)){
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
