package es.unex.giiis.golaso.ui.partidos;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import es.unex.giiis.golaso.databinding.FragmentPartidosBinding;

public class PartidosFragment extends Fragment {

    private FragmentPartidosBinding binding;
    EditText eText;
    DatePickerDialog picker;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPartidosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;

    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;

    }

}