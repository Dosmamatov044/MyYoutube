package com.example.myyoutube.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myyoutube.databinding.ListPlaylistItemBinding
import com.example.myyoutube.model.YoutubePlaylistModel

class PlaylistAdapter:RecyclerView.Adapter<PlaylistAdapter.PlayListHolder>() {

    var listPlaylist = mutableListOf<YoutubePlaylistModel>()

    fun updateList(list: MutableList<YoutubePlaylistModel>){
        listPlaylist = list
        notifyDataSetChanged()
    }


    class PlayListHolder (val binding: ListPlaylistItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayListHolder {
        val binding = ListPlaylistItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PlayListHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayListHolder, position: Int) {
        holder.binding.tvTitle.text = listPlaylist[position].items[position].snippet.title
        //holder.binding.imgThumbnails.setImageBitmap(listPlaylist[position].items[position].snippet.thumbnails.high.url)
    }

    override fun getItemCount(): Int {
        return listPlaylist.size
    }


}