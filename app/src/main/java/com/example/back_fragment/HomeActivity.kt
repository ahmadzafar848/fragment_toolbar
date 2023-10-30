package com.example.back_fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.homeMainFragmentContainer) as NavHostFragment
        val navController = navHostFragment.navController
        val btnBack = findViewById<ImageView>(R.id.back_icon)
        val btnHome=findViewById<ImageView>(R.id.home_icon)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.firstFragment) {
                btnBack.visibility = View.INVISIBLE
            } else {
                btnBack.visibility = View.VISIBLE
            }
        }
        btnBack.setOnClickListener {
          navController.popBackStack()
        }
        btnHome.setOnClickListener{
            if (navController.currentDestination?.id!=R.id.firstFragment){
               navController.navigate(R.id.firstFragment)
            }
        }

    }
}