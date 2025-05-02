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
public class Martinez_Andrea_SarahiEjercicio3Pagos {
     public static void main (String [] args){
    Scanner texto = new Scanner(System.in);
      texto.useDelimiter("\n");
    
     System.out.print("Ingrese el codigo del empleado: ");
     String codigodelemplado = texto.next();
     
     System.out.print("Ingrese el nombre y apellido del empleado: ");
     String nombre = texto.next();
     
     System.out.print("Ingrese las cantidad de horas trabajadas del empleado: ");
     int horas = texto.nextInt();
     double He = 0, Hn = 0, pxhe = 0,Pagonormal=0, Pagoextra=0, PagoTotal=0;
     
      System.out.println("\nCategorias disponibles:");
      System.out.println("1 - $40 por hora extra");
      System.out.println("2 - $50 por hora extra");
      System.out.println("3 - $85 por hora extra");
      System.out.println("4 - $0 (Los de esta categoria no aplican las horas extras)");
        
     System.out.print("Ingrese la categoria del empleado: ");
     int categoria = texto.nextInt();

     switch (categoria) {
            case 1 -> {
              pxhe = 40;
                if (horas <= 40) {
                    Hn = horas;
                } else {
                    Hn = 40;
                    He = horas - 40;
                    if (He > 15) {
                        He = 15;
                    }
                }
            }
            case 2 -> {
                pxhe = 50;
                if (horas <= 40) {
                    Hn = horas;
                } else {
                    Hn = 40;
                    He = horas - 40;
                    if (He > 15) {
                        He = 15;
                    }
                }
            }
            case 3 -> {
                pxhe = 85;
                if (horas <= 40) {
                    Hn = horas;
                } else {
                    Hn = 40;
                    He = horas - 40;
                    if (He > 15) {
                        He = 15;
                    }
                }
            }
            case 4 -> {
                pxhe = 0;
                Hn = horas;
                He = 0;
            }
            default -> {
                System.out.println("Categoria inválida.");
                return;
             }
        }
   
        Pagonormal = Hn * 33.99;
        Pagoextra = He * pxhe;
        
        PagoTotal = Pagonormal + Pagoextra;
        
      String PagonormalU = String.format("%.2f", Pagonormal);
      String PagoextraU = String.format("%.2f", Pagoextra);
      String PagoTotalU = String.format("%.2f", PagoTotal);

       System.out.println("\n----Boleta de Empleado----");
       System.out.println("Nombre del empleado: " +nombre);
       System.out.println("Horas Trabajadas: " +horas);
       System.out.println("Pago por horas normales: " +PagonormalU);
       System.out.println("Pago por horas extras: " +PagoextraU);
       System.out.println("Pago Total del empleado: " +PagoTotalU);

  
        
}    
}
