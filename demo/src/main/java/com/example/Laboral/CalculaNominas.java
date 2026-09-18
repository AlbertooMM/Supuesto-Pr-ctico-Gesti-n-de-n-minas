package com.example.Laboral;

public class CalculaNominas {
    public static void main(String[] args) {
        try {
            Empleado em1 = new Empleado("James Gosling", "32000032G", 'm', 4, 7);
            Empleado em2 = new Empleado("Ada ñovelace", "32000031R", 'f');

            System.out.println(escribeMetodo(em1, em2));

            em1.setCategoria(9);

            em2.incrAnyo();
            em2.incrAnyo();
            System.out.println(escribeMetodo(em1, em2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static String escribeMetodo(Empleado em1, Empleado em2) {
        Nomina nomina = new Nomina();

        int sueldo1 = nomina.sueldo(em1);
        int sueldo2 = nomina.sueldo(em2);

        return "Empleado :" + em1.nombre + ", dni: " + em1.dni + ", sexo: " + em1.sexo
                + ", categoria: " + em1.getCategoria() + ", años trabajados: " + em1.anyos
                + ", sueldo: " + sueldo1 +
                "\nEmpleado :" + em2.nombre + ", dni: " + em2.dni + ", sexo: " + em2.sexo
                + ", categoria: " + em2.getCategoria() + ", años trabajados: " + em2.anyos +
                ", sueldo: " + sueldo2;

    }

}