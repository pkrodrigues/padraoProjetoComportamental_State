package org.example;

public abstract class QuartoEstado {

    public abstract String getEstado();

    public boolean desocupar(Quarto quarto){
        return false;
    }

    public boolean reservar(Quarto quarto){
        return false;
    }

    public boolean interditar(Quarto quarto){
        return false;
    }


}
