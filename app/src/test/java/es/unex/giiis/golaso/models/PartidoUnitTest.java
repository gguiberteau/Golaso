package es.unex.giiis.golaso.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.unex.giiis.golaso.model.Partido;

public class PartidoUnitTest {

    @Test
    public void shouldGetIdLocal(){

        Partido p = new Partido(42, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        assertEquals(42, p.getId_local());

    }

    @Test
    public void shouldSetIdLocal(){

        Partido p = new Partido(42, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        p.setId_local(21);

        assertEquals(21, p.getId_local());

    }

}
