/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Martinez_Andrea_Estructura {
    
    public static void main (String[]args){
    Scanner entrada = new Scanner (System.in).useDelimiter("\n");
    
        System.out.println(" === Filtrar ===");
        System.out.print("\nIngrese una frase: ");
        String frase = entrada.nextLine();
    
        System.out.print("Ingrese una longuitud minima: ");
        int longmin = entrada.nextInt();
        
        String palabra = "";
        frase += " ";
        System.out.println("La palabras con mayor longuitud a " +longmin+ " son: ");
        
          for (int i=0; i<frase.length();i++){
               char j = frase.charAt(i);
               
               if (j != ' ' && j != ',' && j != ':' && j != ';' && j != '!' && j != '.' && j != '?' && j != '@'){
                   palabra += j;
               } else  {
                   if (palabra.length()>=longmin)
                   { System.out.println(palabra);                   
                   }
                   palabra = "";  
               }
              }

        }
}