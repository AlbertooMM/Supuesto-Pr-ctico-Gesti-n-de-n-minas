package com.example.Laboral;

public class Empleado extends Persona {

    public int categoria;
    public int anyos;

    public Empleado(String nombre, String dni, char sexo) {
        super(nombre, dni, sexo);
        categoria = 1;
        anyos = 0;

    }

    public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) {
        super(nombre, dni, sexo);
        if (anyos > 0) {
            this.categoria = categoria;
            this.anyos = anyos;
        }
    }

    public void setCategoria(int newcategoria) {
        if (newcategoria >= 1 && newcategoria <= 10) {
            categoria = newcategoria;
        }

    }

    public int getCategoria() {
        return categoria;
    }

    public void incrAnyo() {
        anyos += 1;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Categoria: " + categoria);
        System.out.println("Años: " + anyos);

    }
}