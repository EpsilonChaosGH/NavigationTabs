package com.example.navigationtabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val navHost =
                supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
            val navController = navHost.navController

            val graph = navController.navInflater.inflate(R.navigation.main_graph)
            graph.setStartDestination(R.id.tabsFragment)
            navController.graph = graph
        }

}