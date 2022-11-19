package es.unex.giiis.golaso.ui.clasificacion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.List;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.ResponseListener;
import es.unex.giiis.golaso.adapter.ClasificacionAdapter;
import es.unex.giiis.golaso.databinding.FragmentClasificacionClasificacionBinding;
import es.unex.giiis.golaso.manager.RequestManager;
import es.unex.giiis.golaso.model.Equipo;

public class ClasificacionFragment_clasificacion extends Fragment {

    private FragmentClasificacionClasificacionBinding binding;
    TableLayout tableLayout;
    TableRow tableRow;
    RecyclerView recyclerView;
    RequestManager manager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentClasificacionClasificacionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        tableLayout = root.findViewById(R.id.tablaClas);
        tableRow = root.findViewById(R.id.Cabecera);
        recyclerView = root.findViewById(R.id.rVClas);

        manager = new RequestManager(this.getContext());
        manager.getEquipos(listener);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private final ResponseListener listener = new ResponseListener() {
        @Override
        public void didFetch(List<Equipo> list, String message) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ClasificacionFragment_clasificacion.this.getContext()));
            ClasificacionAdapter adapter = new ClasificacionAdapter(ClasificacionFragment_clasificacion.this.getContext(), list);
            recyclerView.setAdapter(adapter);
        }

        @Override
        public void didError(String message) {
            Toast.makeText(ClasificacionFragment_clasificacion.this.getContext(), message, Toast.LENGTH_LONG).show();
        }
    };
}