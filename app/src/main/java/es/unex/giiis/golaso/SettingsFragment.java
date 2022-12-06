package es.unex.giiis.golaso;

import android.os.Bundle;

import androidx.preference.ListPreference;
import androidx.preference.PreferenceFragmentCompat;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.ConfiguracionTema;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String preferencesKey) {
        setPreferencesFromResource(R.xml.preferences, preferencesKey);

        ListPreference themePreference = getPreferenceManager().findPreference(getString(R.string.settings_theme_key));
        if (themePreference.getValue() == null) {
            themePreference.setValue(ConfiguracionTema.Mode.DEFAULT.name());
        }
        themePreference.setOnPreferenceChangeListener((preference, newValue) -> {
            ConfiguracionTema.applyTheme(ConfiguracionTema.Mode.valueOf((String) newValue));
            return true;
        });
    }





}