package es.unex.giiis.golaso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import es.unex.giiis.golaso.databinding.ActivityMainBinding;
import es.unex.giiis.golaso.ui.favoritos.FavoritosFragment;
import es.unex.giiis.golaso.ui.partidos.PartidosFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new PartidosFragment()); // Para que este sea la pantalla de inicio

        binding.bottomNavigationView.setOnItemReselectedListener(item -> {

            switch (item.getItemId()){

                case R.id.partidos:
                    replaceFragment(new PartidosFragment());
                    break;
                case R.id.favoritos:
                    replaceFragment(new FavoritosFragment());
                    break;
                case R.id.clasificacion:
                    break;
                case R.id.perfil:
                    break;

            }

        });

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();

    }

}