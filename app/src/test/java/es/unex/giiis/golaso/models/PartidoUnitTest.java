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

    @Test
    public void shouldGetIdVisitante(){

        Partido p = new Partido(0, 27, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        assertEquals(27, p.getId_visitante());

    }

    @Test
    public void shouldSetIdVisitante(){

        Partido p = new Partido(0, 27, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        p.setId_visitante(13);

        assertEquals(13, p.getId_visitante());

    }

    @Test
    public void shouldGetEquipoLocal(){

        Partido p = new Partido(0, 0, "Betis", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        assertEquals("Betis", p.getLocal());

    }

    @Test
    public void shouldSetEquipoLocal(){

        Partido p = new Partido(0, 0, "Betis", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        p.setLocal("Sevilla");

        assertEquals("Sevilla", p.getLocal());

    }

    @Test
    public void shouldGetEquipoVisitante(){

        Partido p = new Partido(0, 0, "Local", "Barcelona",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        assertEquals("Barcelona", p.getVisitante());

    }

    @Test
    public void shouldSetEquipoVisitante(){

        Partido p = new Partido(0, 0, "Local", "Barcelona",
                "Marcador", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        p.setVisitante("Real Madrid");

        assertEquals("Real Madrid", p.getVisitante());

    }

    @Test
    public void shouldGetMarcador(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "1-0", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        assertEquals("1-0", p.getMarcador());

    }

    @Test
    public void shouldSetMarcador(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "1-0", "Estadio", "Fecha", "Hora", "Día",
                0, 0);

        p.setMarcador("2-1");

        assertEquals("2-1", p.getMarcador());

    }

    @Test
    public void shouldGetEstadio(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Benito Villamarín", "Fecha", "Hora",
                "Día", 0, 0);

        assertEquals("Benito Villamarín", p.getEstadio());

    }

    @Test
    public void shouldSetEstadio(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Benito Villamarín", "Fecha", "Hora",
                "Día", 0, 0);

        p.setEstadio("Santiago Bernabéu");
        assertEquals("Santiago Bernabéu", p.getEstadio());

    }

    @Test
    public void shouldGetFecha(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "2018-01-01", "Hora",
                "Día", 0, 0);

        assertEquals("2018-01-01", p.getFecha());

    }

    @Test
    public void shouldSetFecha(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "2018-01-01", "Hora",
                "Día", 0, 0);

        p.setFecha("2018-01-02");
        assertEquals("2018-01-02", p.getFecha());

    }

    @Test
    public void shouldGetHora(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "20:00",
                "Día", 0, 0);

        assertEquals("20:00", p.getHora());

    }

    @Test
    public void shouldSetHora(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "20:00",
                "Día", 0, 0);

        p.setHora("21:00");
        assertEquals("21:00", p.getHora());

    }

    @Test
    public void shouldGetDia(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora",
                "Lunes", 0, 0);

        assertEquals("Lunes", p.getDía());

    }

    @Test
    public void shouldSetDia(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora",
                "Lunes", 0, 0);

        p.setDía("Martes");
        assertEquals("Martes", p.getDía());

    }

    @Test
    public void shouldGetAsistencia(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora",
                "Día", 10000, 0);

        assertEquals(10000, p.getAsistencia());

    }

    @Test
    public void shouldSetAsistencia(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora",
                "Día", 10000, 0);

        p.setAsistencia(20000);
        assertEquals(20000, p.getAsistencia());

    }

    @Test
    public void shouldGetJornada(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora",
                "Día", 0, 7);

        assertEquals(7, p.getJornada());

    }

    @Test
    public void shouldSetJornada(){

        Partido p = new Partido(0, 0, "Local", "Visitante",
                "Marcador", "Estadio", "Fecha", "Hora",
                "Día", 0, 7);

        p.setJornada(10);
        assertEquals(10, p.getJornada());

    }

}
