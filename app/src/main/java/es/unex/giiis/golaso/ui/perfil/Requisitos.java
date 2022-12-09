package es.unex.giiis.golaso.ui.perfil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Requisitos {
        //Metodo para verificar que la contraseña contiene al menos una mayuscula, una minuscula, un numero y un caracter especial
        public boolean isValidPassword(final String password) {

            Pattern pattern;
            Matcher matcher;

            final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";

            pattern = Pattern.compile(PASSWORD_PATTERN);
            matcher = pattern.matcher(password);

            return matcher.matches();
        }

        public boolean isValidUser(final String user) {

            Pattern pattern;
            Matcher matcher;

            final String USER_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

            pattern = Pattern.compile(USER_PATTERN);
            matcher = pattern.matcher(user);

            return matcher.matches();
        }

}
