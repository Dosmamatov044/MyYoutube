package com.example.myyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myyoutube.adapter.PlaylistAdapter
import com.example.myyoutube.databinding.ActivityMainBinding
import com.example.myyoutube.screens.allPlaylist.PlayListViewModel
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class MainActivity:AppCompatActivity(){

private lateinit var binding: ActivityMainBinding

val viewModel:PlayListViewModel by viewModels()

   lateinit var    adapter : PlaylistAdapter


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

   val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentHost) as NavHostFragment
    val navController=navHostFragment.navController













}

override fun onSupportNavigateUp(): Boolean {
    onBackPressedDispatcher.onBackPressed()
    return super.onSupportNavigateUp()
}





}
