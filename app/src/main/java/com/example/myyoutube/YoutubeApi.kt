package com.example.myyoutube

import android.graphics.ColorSpace.Model
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface YoutubeApi {
 @Headers(
  "Content-Type: application/json;charset=utf-8",
  "Accept: application/json;charset=utf-8",
 )

    @GET("youtube/v3/playlists")
    fun getAllPlaylist(@Query("part") part:String,@Query("key") key:String,@Query("channelId")channelId:String  ): Call<YoutubePlaylistModel>




}