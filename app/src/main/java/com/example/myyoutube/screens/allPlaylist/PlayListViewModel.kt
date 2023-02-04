package com.example.myyoutube.screens.allPlaylist

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myyoutube.App
import com.example.myyoutube.Constants.KEY
import com.example.myyoutube.model.JSON.Item
import com.example.myyoutube.model.JSON.Snippet
import com.example.myyoutube.model.YoutubePlaylistModel
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class PlayListViewModel:ViewModel() {

val playlist=MutableLiveData<List<Item>> ()





    init {
        getPlaylist()
    }








    private fun getPlaylist() {


        viewModelScope.launch {


            val data=  App.api?.getAllPlaylist("snippet,contentDetails",KEY,"UCw3vK8lNe5SZzL--rMgq-CQ")


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




    }









   /* fun getPlaylist(){
        App.api?.let{

            val userObject: Call<YoutubePlaylistModel> = it.getAllPlaylist("snippet,contentDetails",KEY,"UCw3vK8lNe5SZzL--rMgq-CQ")


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

*/

}