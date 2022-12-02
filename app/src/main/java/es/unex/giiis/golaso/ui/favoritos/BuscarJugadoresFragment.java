package es.unex.giiis.golaso.ui.favoritos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import es.unex.giiis.golaso.AppExecutors;
import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.adapters.BuscarJugadoresAdapter;
import es.unex.giiis.golaso.api.jugadores.JugadoresNetworkLoaderRunnable;
import es.unex.giiis.golaso.databinding.FragmentBuscarJugadoresBinding;
import es.unex.giiis.golaso.model.Jugador;
import es.unex.giiis.golaso.ui.elementos.JugadorDetailFragment;


public class BuscarJugadoresFragment extends Fragment implements BuscarJugadoresAdapter.OnListInteractionListener {

    private FragmentBuscarJugadoresBinding binding;
    private BuscarJugadoresAdapter mAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBuscarJugadoresBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView mRecyclerView = root.findViewById(R.id.sJugadoresList);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Create a new Adapter for the RecyclerView

        mAdapter = new BuscarJugadoresAdapter(new ArrayList<>(), this);

        AppExecutors.getInstance().networkIO().execute(new JugadoresNetworkLoaderRunnable(
                (jugadores) -> mAdapter.swap(jugadores)));

        mRecyclerView.setAdapter(mAdapter);

        return root;

    }

    @Override
    public void onListInteraction(Jugador jugador) {

        JugadorDetailFragment mFragment = JugadorDetailFragment.newInstance(jugador);
        assert getFragmentManager() != null;
        FragmentTransaction mTransaction = getFragmentManager().beginTransaction();

        mTransaction.replace(R.id.favoritosContainer, mFragment)
                .addToBackStack(null) // Add this transaction to the back stack so the user can navigate back
                .commit();

    }


    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;

    }

}