package com.example.gripsou.ui.preferences

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gripsou.R

class PreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings_container, PreferencesFragment())
            .commit()
    }
}