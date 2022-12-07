package es.unex.giiis.golaso.ui.buscar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import es.unex.giiis.golaso.AppExecutors;
import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.adapters.BuscarEquiposAdapter;
import es.unex.giiis.golaso.api.equipos.EquiposNetworkLoaderRunnable;
import es.unex.giiis.golaso.databinding.FragmentBuscarEquiposBinding;
import es.unex.giiis.golaso.model.Equipo;
import es.unex.giiis.golaso.ui.elementos.EquipoDetailFragment;


public class BuscarEquiposFragment extends Fragment{

    private FragmentBuscarEquiposBinding binding;
    private BuscarEquiposAdapter mAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBuscarEquiposBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView mRecyclerView = (RecyclerView) root.findViewById(R.id.buscarEquiposRecyclerView);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Create a new Adapter for the RecyclerView

        mAdapter = new BuscarEquiposAdapter(new ArrayList<>(), team -> {

            EquipoDetailFragment equipoDetail = EquipoDetailFragment.newInstance(team);
            FragmentTransaction transaction = requireActivity().getSupportFragmentManager()
                    .beginTransaction();
            transaction.replace(R.id.fragment_search, equipoDetail)
                    .addToBackStack(null)
                    .commit();
        });

        AppExecutors.getInstance().networkIO().execute(new EquiposNetworkLoaderRunnable(
                (equipos) -> mAdapter.swap(equipos)));

        mRecyclerView.setAdapter(mAdapter);

        return root;

    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;

    }

}
