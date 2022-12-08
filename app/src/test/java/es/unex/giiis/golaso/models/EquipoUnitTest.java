package es.unex.giiis.golaso.models;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.unex.giiis.golaso.model.Equipo;

public class EquipoUnitTest {

    @Test
    public void shouldGetId(){

        Equipo e = new Equipo(42, "Equipo", "Entrenador", "Estadio",
                "Ubicación",  "Logo", "PosiciónAcceso", 0,
                0, 0, 0, 0, 0,
                0, 0);

        assertEquals((e.getIdEquipo()), 42);

    }

    @Test
    public void shouldSetId(){

        Equipo e = new Equipo(42, "Equipo", "Entrenador", "Estadio",
                "Ubicación",  "Logo", "PosiciónAcceso", 0,
                0, 0, 0, 0, 0,
                0, 0);

        e.setIdEquipo(21);
        assertEquals((e.getIdEquipo()), 21);

    }

    @Test
    public void shouldGetNombre(){

        Equipo e = new Equipo(0, "Betis", "Entrenador", "Estadio",
                "Ubicación",  "Logo", "PosiciónAcceso", 0,
                0, 0, 0, 0, 0,
                0, 0);

        assertEquals((e.getNombre()), "Betis");

    }

    @Test
    public void shouldSetNombre(){

        Equipo e = new Equipo(0, "Betis", "Entrenador", "Estadio",
                "Ubicación",  "Logo", "PosiciónAcceso", 0,
                0, 0, 0, 0, 0,
                0, 0);

        e.setNombre("Sevilla");
        assertEquals((e.getNombre()), "Sevilla");

    }

    @Test
    public void shouldGetEntrenador(){

        Equipo e = new Equipo(0, "Equipo", "Luis Enrique", "Estadio",
                "Ubicación",  "Logo", "PosiciónAcceso", 0,
                0, 0, 0, 0, 0,
                0, 0);

        assertEquals((e.getEntrenador()), "Luis Enrique");

    }

    @Test
    public void shouldSetEntrenador(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador", "Estadio",
                "Ubicación",  "Logo", "PosiciónAcceso", 0,
                0, 0, 0, 0, 0,
                0, 0);

        e.setEntrenador("Vicente del Bosque");
        assertEquals((e.getEntrenador()), "Vicente del Bosque");

    }

    @Test
    public void shouldGetEstadio(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Benito Villamarín", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 0);

        assertEquals((e.getEstadio()), "Benito Villamarín");

    }

    @Test
    public void shouldSetEstadio(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Benito Villamarín", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 0);

        e.setEstadio("Santiago Bernabéu");
        assertEquals((e.getEstadio()), "Santiago Bernabéu");

    }

    @Test
    public void shouldGetUbicacion(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Talayuela",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 0);

        assertEquals((e.getUbicacion()), "Talayuela");

    }

    @Test
    public void shouldSetUbicacion(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Talayuela",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 0);

        e.setUbicacion("Badajoz");
        assertEquals((e.getUbicacion()), "Badajoz");

    }

    @Test
    public void shouldGetLogo(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "https://acortar.link/jaf6No",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 0);

        assertEquals((e.getLogo()), "https://acortar.link/jaf6No");

    }

    @Test
    public void shouldSetLogo(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "https://acortar.link/jaf6No",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 0);

        e.setLogo("https://acortar.link/jdmV9f");
        assertEquals((e.getLogo()), "https://acortar.link/jdmV9f");

    }

    @Test
    public void shouldGetPosicionAcceso(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "Primera", 0, 0, 0,
                0, 0, 0, 0, 0);

        assertEquals((e.getPosicionAcesso()), "Primera");

    }

    @Test
    public void shouldSetPosicionAcceso(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "Primera", 0, 0, 0,
                0, 0, 0, 0, 0);

        e.setPosicionAcesso("Segunda");
        assertEquals((e.getPosicionAcesso()), "Segunda");

    }

    @Test
    public void shouldGetPosicion(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 3, 0, 0,
                0, 0, 0, 0, 0);

        assertEquals((e.getPosicion()), 3);

    }

    @Test
    public void shouldSetPosicion(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 3, 0, 0,
                0, 0, 0, 0, 0);

        e.setPosicion(5);
        assertEquals((e.getPosicion()), 5);

    }

    @Test
    public void shouldGetGolesFavor(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 10, 0,
                0, 0, 0, 0, 0);

        assertEquals((e.getGf()), 10);

    }

    @Test
    public void shouldSetGolesFavor(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 10, 0,
                0, 0, 0, 0, 0);

        e.setGf(15);
        assertEquals((e.getGf()), 15);

    }

    @Test
    public void shouldGetGolesContra(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 5,
                0, 0, 0, 0, 0);

        assertEquals((e.getGc()), 5);

    }

    @Test
    public void shouldSetGolesContra(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 5,
                0, 0, 0, 0, 0);

        e.setGc(10);
        assertEquals((e.getGc()), 10);

    }

    @Test
    public void shouldGetPartidosJugados(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                20, 0, 0, 0, 0);

        assertEquals((e.getPj()), 20);

    }

    @Test
    public void shouldSetPartidosJugados(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                20, 0, 0, 0, 0);

        e.setPj(25);
        assertEquals((e.getPj()), 25);

    }

    @Test
    public void shouldGetPartidosGanados(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 40, 0, 0, 0);

        assertEquals((e.getPg()), 40);

    }

    @Test
    public void shouldSetPartidosGanados(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 40, 0, 0, 0);

        e.setPg(45);
        assertEquals((e.getPg()), 45);

    }

    @Test
    public void shouldGetPartidosEmpatados(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 2, 0, 0);

        assertEquals((e.getPe()), 2);

    }

    @Test
    public void shouldSetPartidosEmpatados(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 2, 0, 0);

        e.setPe(6);
        assertEquals((e.getPe()), 6);

    }

    @Test
    public void shouldGetPartidosPerdidos(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 1, 0);

        assertEquals((e.getPp()), 1);

    }

    @Test
    public void shouldSetPartidosPerdidos(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 1, 0);

        e.setPp(3);
        assertEquals((e.getPp()), 3);

    }

    @Test
    public void shouldGetPuntos(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 27);

        assertEquals((e.getPt()), 27);

    }

    @Test
    public void shouldSetPuntos(){

        Equipo e = new Equipo(0, "Equipo", "Entrenador",
                "Estadio", "Ubicación",  "Logo",
                "PosiciónAcceso", 0, 0, 0,
                0, 0, 0, 0, 27);

        e.setPt(30);
        assertEquals((e.getPt()), 30);

    }

}
