/* PROBLEMA #5
* UN EMPLEADO TRABAJA 48 HORAS EN LA SEMANA A RAZÓN DE $5000 HORA.
* EL PROCENTAJE DE RETENCIÓN EN LA FUENTE ES DEL 12,5% DEL SALARIO BRUTO.
* SE DESEA SABER CUÁL ES EL SALARIO BRUTO, LA RETENCIÓN EN LA FUENTE
* Y EL SALARIO NETO DEL TRABAJADOR.
*/

package com.danielfernandoyepezvelez;

public class algoritmo6 {
    public static String HorasEmpleado() {
        int HORAS = 48;
        int VALOR = 5000;

        double salarioBruto = VALOR * (HORAS * 4);
        double retencion = salarioBruto * 0.125;
        double salarioNeto = salarioBruto - retencion;

        return "\nHoras Semanales Trabajadas: " + HORAS + " Hotras" +
                "\nHoras Mensuales Trabajadas: " + (HORAS * 4) + " Horas" +
                "\nValor Hora: " + VALOR + "$" +
                "\nSalario Bruto: " + salarioBruto + "$" +
                "\nRetención En La Fuente: " + retencion + "$" +
                "\nSalario Neto: " + salarioNeto + "$" ;
    }
}
