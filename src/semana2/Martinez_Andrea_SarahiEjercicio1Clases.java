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
public class Martinez_Andrea_SarahiEjercicio1Clases {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        int COMA, dia, mes;
        String Dia, NumFecha, decision, desic;
        double promedios, PorceAprobados;

        System.out.print("Ingrese la fecha actual (día, DD/MM): ");
        String fechainicial = leer.nextLine().trim();

        COMA = fechainicial.indexOf(',');

        if (COMA == -1) {
            System.out.println("Se produjo un error");
        }

        Dia = fechainicial.substring(0, COMA).trim().toLowerCase();
        NumFecha = fechainicial.substring(COMA + 1).trim();

        String PosicionDia = NumFecha.substring(0, 2);
        String PosicionMes = NumFecha.substring(3, 5);

        dia = Integer.parseInt(PosicionDia);
        mes = Integer.parseInt(PosicionMes);

        if (dia < 31 && mes <= 12) {
            if (Dia.equals("lunes") || Dia.equals("martes") || Dia.equals("miercoles")) {
                System.out.println("Dia: " + Dia);
                System.out.print("Tuvieron examenes?: ");
                decision = leer.nextLine();

                desic = decision.toLowerCase();
                if (desic.equals("si")) {
                    System.out.print("Cantidad de alumnos que aprobaron?: ");
                    int AlumnosAprobados = leer.nextInt();
                    System.out.print("Cantidad de alumnos reprobaron?: ");
                    int AlumnosReprobados = leer.nextInt();

                    promedios = AlumnosAprobados + AlumnosReprobados;
                    PorceAprobados = (AlumnosAprobados / promedios) * 100;
                    String porcentajeAprobadosU = String.format("%.2f", PorceAprobados);
                    System.out.println("Porcentaje de alumnos aprobados es de: " + porcentajeAprobadosU + "%");
                }
            } else if (Dia.equals("jueves")) {
                System.out.println("Dia: " + Dia);
                System.out.print("Ingresar el % de asistencia: ");
                int Asistencia = leer.nextInt();

                String mensajeAsistencia = (Asistencia >= 50) ? "Asistió la mayoría" : "No asistió la mayoría";
                System.out.println(mensajeAsistencia);

            }
            else if (Dia.equals("viernes") && dia == 01){
                if(mes == 01 || mes == 07){
                   System.out.println("Dia: " + Dia);
                   System.out.println("Comienzo de nuevo ciclo");
                   System.out.print("Ingrese cantidad de nuevos alumnos: ");
                   int AlumnosTotal = leer.nextInt();
                   System.out.print("Ingrese precio por cada alumno en $: ");
                   int AlumnosPrecio = leer.nextInt();
                   
                   double Total = AlumnosTotal * AlumnosPrecio;
                   
                   System.out.print("Ingreso total: "+Total+"$\n");
                }
                else{
                    System.out.println("Fecha no válida..");
                }
            }
        } else {
            System.out.println("Se produjo un error");
        }
     
}}
