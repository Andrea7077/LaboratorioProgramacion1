/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Martinez_Andrea_SarahiEjercicio2Tiempo {
      public static void main (String [] args){
      Scanner texto = new Scanner(System.in);
      texto.useDelimiter("\n");
      
      System.out.print("Ingrese la cantidad de segundos a calcular: ");
      int segundos = texto.nextInt();
      
      
      String tiempofinal = ( segundos <= 0) ? "no se permite ese valor " : "Tenemos " + segundos / 3600 + " hora(s), " + (segundos % 3600) / 60 + " minutos, " + segundos % 60 + " segundos.";
      System.out.println(tiempofinal); 
      
     
      
}}
