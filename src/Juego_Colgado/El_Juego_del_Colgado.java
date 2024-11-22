package Juego_Colgado;

import java.util.Scanner;
import java.util.Arrays;

public class El_Juego_del_Colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ENTRADA DE INFO 
		Scanner x = new Scanner(System.in);
				
		//PRIMERA PANTALLA QUE MOSTRARA
		System.out.println(" _____________________");
		System.out.println("|                     |");
		System.out.println("| JUEGO DEL COLGADO!! |");
		System.out.println("|_____________________|");
				
		//INTRODUCIR LA PALABRA SECRETA
		String palabras;
		char[] palabrasS;
		System.out.print("Introduce la palabra secreta: " );
		palabras = x.nextLine().toLowerCase();
		//palabrasS = palabras.split(" "); //EL SPLIT SEPARA LOS CARACTERES PARA PODER GUARDARLOS 
		palabrasS = palabras.toCharArray(); //ESTA ES OTRA FORMA PARA INSERTAR LA PALABRA EN EL ARRAY VACIO
		
		/* for (int i = 0; i<palabrasS.length; i++) { //PRUEBA PARA VER SI MUESTRA LA PALABRA SECRETA
			System.out.print(palabrasS[i]);
		}
		*/
		
		
		//DEFINIR LOS JUGADORES
		System.out.print("¿Cuantos jugadores quieren jugar? ");
		int jugadoresNum = x.nextInt();
		
		if(jugadoresNum <= 1) {
			System.out.println(" ");
			System.out.println("NO PUEDEN JUGAR MENOS DE DOS PERSONAS!!");
			System.out.print("¿Cuantos jugadores quieren jugar (MINIMO 2)? ");
			jugadoresNum = x.nextInt();
		}
		
		int[] jugadores;
		jugadores = new int[jugadoresNum];
		
		int[] vidas;
		vidas = new int[jugadores.length];
		for (int i = 0; i < vidas.length; i++) {
			vidas[i] = 6;
		}
		
		//AÑADIR EL CARACTER '_' EN LOS ESPACIOS QUE NO HAYA NINGUN CARACTER AUN.
		char[] progreso = new char[palabras.length()];
		Arrays.fill(progreso, '-'); //ARRAYS.FILL(CARACTER1, CARACTER2) ES PARA RELLENAR
		
		while(true) {
			for (int i = 0; i < jugadores.length; i++) {
				System.out.println("_______________________________________________________");
				System.out.println(" ");
				System.out.println("Jugador: " + (i + 1));
				System.out.println("Vidas Restantes " +vidas[i]);
				
				for (int j = 0; j < progreso.length; j++) {
					System.out.print(progreso[j]);
				}System.out.println(" ");
				
				System.out.print("Inserta la letra que creas que va a aparecer en el texto: ");
				char letra = x.next().toLowerCase().charAt(0);
				
				boolean acierto = false; 
				for (int j = 0; j < palabrasS.length; j++) {
					if(palabrasS[j] == letra) {
						progreso[j] = letra;
						acierto = true;
					}
				}
				
				if(acierto) {
					System.out.println("---------------------------");
					System.out.println("Has acertado la letra!! ");
					System.out.println("La letra acertada es: " + letra);
					System.out.println("---------------------------");
				}else {
					System.out.println("No has acertado la letra!!");
					vidas[i]--;
				}
				
				if (Arrays.equals(palabrasS, progreso)){
					System.out.println(" ___________________________________________________");
					System.out.println("|                                                   |");
					System.out.println("           Has acertado la palabra Jugador " + (i + 1));
					System.out.println("           la palabra acertada es: " + palabras.toUpperCase());
					System.out.println("|___________________________________________________|");
					return;
				}
				
				if(vidas[i] <= 0) {
					System.out.println(" ___________________________________________________");
					System.out.println("|                                                   |");
					System.out.println("|      te has quedado sin vidas, Has perdido!!!     |");
					System.out.println("|               Se cierra el juego...               |");
					System.out.println("|___________________________________________________|");
					return;
				}
				
				
			}
			
		}
		
		
			
			
					

					
					
		
		
		
		
		//if (Array.equals(nombre_array1, nombre_Array2)){
		// if (nombre_string == Array.toString(nombre_array)){
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
