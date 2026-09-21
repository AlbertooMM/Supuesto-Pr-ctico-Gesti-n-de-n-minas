package Laboral;


public class Persona {
    public String nombre, dni;
    public char sexo;

    public Persona(String nombre, String dni, char sexo) throws DatosNoCorrectosException {

        if (sexo == 'm' || sexo == 'f' && nombre.length() > 2 && dni.length() == 9) {
            this.nombre = nombre;
            this.dni = dni;
            this.sexo = sexo;
        } else {
            throw new DatosNoCorrectosException("Datos no Correctos");
        }

    }

    public Persona(String nombre, char sexo) throws DatosNoCorrectosException {
        if (sexo == 'm' || sexo == 'f' && nombre.length() > 2) {
            this.nombre = nombre;
            this.sexo = sexo;
        } else {
            throw new DatosNoCorrectosException("Datos no Correctos");
        }

    }

    /** 
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void imprime() {
        System.out.println("El nombre es:" + nombre + ", dni: " + dni + ", con el sexo " + sexo);
    }

}