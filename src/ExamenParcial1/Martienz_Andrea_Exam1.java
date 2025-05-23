package ExamenParcial1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author andre
 */
public class Martienz_Andrea_Exam1 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        Random random = new Random();

        int opcion = 0;

        do {
            System.out.println("\n === MENU === ");
            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Piedra Papel o Tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir");
            System.out.print("Seleccione la opcion: ");
            opcion = texto.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n== Piramide ==");

                    System.out.print("Cantidad de fila de la Piramide: ");
                    int cantidadpiramide = texto.nextInt();
                    int contador = 1;

                    for (int i = 1; i <= cantidadpiramide; i++) {
                        int suma = 0;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(contador + " ");

                            suma += contador;
                            contador += 2;
                        }
                        System.out.println("= " + suma);

                    }
                    break;
                case 2:
                    System.out.println("\n== Clave ==");
                    break;

                case 3:
                    System.out.println("\n== Piedra Papel o Tijera ==");
                    System.out.println("Bienvenido al juego de piedra, papel o tijera!");
                    String sino="";
                    boolean jugar = true;
                    
                    String opcionjuego="";
                    
                    while(jugar){
                    while (true){
                    System.out.print("\nIngrese su eleccion entre piedra, papel o tijera: ");
                     opcionjuego = texto.next().toLowerCase();
                    
                    
                    if (opcionjuego.equals("piedra") || opcionjuego.equals("papel") || opcionjuego.equals("tijera")) {
                        
                        break;
                    }else {
                    
                    System.out.print("\nNo ingreso ninguna de las tres opciones.");
                    }}
                    
                    System.out.println("\nTu elegiste: " +opcionjuego);
                    int computadoraeleccion = random.nextInt(3)+1; 
                    
                    if(computadoraeleccion == 1){
                     System.out.println("Eleccion de la computadora es: Piedra");
                    }else if(computadoraeleccion == 2){
                     System.out.println("Eleccion de la computadora es: Papel");
                    }else if (computadoraeleccion == 3){
                     System.out.println("Eleccion de la computadora es: Tijera");
                    }
                    
                   
                    if (computadoraeleccion == 1 && opcionjuego.equals("tijera")){
                        System.out.println("\n == La computadora gano! =="); 
                    }if (computadoraeleccion == 1 && opcionjuego.equals("papel")){
                        System.out.println("\n == Tu ganaste! =="); 
                    }if (computadoraeleccion == 1 && opcionjuego.equals("piedra")){
                        System.out.println("\n == Es un empate! =="); 
                    }
                    
                     if (computadoraeleccion == 2 && opcionjuego.equals("piedra")){
                        System.out.println("\n == La computadora gano! =="); 
                    }if (computadoraeleccion == 2 && opcionjuego.equals("tijera")){
                        System.out.println("\nTu ganaste!"); 
                    }if (computadoraeleccion == 2 && opcionjuego.equals("papel")){
                        System.out.println("\nEs un empate!"); 
                    }
                    
                     if (computadoraeleccion == 3 && opcionjuego.equals("papel")){
                        System.out.println("\n == La computadora gano! =="); 
                    }if (computadoraeleccion == 3 && opcionjuego.equals("piedra")){
                        System.out.println("\n == Tu ganaste! =="); 
                    }if (computadoraeleccion == 3 && opcionjuego.equals("tijera")){
                        System.out.println("\n == Es un empate! =="); 
                    }
                    
                    System.out.print("\nDesea jugar de nuevo? (Si/No): ");
                    sino = texto.next().toLowerCase();
                    if(!sino.equals("si")){
                            jugar = false;
                           }   
                    }
                    break;
                case 4:
                    System.out.println("\n== Adivinar ==");
                    int intentosmax = 10, intento=0;
                    int numerorandom=random.nextInt(100)+1;
                    System.out.println("Intenta adivinar el numero entre el 1 y 100! (Tienes 10 intentos)");
                    
                    while(intento<intentosmax){
                        
                        System.out.print("Intento: "+intento+1);
                        intento++;
                        int numerocomparar = texto.nextInt();
                    
                        if(numerorandom>numerocomparar){
                            System.out.println("El numero a adivinar es mayor que "+numerocomparar);
                            System.out.println("Intentos: "+intento+ "/10" );
                        }
                        
                        
                        if (numerocomparar == numerorandom){
                            System.out.println("Ese era el numero, acertaste! Felicidades!");
                        }
                        
                    }
                    
                    
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida...");
            }

        } while (opcion != 5);
        {
            texto.close();
        }

        }        
}
