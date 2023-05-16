package org.example;

public class QuartoEstadoInterditado extends QuartoEstado{
    private QuartoEstadoInterditado() {};
    private static QuartoEstadoInterditado instance = new QuartoEstadoInterditado();
    public static QuartoEstadoInterditado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Interditado";
    }
}
