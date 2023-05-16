package org.example;

public class Quarto {
    private int numero;
    private QuartoEstado estado;

    public Quarto() {
        this.estado = QuartoEstadoDesocupado.getInstance();
    }

    public void setEstado(QuartoEstado estado){
        this.estado = estado;
    }

    public boolean desocupar(){
        return estado.desocupar(this);
    }

    public boolean reservar(){
        return estado.reservar(this);
    }

    public boolean interditar(){
        return estado.interditar(this);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public QuartoEstado getEstado() {
        return estado;
    }
}
