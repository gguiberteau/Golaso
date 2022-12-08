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

        e.setEntrenador("Quique Setién");
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






}
