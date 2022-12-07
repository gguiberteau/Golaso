package es.unex.giiis.golaso.ui.favoritos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.databinding.FragmentFavoritosMisFavsBinding;

public class FavoritosFragmentMisFavs extends Fragment {

    private FragmentFavoritosMisFavsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFavoritosMisFavsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;

    }

    @Override
    public void onDestroyView() {

        super.onDestroyView();
        binding = null;

    }

}