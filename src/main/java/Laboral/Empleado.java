package com.example.Laboral;

public class Empleado extends Persona {

    public int categoria;
    public int anyos;

    public Empleado(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
        super(nombre, dni, sexo);
        categoria = 1;
        anyos = 0;

    }

    public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
        super(nombre, dni, sexo);
        if (anyos > 0) {
            this.categoria = categoria;
            this.anyos = anyos;
        }
        else{
            throw new  DatosNoCorrectosException("Datos no Correctos");

        }
    }

    /** 
     * @param newcategoria
     */
    public void setCategoria(int newcategoria) {
        if (newcategoria >= 1 && newcategoria <= 10) {
            categoria = newcategoria;
        }

    }

    /** 
     * @return int
     */
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