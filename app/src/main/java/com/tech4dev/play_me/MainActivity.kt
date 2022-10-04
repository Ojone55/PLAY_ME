package com.tech4dev.play_me


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.tech4dev.play_me.databinding.ActivityMainBinding
import kotlin.time.Duration.Companion.parse
import android.net.Uri
import android.R
import android.net.Uri.*

class MainActivity(val uriString: String) : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

    }
}