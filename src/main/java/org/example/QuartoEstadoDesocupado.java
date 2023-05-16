package org.example;

public class QuartoEstadoDesocupado extends QuartoEstado{

    private QuartoEstadoDesocupado() {};
    private static QuartoEstadoDesocupado instance = new QuartoEstadoDesocupado();
    public static QuartoEstadoDesocupado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desocupado";
    }

    public boolean reservar(Quarto quarto) {
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        return true;
    }

    public boolean interditar(Quarto quarto) {
        quarto.setEstado(QuartoEstadoInterditado.getInstance());
        return true;
    }
}
