package es.unex.giiis.golaso.adapters;

import android.support.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import es.unex.giiis.golaso.ui.buscar.BuscarEquiposFragment;
import es.unex.giiis.golaso.ui.buscar.BuscarJugadoresFragment;

public class BuscarAdapter extends FragmentStateAdapter {

    public BuscarAdapter(@NonNull Fragment fragment) {

        super(fragment);

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position == 0) {

            return new BuscarJugadoresFragment();

        }else {

            return new BuscarEquiposFragment();

        }
    }

    @Override
    public int getItemCount() {

        return 2;

    }

}

