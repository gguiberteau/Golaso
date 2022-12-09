package es.unex.giiis.golaso.ui.perfil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.databinding.FragmentModificarPerfilBinding;

public class ModificarPerfilFragment extends Fragment {

    private EditText modify_user;
    private EditText modify_password;
    private Button btn_edit;
    private FragmentModificarPerfilBinding binding;
    private SharedPreferences sharedPref;
    private Requisitos requisitos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentModificarPerfilBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        sharedPref = getActivity().getPreferences(getContext().MODE_PRIVATE);

        modify_user = root.findViewById(R.id.modify_user);
        modify_user.setText(sharedPref.getString(getString(R.string.edit_user), "No user"));

        modify_password = root.findViewById(R.id.modify_password);
        modify_password.setText(sharedPref.getString(getString(R.string.edit_password), "No password"));

        btn_edit = root.findViewById(R.id.btn_edit);
        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requisitos = new Requisitos();
                if(requisitos.isValidPassword(modify_password.getText().toString().trim())) {
                    if(requisitos.isValidUser(modify_user.getText().toString().trim())) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString(getString(R.string.edit_user), modify_user.getText().toString());
                        editor.putString(getString(R.string.edit_password), modify_password.getText().toString());
                        Navigation.findNavController(root).navigate(R.id.action_nav_modificar_perfil_to_nav_profile);
                    }
                    else
                        modify_user.setError("El email de usuario no es válido");
                }
                else
                    modify_password.setError("La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial");
            }
        });
        return root;
    }
}