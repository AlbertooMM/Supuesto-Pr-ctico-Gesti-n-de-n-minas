package com.example.Laboral;

public class DatosNoCorrectosException extends Exception {

    private String Message;

    public DatosNoCorrectosException(String mensaje) {
        mensaje = Message;
    }

    /** 
     * @return String
     */
    public String getMessage() {
        return Message;

    }
}
