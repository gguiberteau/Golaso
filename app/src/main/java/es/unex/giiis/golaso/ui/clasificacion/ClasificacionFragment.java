package es.unex.giiis.golaso.ui.clasificacion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.unex.giiis.golaso.databinding.FragmentClasificacionBinding;

public class ClasificacionFragment extends Fragment {

    private FragmentClasificacionBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentClasificacionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textClasificacion;
        textView.setText("Este es el ClasificacionFragment");

        return root;

    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;

    }

}