/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana1;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Martinez_Andrea_SarahiEjercicio4 {
   public static void main(String[] args){
        Scanner texto = new Scanner(System.in).useDelimiter("\\n");

        System.out.print("\n--Ejercicio A---\na1/b1+a2/b2");
        System.out.print("\nIngresa el numerador1(a1):");
        double numeradorA1 = texto.nextDouble();
        
        System.out.print("Ingresa el denominador1:(b2) ");
        double denominadorA1 = texto.nextDouble();
        
        System.out.print("Ingresa el numerador2:(a2) ");
        double numeradorA2 = texto.nextDouble();

        System.out.print("Ingresa el denominador2:(b2) ");
        double denominadorA2 = texto.nextDouble();

        double EjercicioAtotal =  numeradorA1/denominadorA1+numeradorA2/denominadorA2 ; 
        System.out.println("El resultado del ejercicio A es: " + EjercicioAtotal +"");
      
        
        System.out.print("\n--Ejercicio B--- \na*a/(b-c)+(d-e)/(f-g*h/j) ");
        System.out.print("Ingresa el numero a: ");
        double a = texto.nextDouble();     
        
        System.out.print("Ingresa el numero b: ");
        double b = texto.nextDouble();     
          
        System.out.print("Ingresa el numero c: ");
        double c = texto.nextDouble();     
        
        System.out.print("Ingresa el numero d: ");
        double d = texto.nextDouble();   
        
        System.out.print("Ingresa el numero e: ");
        double e = texto.nextDouble();   
        
        System.out.print("Ingresa el numero f: ");
        double f = texto.nextDouble();   
        
         System.out.print("Ingresa el numero g: ");
        double g = texto.nextDouble();  
        
       System.out.print("Ingresa el numero h: ");
        double h = texto.nextDouble(); 
        
        System.out.print("Ingresa el numero j: ");
        double j = texto.nextDouble(); 
        
        double EjercicioBtotal = a*a/(b-c)+(d-e)/(f-g*h/j) ;
        System.out.println("El resultado del ejercicio B es: " + EjercicioBtotal +"");

    
}
}
