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

                    System.out.print("Ingrese el mensaje a cifrar: ");
                    String mensaje = texto.next().toLowerCase();
                    boolean cifradobo = false;
                    
                    
                OUTER:
                while (!cifradobo) {
                    System.out.println("\nElije una de las siguientes opciones:");
                    System.out.println("1. Cifrado");
                    System.out.println("2. desifrado");
                    System.out.println("3. Salir al menu principal");
                    System.out.print("Seleccione la opcion: ");
                    int opcioncifrado = texto.nextInt();

                    
                    switch (opcioncifrado) {
                        
                        case 1: System.out.println("== Cifrado ==");
                         String respuesta = "";
                            for (int i = 0; i < mensaje.length(); i++) {
                                char j = mensaje.charAt(i);
                             

                                if (j > 'a' && j < 'z') {
                                    respuesta += (char) ('z' - (j - 'a'));
                                } else {
                                    respuesta += j;
                                }
                            }   cifradobo = true;
                           System.out.println("Mensaje cifrado " +respuesta);

                            break;
                        case 2:
                            System.out.println("== desifrado ==");
                    String respuestadesifrado = "";
                            for (int i = 0; i < mensaje.length(); i++) {
                                char j = mensaje.charAt(i);
                                
                                if (j > 'a' && j < 'z') {
                                    respuestadesifrado += (char) ('z' - (j - 'a'));
                                } else {
                                    respuestadesifrado += j;
                                }
                            }   cifradobo = true;
                           
                                System.out.println("Mensaje desifrado " +respuestadesifrado);
                                   break;
                        case 3:
                            System.out.println("Saliento al menu principal");
                            cifradobo = true;
                            break OUTER;
                        default:
                            System.out.println("Opcion no valida.");
                            break;
                    }
                }
                    
                    break;


                case 3:
                    System.out.println("\n== Piedra Papel o Tijera ==");
                    System.out.println("Bienvenido al juego de piedra, papel o tijera!");
                    String sino = "";
                    boolean jugar = true;

                    String opcionjuego = "";

                    while (jugar) {
                        while (true) {
                            System.out.print("\nIngrese su eleccion entre piedra, papel o tijera: ");
                            opcionjuego = texto.next().toLowerCase();

                            if (opcionjuego.equals("piedra") || opcionjuego.equals("papel") || opcionjuego.equals("tijera")) {

                                break;
                            } else {

                                System.out.print("\nNo ingreso ninguna de las tres opciones.");
                            }
                        }

                        System.out.println("\nTu elegiste: " + opcionjuego);
                        int computadoraeleccion = random.nextInt(3) + 1;

                        if (computadoraeleccion == 1) {
                            System.out.println("Eleccion de la computadora es: Piedra");
                        } else if (computadoraeleccion == 2) {
                            System.out.println("Eleccion de la computadora es: Papel");
                        } else if (computadoraeleccion == 3) {
                            System.out.println("Eleccion de la computadora es: Tijera");
                        }

                        if (computadoraeleccion == 1 && opcionjuego.equals("tijera")) {
                            System.out.println("\n == La computadora gano! ==");
                        }
                        if (computadoraeleccion == 1 && opcionjuego.equals("papel")) {
                            System.out.println("\n == Tu ganaste! ==");
                        }
                        if (computadoraeleccion == 1 && opcionjuego.equals("piedra")) {
                            System.out.println("\n == Es un empate! ==");
                        }

                        if (computadoraeleccion == 2 && opcionjuego.equals("piedra")) {
                            System.out.println("\n == La computadora gano! ==");
                        }
                        if (computadoraeleccion == 2 && opcionjuego.equals("tijera")) {
                            System.out.println("\nTu ganaste!");
                        }
                        if (computadoraeleccion == 2 && opcionjuego.equals("papel")) {
                            System.out.println("\nEs un empate!");
                        }

                        if (computadoraeleccion == 3 && opcionjuego.equals("papel")) {
                            System.out.println("\n == La computadora gano! ==");
                        }
                        if (computadoraeleccion == 3 && opcionjuego.equals("piedra")) {
                            System.out.println("\n == Tu ganaste! ==");
                        }
                        if (computadoraeleccion == 3 && opcionjuego.equals("tijera")) {
                            System.out.println("\n == Es un empate! ==");
                        }

                        System.out.print("\nDesea jugar de nuevo? (Si/No): ");
                        sino = texto.next().toLowerCase();
                        if (!sino.equals("si")) {
                            jugar = false;
                        }
                    }
                    break;
                case 4:

                    boolean adivinar = true;
                    System.out.println("\n== Adivinar ==");
                    int intentosmax = 10,
                     intento = 0;
                    int numerorandom = random.nextInt(100) + 1;
                    System.out.println("Intenta adivinar el numero entre el 1 y 100! (Tienes 10 intentos)");

                    while (adivinar == true) {
                        while (intento < intentosmax) {
                            intento++;

                            System.out.println("\nIntento: " + intento + "/10");
                            System.out.print("Ingrese el que piensas que es el numero: ");

                            int numerocomparar = texto.nextInt();

                            if (numerorandom > numerocomparar) {
                                System.out.println("El numero a adivinar es mayor que " + numerocomparar);
                            } else if (numerorandom < numerocomparar) {
                                System.out.println("El numero a adivinar es menor que " + numerocomparar);

                            }

                            if (numerocomparar == numerorandom) {
                                System.out.println("Ese era el numero, acertaste! Felicidades!");
                                System.out.println("Adivinaste el numero en " + intento + " intentos");
                                adivinar = false;
                                break;
                            }
                            if (intento >= intentosmax) {
                                System.out.println("\nEl numero era: " + numerorandom);
                                System.out.println("Oh no! Parece que tus intentos se terminaron");
                                System.out.println("suerte a la proxima.");
                                adivinar = false;
                            }
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
