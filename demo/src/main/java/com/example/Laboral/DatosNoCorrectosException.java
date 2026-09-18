package com.example.Laboral;

public class DatosNoCorrectosException extends Exception {

    private String Message;

    public DatosNoCorrectosException(String mensaje) {
        mensaje = Message;
    }

    public String getMessage() {
        return Message;

    }
}
