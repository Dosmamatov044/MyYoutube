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


     val list:MutableList<Item> = mutableListOf<Item>()
    val playlist= MutableLiveData<List<Item>> ()







  fun fetchList(id:String) {


        viewModelScope.launch {
            val data=  App.api?.fetchDetailPlaylist("snippet,contentDetails", Constants.KEY,id,null,null)

            try {
                if (data!!.isSuccessful) {

                    Log.d("ololo", "ok")




                    data.body()?.items?.forEach {
                        val token = data.body()?.nextPageToken
                        val item=Item(it.etag,it.id,it.kind,it.snippet,token,it.contentDetails)
                        list.add(item)

                    }





                    playlist.value = list

                }else{

                    Log.d("oloo", data.message().toString())
                }

            }catch (e:Exception){

                Log.d("oromo",e.message.toString())

            }


        }




    }}
