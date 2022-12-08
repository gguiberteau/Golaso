package es.unex.giiis.golaso.ui.elementos;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.databinding.FragmentJugadorDetailBinding;
import es.unex.giiis.golaso.model.Jugador;

public class JugadorDetailFragment extends Fragment {

    private static final String ARG_PARAM1 = "nombre";
    private static final String ARG_PARAM2 = "pais";
    private static final String ARG_PARAM3 = "posicion";
    private static final String ARG_PARAM4 = "equipo";
    private static final String ARG_PARAM5 = "foto";
    private static final String ARG_PARAM6 = "id";
    private static final String ARG_PARAM7 = "goles";
    private static final String ARG_PARAM8 = "asistencias";
    private static final String ARG_PARAM9 = "pj";
    private static final String ARG_PARAM10 = "fechaNac";
    private static final String ARG_PARAM11 = "edad";

    private FragmentJugadorDetailBinding binding;

    private String mNombre;
    private String mPais;
    private String mPosicion;
    private String mEquipo;
    private String mFoto;
    private int mId;
    private int mGoles;
    private int mAsistencias;
    private int mPj;
    private int mFechaNac;
    private int mEdad;

    private Jugador mJugador;


    public static JugadorDetailFragment newInstance(String nombre, String pais, String posicion,
                                                    String equipo, String foto, int id, int goles,
                                                    int asistencias, int pj, int fechaNac,
                                                    int edad){

        JugadorDetailFragment fragment = new JugadorDetailFragment();
        Bundle args = new Bundle();

        args.putString(ARG_PARAM1, nombre);
        args.putString(ARG_PARAM2, pais);
        args.putString(ARG_PARAM3, posicion);
        args.putString(ARG_PARAM4, equipo);
        args.putString(ARG_PARAM5, foto);
        args.putInt(ARG_PARAM6, id);
        args.putInt(ARG_PARAM7, goles);
        args.putInt(ARG_PARAM8, asistencias);
        args.putInt(ARG_PARAM9, pj);
        args.putInt(ARG_PARAM10, fechaNac);
        args.putInt(ARG_PARAM11, edad);

        fragment.setArguments(args);

        return fragment;

    }

    public static JugadorDetailFragment newInstance(Jugador jugador) {

        JugadorDetailFragment fragment = new JugadorDetailFragment();
        Bundle args = new Bundle();

        args.putString(ARG_PARAM1, jugador.getNombre());
        args.putString(ARG_PARAM2, jugador.getPais());
        args.putString(ARG_PARAM3, jugador.getPosicion());
        args.putString(ARG_PARAM4, jugador.getEquipo());
        args.putString(ARG_PARAM5, jugador.getFoto());
        args.putInt(ARG_PARAM6, jugador.getIdJugador());
        args.putInt(ARG_PARAM7, jugador.getGoles());
        args.putInt(ARG_PARAM8, jugador.getAsistencias());
        args.putInt(ARG_PARAM9, jugador.getPartidosJugados());
        args.putInt(ARG_PARAM10, jugador.getAñoNac());
        args.putInt(ARG_PARAM11, jugador.getEdad());

        fragment.setArguments(args);

        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

            mNombre = getArguments().getString(ARG_PARAM1);
            mPais = getArguments().getString(ARG_PARAM2);
            mPosicion = getArguments().getString(ARG_PARAM3);
            mEquipo = getArguments().getString(ARG_PARAM4);
            mFoto = getArguments().getString(ARG_PARAM5);
            mId = getArguments().getInt(ARG_PARAM6);
            mGoles = getArguments().getInt(ARG_PARAM7);
            mAsistencias = getArguments().getInt(ARG_PARAM8);
            mPj = getArguments().getInt(ARG_PARAM9);
            mFechaNac = getArguments().getInt(ARG_PARAM10);
            mEdad = getArguments().getInt(ARG_PARAM11);

            mJugador = new Jugador(mId, mNombre, mEquipo, mPosicion, mGoles, mAsistencias, mEdad,
                    mFechaNac, mPj, mPais, mFoto);

        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentJugadorDetailBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ImageView iVBandera = root.findViewById(R.id.iVBandera);
        ImageView caraJugDetail = root.findViewById(R.id.caraJugDetail);
        TextView tVNombreJugDetail = root.findViewById(R.id.tVNombreJugDetail);
        TextView tVSiglaPais = root.findViewById(R.id.tVSiglaPais);
        TextView tVEdadJugDetail = root.findViewById(R.id.tVEdadJugDetail);
        TextView tVGolesJugDet = root.findViewById(R.id.tVGolesJugDet);
        TextView tVAsJugDet = root.findViewById(R.id.tVAsJugDet);
        TextView tVPJJugDet = root.findViewById(R.id.tVPJJugDetail);

        Glide.with(this)
                .load(mFoto).error(R.drawable.ic_perfil)
                .into(caraJugDetail);


        Glide.with(this)
                .load("https://countryflagsapi.com/png/" + mPais.toLowerCase())
                .into(iVBandera);

        tVNombreJugDetail.setText(mNombre);
        String edad = mEdad + " años (" + mFechaNac + ")";
        tVEdadJugDetail.setText(edad);
        tVSiglaPais.setText(mPais);
        tVGolesJugDet.setText(mGoles + " GOLES");
        tVAsJugDet.setText(mAsistencias + " ASISTENCIAS");
        tVPJJugDet.setText(mPj + " PARTIDOS");

        FloatingActionButton sharePlayer = root.findViewById(R.id.sharePlayer);
        sharePlayer.setOnClickListener(v -> {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String text="";

            text = mJugador.getNombre() + "\n Equipo: " + mJugador.getEquipo() + "\n Posición: "
                    + mJugador.getPosicion() + "\n Goles: " + mJugador.getGoles() +
                    "\n Asistencias: " + mJugador.getAsistencias() + "\n Edad: " +
                    mJugador.getEdad() + "\n Año de nacimiento: " + mJugador.getAñoNac() +
                    "\n Partidos jugados: " + mJugador.getPartidosJugados() + "\n País: " +
                    mJugador.getPais() + "\n Compartido desde GOLASO, tu app de fútbol favorita!";

            intent.putExtra(Intent.EXTRA_TEXT,text);
            startActivity(intent);

        });

        return root;
    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;

    }

}