package com.example.myyoutube

import com.example.myyoutube.model.JSON.Item
import com.example.myyoutube.model.YoutubePlaylistModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface YoutubeApi {
 @Headers(
  "Content-Type: application/json;charset=utf-8",
  "Accept: application/json;charset=utf-8",
 )
//Call Для поточной работы

   // @GET("youtube/v3/playlists")
  // fun getAllPlaylist(@Query("part") part:String,@Query("key") key:String,@Query("channelId")channelId:String): Call<YoutubePlaylistModel>


 @GET("youtube/v3/playlists")
 suspend fun getAllPlaylist(@Query("part") part:String,@Query("key") key:String,@Query("channelId")channelId:String):Response <YoutubePlaylistModel>



    @GET("youtube/v3/playlistItems")
  suspend  fun fetchDetailPlaylist(
        @Query("part") part: String,
        @Query("key") key: String,
        @Query("playlistId") playlistId: String?,
        @Query("pageToken") pageToken: String?,
        @Query("videoId")videoId:String?
    ): Response<YoutubePlaylistModel>


    @GET("youtube/v3/videos")
    suspend fun fetchDetailVideo(
        @Query("part") part: String,
        @Query("key") key: String,
        @Query("playlistId") playlistId: String?,
        @Query("pageToken") pageToken: String?,
        @Query("videoId")videoId:String?
    ): Response<List<String>>

}