package com.example.myyoutube.screens.videoDescription

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myyoutube.App
import com.example.myyoutube.Constants
import com.example.myyoutube.model.JSON.Item
import com.example.myyoutube.model.JSON.Snippet
import kotlinx.coroutines.launch

class VideoDescriptionViewModel:ViewModel() {



    val playlist= MutableLiveData<Snippet> ()








    fun getVideo(id:String,position:Int,token:String) {


        viewModelScope.launch {
            val data=  App.api?.getVideo("snippet,contentDetails", Constants.KEY,id,token,null)

            try {
                if (data!!.isSuccessful) {

                    Log.d("oromo", "ok")

                    playlist.value = data.body()?.items?.get(position)?.snippet
                }else{

                    Log.d("oromo", data.code().toString())
                }

            }catch (e:Exception){

                Log.d("oromo",e.message.toString()+"error")

            }


        }




    }}
