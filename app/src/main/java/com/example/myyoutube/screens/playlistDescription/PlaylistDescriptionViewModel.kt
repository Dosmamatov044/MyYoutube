package com.example.myyoutube.screens.playlistDescription

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myyoutube.App
import com.example.myyoutube.Constants
import com.example.myyoutube.model.JSON.Item
import kotlinx.coroutines.launch

class PlaylistDescriptionViewModel:ViewModel() {

    val playlist= MutableLiveData<List<Item>> ()








  fun fetchList(id:String) {


        viewModelScope.launch {
            val data=  App.api?.fetchDetailPlaylist("snippet,contentDetails", Constants.KEY,id,null,null)

            try {
                if (data!!.isSuccessful) {

                    Log.d("ololo", "ok")

                    playlist.value = data.body()?.items
                }else{

                    Log.d("oloo", data.message().toString())
                }

            }catch (e:Exception){

                Log.d("oromo",e.message.toString())

            }


        }




    }}
