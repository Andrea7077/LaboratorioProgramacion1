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
public class Martinez_Andrea_SarahiEjercicio1 {
     public static void main(String[] args){
        Scanner texto = new Scanner(System.in).useDelimiter("\\n");

        System.out.print("Ingrese el nombre del empleado:");
        String nombre = texto.next();
        
        System.out.print("Ingrese las horas trabajadas mensualmente del empleado:");
        double horas = texto.nextDouble();
        
        System.out.print("Ingrese la tarifa por hora:");
        double tarifa = texto.nextDouble();
        
       double salariomensual = horas * tarifa;
       double salariosemanal = salariomensual/4 ;

        System.out.println("\n----Boleta de Empleado----");
        System.out.println("Nombre del Empleado: " + nombre + "\nHora de Trabajo Mensual: " +horas+"\nTarifa por Hora: " +tarifa+ " lps \nSalario del Empleado Semanal: " +salariosemanal+" lps");
}
}
