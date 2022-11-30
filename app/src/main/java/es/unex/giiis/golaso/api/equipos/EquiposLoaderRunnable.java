package es.unex.giiis.golaso.api.equipos;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import es.unex.giiis.golaso.AppExecutors;
import es.unex.giiis.golaso.model.Equipo;

public class EquiposLoaderRunnable implements Runnable{

    private final InputStream mInFile;
    private final OnEquiposLoadedListener mOnEquiposLoadedListener;


    public EquiposLoaderRunnable(InputStream inFile, OnEquiposLoadedListener
            onEquiposLoadedListener){

        mInFile = inFile;
        mOnEquiposLoadedListener = onEquiposLoadedListener;

    }

    @Override
    public void run(){

        // Obtención de los datos a partir del InputStream

        // Parse json file into JsonReader

        JsonReader reader = new JsonReader(new InputStreamReader(mInFile));

        // Parse JsonReader into list of Repo using Gson

        List<Equipo> equipos = Arrays.asList(new Gson().fromJson(reader, Equipo[].class));


        // Llamada al Listener con los datos obtenidos

        AppExecutors.getInstance().mainThread().execute(new Runnable() {

            @Override
            public void run() {

                mOnEquiposLoadedListener.onEquiposLoaded(equipos);

            }

        });

    }

}
