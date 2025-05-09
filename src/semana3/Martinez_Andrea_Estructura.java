/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author andre
 */
public class Martinez_Andrea_Estructura {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in).useDelimiter("\\n");
        Random random = new Random();

        int opcion = 0;
        int contadoropcion1 = 0, contadoropcion2 = 0, contadoropcion3 = 0, contadoropcion4 = 0;

        do {
            System.out.println("\n--- MENU: Estructura Condicional ---");
            System.out.println("1. Palabra Alreves");
            System.out.println("2. Numero perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");

            System.out.print("\nSelecciona la opcion: ");
            opcion = texto.nextInt();

            switch (opcion) {
                case 1 -> {
                    contadoropcion1++;
                    System.out.print("Ingrese la cantidad de palabras: ");
                    int cantidad = texto.nextInt();

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingrese palabra #" + (i + 1) + ": ");
                        String palabra = texto.next();
                        String alReves = new StringBuilder(palabra).reverse().toString();
                        System.out.println("Al revés: " + alReves);
                    }
                }

                case 2 -> {
                    contadoropcion2++;
                    int sumaDivisores = 0;

                    System.out.print("Ingrese un numero para comprobar si es perfecto: ");
                    int numero = texto.nextInt();

                    for (int i = 1; i < numero; i++) {
                        if (numero % i == 0) {
                            sumaDivisores += i;
                        }
                    }

                    if (sumaDivisores == numero) {
                        System.out.println(numero + " es un numero perfecto.");
                    } else {
                        System.out.println(numero + " no es un numero perfecto.");
                    }
                }

                case 3 -> {
                    contadoropcion3++;
                    System.out.print("Ingrese un numero para verificar si es primo: ");
                    int numero = texto.nextInt();
                    boolean esPrimo = true;

                    if (numero <= 1) esPrimo = false;
                    else {
                        for (int i = 2; i <= Math.sqrt(numero); i++) {
                            if (numero % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }

                    if (esPrimo) {
                        System.out.println(numero + " es un numero primo.");
                    } else {
                        System.out.println(numero + " no es un numero primo.");
                    }
                }

                case 4 -> {
                    contadoropcion4++;
                    System.out.println("Simulando votaciones.");
                }

                case 5 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 5);

        texto.close();
    }   }
      
      

