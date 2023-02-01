package com.example.myyoutube

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Response

class PlayListViewModel:ViewModel() {

val playlist=MutableLiveData<Snippet> ()





    init {
        getPlaylist()
    }


    fun getPlaylist(){
        App.api?.let{

            val userObject: Call<YoutubePlaylistModel> = it.getAllPlaylist("snippet,contentDetails","AIzaSyCO__x6rsVAwStDJukt7yHGVP7mDHY7u38","UCw3vK8lNe5SZzL--rMgq-CQ")


            userObject.enqueue(object : retrofit2.Callback<YoutubePlaylistModel> {
                override fun onResponse(call: Call<YoutubePlaylistModel>, response: Response<YoutubePlaylistModel>) {


                    if (response.isSuccessful) {

                        response.body()?.items?.forEach {


                            playlist.value= it.snippet



                        }

                    } else {
                        Log.d("ololo", response.code().toString())
                    }
                }
                override fun onFailure(call: Call<YoutubePlaylistModel>, t: Throwable) {
                    Log.d("ololo", t.message.toString())
                }

            }) }




    }



}