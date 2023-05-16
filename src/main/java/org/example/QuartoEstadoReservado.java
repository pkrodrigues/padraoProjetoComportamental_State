package org.example;

public class QuartoEstadoReservado extends QuartoEstado{
    private QuartoEstadoReservado() {};
    private static QuartoEstadoReservado instance = new QuartoEstadoReservado();
    public static QuartoEstadoReservado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Reservado";
    }

    public boolean desocupar(Quarto quarto) {
        quarto.setEstado(QuartoEstadoDesocupado.getInstance());
        return true;
    }
}
