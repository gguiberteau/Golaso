package es.unex.giiis.golaso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import es.unex.giiis.golaso.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Passing each menu ID as a set of Ids because each menu should be considered as top
        // level destinations.

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_fav, R.id.nav_table, R.id.nav_profile)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

    }

}