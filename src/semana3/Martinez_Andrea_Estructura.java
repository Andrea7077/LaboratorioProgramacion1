/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import java.util.Random;
import java.util.Scanner;

 
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
                    contadoropcion1++; //con esto incrementamos el contador de la opcion 1
                    System.out.print("\nIngrese una cantidad deseada de palabras: ");
                    int cantidadpalabras = texto.nextInt();

                    String palabraMax = ""; // guardamos la palabra que es mas larga
                    String palabraRevesMax = ""; // para cuando sea al reves
                    int cantidadPalindromos = 0; // para los palindromos

                    for (int i = 1; i <= cantidadpalabras; i++) {
                        System.out.print("\nPalabra #" + i + ": ");
                        String palabra = texto.next().toLowerCase(); //ingresamos la palabra y convierte en minuscula
                        String palabraalreves = "";

                        System.out.print("Al reves: ");
                        for (int j = palabra.length() - 1; j >= 0; j--) {
                            char letrareves = palabra.charAt(j);
                            System.out.print(letrareves);
                            palabraalreves += letrareves;
                        }
                        System.out.println();

                        if (palabra.equals(palabraalreves)) {
                            System.out.println("Es palindromos");
                            cantidadPalindromos++;
                        }

                        if (palabra.length() > palabraMax.length()) {
                            palabraMax = palabra;
                            palabraRevesMax = palabraalreves;
                        }
                    }

                    System.out.println("\nLa palabra mas larga es: " + palabraMax);
                    System.out.println("Al reves seria: " + palabraRevesMax);
                    System.out.println("Cantidad de palindromos encontrados: " + cantidadPalindromos);
                    break;
                }

                case 2 -> {
                    contadoropcion2++; //con esto incrementamos el contador de la opcion 2
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
                    int numero = random.nextInt(100)+1; //numero aleatorio
                    int divisiores = 0;
                     System.out.println("El numero aleatorio es: " +numero);
                    System.out.print("Todos los divisores son: " );
                    
                    
                    for (int i = 1; i <= numero; i++){
                            if (numero % i == 0) {
                                System.out.print(i+" ");
                                divisiores ++;

                            }
                        }
                  
                    
                    if (divisiores==2) {
                        System.out.println("\n" +numero + "  es un numero primo.");
                    } else {
                        System.out.println("\n" + numero + " no es un numero primo.");
                    }
                   
                }

                case 4 -> {
                    contadoropcion4++;
                    System.out.println("Ingrese la cantidad de votantes que hay en el pais: ");
                    int cantidadevotantes = texto.nextInt();
                    
                    int contadoramarillo =0,contadorrojo=0,contadornegro=0,contadorazul=0, contadorvotonulo=0;
                    
                    for (int i = 1; i <= cantidadevotantes; i++){
                        System.out.println("(Azul /  Rojo / Negro / Amrillo)");
                        System.out.print("Elige por quien deseas votar #" +i+ ": ");
                        String voto = texto.next();
                        
                        switch(voto){
                            case "Azul" -> {
                                contadorazul++;
                            }
                            case "Rojo" -> {
                                contadorrojo++;
                            }
                            case "Negro" -> {
                                contadornegro++;
                            } 
                            case "Amarillo" -> {
                                contadoramarillo++;
                            }
                            default ->  contadorvotonulo++;
                             
                    }
                       int totalvotosvalidos = contadorazul + contadoramarillo + contadorrojo +contadornegro;
                       double validos =(double) totalvotosvalidos/cantidadevotantes;
                    
                       if(validos>=0.60){
                         String ganador = "";
                         int Votos = contadorazul;
                         
                         if (contadorrojo > Votos){
                              Votos = contadorrojo;
                              ganador = "Rojo";
                         }
                         if (contadornegro > Votos){
                              Votos = contadornegro;
                              ganador = "Negro";
                         }    
                          if (contadoramarillo > Votos){
                             Votos = contadoramarillo;
                              ganador = "Amarillo";
                         }
                            System.out.println("La planilla ganadora fue: " +ganador);   
                        
                       }
                        else {
                                    System.out.println("Votacionm fallida");}
                    }
                }

                case 5 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        texto.close();
    }
}

