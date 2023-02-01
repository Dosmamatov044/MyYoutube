package com.example.myyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.myyoutube.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class MainActivity:AppCompatActivity(){

private lateinit var binding: ActivityMainBinding
//private lateinit var navController: NavController

val viewModel:PlayListViewModel by viewModels ()



override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

 /*   val navHostFragment = supportFragmentManager
        .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
    navController = navHostFragment.navController
    val appBarConfiguration = AppBarConfiguration(navController.graph)
    NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)

*/


    viewModel.playlist.observe(this){


            Log.d("roko",it.title)

    }





}

override fun onSupportNavigateUp(): Boolean {
    onBackPressedDispatcher.onBackPressed()
    return super.onSupportNavigateUp()
}





}
