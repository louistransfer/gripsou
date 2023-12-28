package com.example.gripsou.ui.preferences

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.gripsou.R

class PreferencesFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}