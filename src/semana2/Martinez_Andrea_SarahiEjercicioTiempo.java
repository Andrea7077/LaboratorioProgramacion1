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
public class Martinez_Andrea_SarahiEjercicioTiempo {
      public static void main (String [] args){
      Scanner texto = new Scanner(System.in);
      texto.useDelimiter("\n");
      
      System.out.print("Ingrese la cantidad de segundos");
      int segundos = texto.nextInt();
      
      
      String tiempofinal = ( segundos <= 0) ? "no se permite ese valor " : segundos / 3600 + " horas, " + (segundos % 3600) / 60 + " minutos, " + segundos % 60 + " segundos.";
 System.out.println(tiempofinal); 
      
     
      
}}
