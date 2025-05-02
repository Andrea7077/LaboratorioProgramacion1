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
public class Martinez_Andrea_SarahiEjercicio4Fecha {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera fecha (DD/MM/AAAA): ");
        String primerafecha = scanner.nextLine();

        System.out.print("Ingresa la segunda fecha (DD/MM/AAAA): ");
        String segundafecha = scanner.nextLine();

        if (primerafecha.length() != 10 || segundafecha.length() != 10) {
            System.out.println("Formato incorrecto. (ej. 08/01/2025).");
            return;
        }

        int dia1 = Integer.parseInt(primerafecha.substring(0, 2));
        int mes1 = Integer.parseInt(primerafecha.substring(3, 5));
        int anpo1 = Integer.parseInt(primerafecha.substring(6, 10));

        int dia2 = Integer.parseInt(segundafecha.substring(0, 2));
        int mes2 = Integer.parseInt(segundafecha.substring(3, 5));
        int anpo2 = Integer.parseInt(segundafecha.substring(6, 10));

        int Dias1 = anpo1 * 360 + (mes1 - 1) * 30 + dia1;
        int Dias2 = anpo2 * 360 + (mes2 - 1) * 30 + dia2;

        int diferenciadias = Math.abs(Dias1 - Dias2);

        System.out.println("Dias de diferencia entre ambas fechas: " + diferenciadias + " dias.");
}}
