package es.unex.giiis.golaso.ui.perfil;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    //private FirebaseAuth mAuth;
    private EditText edit_user;
    private EditText edit_password;
    private Button btn_login;
    private FragmentLoginBinding binding;
    private Requisitos requisitos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        edit_user = root.findViewById(R.id.edit_user);

        edit_password = root.findViewById(R.id.edit_password);
        btn_login = root.findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requisitos = new Requisitos();
                if(requisitos.isValidPassword(edit_password.getText().toString().trim())) {
                    if(requisitos.isValidUser(edit_user.getText().toString().trim())) {
                        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString(getString(R.string.edit_user), edit_user.getText().toString());
                        editor.putString(getString(R.string.edit_password), edit_password.getText().toString());
                        editor.apply();
                        Navigation.findNavController(root).navigate(R.id.action_nav_login_to_nav_profile);
                    }
                    else
                        edit_user.setError("El email de usuario no es válido");
                }
                else
                    edit_password.setError("La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial");
            }
        });
        return root;
    }
}