package es.unex.giiis.golaso.ui.elementos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.databinding.FragmentJugadorDetailBinding;
import es.unex.giiis.golaso.model.Jugador;

public class JugadorDetailFragment extends Fragment {

    private FragmentJugadorDetailBinding binding;

    private static final String ARG_PARAM1 = "id";
    private static final String ARG_PARAM2 = "nombre";
    private static final String ARG_PARAM3 = "equipo";
    private static final String ARG_PARAM4 = "posicion";
    private static final String ARG_PARAM5 = "goles";
    private static final String ARG_PARAM6 = "asistencias";
    private static final String ARG_PARAM7 = "edad";
    private static final String ARG_PARAM8 = "fechaNacimiento";
    private static final String ARG_PARAM9 = "partidos";
    private static final String ARG_PARAM10 = "país";

    private Integer mId;
    private String mNombre;
    private String mEquipo;
    private String mPosicion;
    private Integer mGoles;
    private Integer mAsistencias;
    private Integer mEdad;
    private Integer mFechaNacimiento;
    private Integer mPartidos;
    private String mPais;

    private Jugador mJugador;

    public static JugadorDetailFragment newInstance(Jugador jugador) {

        JugadorDetailFragment fragment = new JugadorDetailFragment();
        Bundle args = new Bundle();

        args.putInt(ARG_PARAM1, jugador.getIdJugador());
        args.putString(ARG_PARAM2, jugador.getNombre());
        args.putString(ARG_PARAM3, jugador.getEquipo());
        args.putString(ARG_PARAM4, jugador.getPosicion());
        args.putInt(ARG_PARAM5, jugador.getGoles());
        args.putInt(ARG_PARAM6, jugador.getAsistencias());
        args.putInt(ARG_PARAM7, jugador.getEdad());
        args.putInt(ARG_PARAM8, jugador.getAñoNac());
        args.putInt(ARG_PARAM9, jugador.getPartidosJugados());
        args.putString(ARG_PARAM10, jugador.getPais());

        fragment.setArguments(args);

        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

            mId = getArguments().getInt(ARG_PARAM1);
            mNombre = getArguments().getString(ARG_PARAM2);
            mEquipo = getArguments().getString(ARG_PARAM3);
            mPosicion = getArguments().getString(ARG_PARAM4);
            mGoles = getArguments().getInt(ARG_PARAM5);
            mAsistencias = getArguments().getInt(ARG_PARAM6);
            mEdad = getArguments().getInt(ARG_PARAM7);
            mFechaNacimiento = getArguments().getInt(ARG_PARAM8);
            mPartidos = getArguments().getInt(ARG_PARAM9);
            mPais = getArguments().getString(ARG_PARAM10);

            mJugador = new Jugador(mId, mNombre, mEquipo, mPosicion, mGoles, mAsistencias, mEdad, mFechaNacimiento, mPartidos, mPais);

        }

    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        binding= FragmentJugadorDetailBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView tvNombre = root.findViewById(R.id.tvNombreJugador);
        TextView tvEquipo = root.findViewById(R.id.textViewEquipoJugador);
        TextView tvPosicion = root.findViewById(R.id.tvPosicionJugador);
        TextView tvGoles = root.findViewById(R.id.tVGolesJugador);
        TextView tvAsistencias = root.findViewById(R.id.tvAsistenciasJugador);
        TextView tvEdad = root.findViewById(R.id.tvEdadJugador);
        TextView tvFechaNacimiento = root.findViewById(R.id.tvAnoNacJugador);
        TextView tvPartidos = root.findViewById(R.id.tvPJJugador);
        TextView tvPais = root.findViewById(R.id.tvPaisJugador);

        tvNombre.setText(mNombre);
        tvEquipo.setText(mEquipo);
        tvPosicion.setText(mPosicion);
        tvGoles.setText(mGoles.toString());
        tvAsistencias.setText(mAsistencias.toString());
        tvEdad.setText(mEdad.toString());
        tvFechaNacimiento.setText(mFechaNacimiento.toString());
        tvPartidos.setText(mPartidos.toString());
        tvPais.setText(mPais);


        Button share = (Button) root.findViewById(R.id.bSharePlayer);
        share.setOnClickListener(view -> {

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