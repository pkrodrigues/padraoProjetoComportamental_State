import org.example.Quarto;
import org.example.QuartoEstadoDesocupado;
import org.example.QuartoEstadoInterditado;
import org.example.QuartoEstadoReservado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuartoTest {

    Quarto quarto;

    @BeforeEach
    public void setUp() {
        quarto = new Quarto();
    }

    // Aluno matriculado

    @Test
    public void naoDeveDesocuparQuartoDesoculpado() {
        quarto.setEstado(QuartoEstadoDesocupado.getInstance());
        assertFalse(quarto.desocupar());
    }

    @Test
    public void DeveReservarQuartoDesocupado() {
        quarto.setEstado(QuartoEstadoDesocupado.getInstance());
        assertTrue(quarto.reservar());
        assertEquals(QuartoEstadoReservado.getInstance(), quarto.getEstado());
    }

    @Test
    public void DeveInterditarQuartoDesocupado() {
        quarto.setEstado(QuartoEstadoDesocupado.getInstance());
        assertTrue(quarto.interditar());
        assertEquals(QuartoEstadoInterditado.getInstance(), quarto.getEstado());
    }

    //Quarto reservado
    @Test
    public void DeveDesoculparQuartoReservado() {
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        assertTrue(quarto.desocupar());
        assertEquals(QuartoEstadoDesocupado.getInstance(), quarto.getEstado());
    }

    @Test
    public void NaoDeveReservarQuartoReservado() {
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        assertFalse(quarto.reservar());
    }

    @Test
    public void NaoDeveInterditarQuartoReservado() {
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        assertFalse(quarto.interditar());
    }

    //Quarto Interditado
    @Test
    public void NaoDeveDesoculparQuartoInterditado() {
        quarto.setEstado(QuartoEstadoInterditado.getInstance());
        assertFalse(quarto.desocupar());
    }

    @Test
    public void NaoDeveReservarQuartoInterditado() {
        quarto.setEstado(QuartoEstadoInterditado.getInstance());
        assertFalse(quarto.reservar());
    }

    @Test
    public void NaoDeveInterditarQuartoInterditado() {
        quarto.setEstado(QuartoEstadoInterditado.getInstance());
        assertFalse(quarto.interditar());
    }







}
