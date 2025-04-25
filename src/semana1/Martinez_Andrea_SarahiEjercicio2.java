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
public class Martinez_Andrea_SarahiEjercicio2 {
     public static void main(String[] args){
       Scanner texto = new Scanner(System.in);
      
       System.out.print("Ingrese el total del prestamo: ");
        double prestamo = texto.nextDouble();

        System.out.print("Ingrese el plazo de pago (en meses): ");
        int meses = texto.nextInt();

        System.out.print("Ingrese el porcentaje de interés mensual: ");
        double interes = texto.nextDouble();

        System.out.print("Ingrese la comisión  por cuota: ");
        double comisionPorCuota = texto.nextDouble();

        System.out.print("Ingrese el porcentaje de seguro mensual: ");
        double seguroMensual = texto.nextDouble();
           
        double cuotainicial = (prestamo * (interes / 100)) + (prestamo / meses);
       double cuotafinal = cuotainicial + (cuotainicial * (seguroMensual / 100)) + comisionPorCuota;
        double totalapagar = cuotafinal * meses;

        System.out.println("\n**** CUOTAS MENSUALES *******");
        System.out.printf("Cuota de Pago Mensual: " + cuotafinal +" HNL \n ");
        System.out.printf("Total a Pagar: " + totalapagar+ "HNL \n");
    }
}
