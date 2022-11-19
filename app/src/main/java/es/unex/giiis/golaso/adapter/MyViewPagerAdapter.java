package es.unex.giiis.golaso.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import es.unex.giiis.golaso.ui.clasificacion.ClasificacionFragment;
import es.unex.giiis.golaso.ui.clasificacion.ClasificacionFragment_clasificacion;
import es.unex.giiis.golaso.ui.clasificacion.GoleadoresFragment_clasificacion;
import es.unex.giiis.golaso.ui.clasificacion.ResultadosFragment_clasificacion;

public class MyViewPagerAdapter extends FragmentStateAdapter {


    public MyViewPagerAdapter(@NonNull ClasificacionFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ResultadosFragment_clasificacion();
            case 1:
                return new ClasificacionFragment_clasificacion();
            default:
                return new GoleadoresFragment_clasificacion();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
