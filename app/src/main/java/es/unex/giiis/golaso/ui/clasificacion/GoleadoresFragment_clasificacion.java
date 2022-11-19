package es.unex.giiis.golaso.ui.clasificacion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.unex.giiis.golaso.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GoleadoresFragment_clasificacion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GoleadoresFragment_clasificacion extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_goleadores_clasificacion, container, false);
    }
}