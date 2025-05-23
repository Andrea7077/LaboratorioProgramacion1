/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Martienz_Andrea_Exam1 {
    public static void main(String[] args){

   Scanner texto = new Scanner(System.in);
        int opcion = 0;
   
   
   
   do{
       System.out.println("\n === MENU === ");
       System.out.println("1. Piramide");
       System.out.println("2. Clave");
       System.out.println("3. Piedra Papel o Tijera");
       System.out.println("4. Adivinar");
       System.out.println("5. Salir");
       System.out.print("Seleccione la opcion: ");
        opcion = texto.nextInt();
        
        
        switch (opcion){
            case 1: 
                System.out.println("\n== Piramide ==");
                
                System.out.print("Cantidad de fila de la Piramide: ");
                int cantidadpiramide = texto.nextInt();
                int contador = 1;
                
                for(int i = 1; i<=cantidadpiramide; i++){
                    int suma = 0;   
                     for (int j=1; j<=i; j++){
                         System.out.print(contador + " ");
                        
                         suma += contador;
                         contador +=2;
                     }
                         System.out.println("= " +suma);

                }
                break;
            case 2: 
                System.out.println("\n== Clave ==");
                break;
                
            case 3:
                System.out.println("== Piedra Papel o Tijera ==");
                break;
            case 4:
                System.out.println("== Adivinar ==");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default: 
                System.out.println("Opcion invalida...");
        }
        
        
    }while(opcion != 5);{
        texto.close();
    }
   
}
}
