package com.example.myyoutube.screens.videoDescription

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myyoutube.App
import com.example.myyoutube.Constants
import kotlinx.coroutines.launch

class VideoDescriptionViewModel:ViewModel() {

    fun fetchVideo(id:String) {


        viewModelScope.launch {
           val data=  App.api?.fetchDetailVideo("snippet,contentDetails", Constants.KEY,id,null,null)

            try {
                if (data!!.isSuccessful) {

                    Log.d("ololo", "ok")

              //      playlist.value = data.body()?.items
                }else{

                    Log.d("oloo", data.message().toString())
                }

            }catch (e:Exception){

                Log.d("oromo",e.message.toString())

            }


        }




    }
}