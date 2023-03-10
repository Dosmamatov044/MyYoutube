package com.example.myyoutube.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myyoutube.databinding.ListPlaylistItemBinding
import com.example.myyoutube.loadImage
import com.example.myyoutube.model.JSON.Item

class PlaylistAdapter(val onClick: (Item,Int) -> Unit) :
    RecyclerView.Adapter<PlaylistAdapter.PlayListHolder>() {

    var listPlaylist = listOf<Item>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    class PlayListHolder(val binding: ListPlaylistItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayListHolder {
        val binding =
            ListPlaylistItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayListHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayListHolder, position: Int) {

        val binding = holder.binding
        val model = listPlaylist[position]

        binding.tvTitle.text = model.snippet.title


        holder.binding.imgThumbnails.loadImage(model.snippet.thumbnails.high.url)

        binding.listPlaylistItemId.setOnClickListener{
            onClick(model,position)
        }


    }

    override fun getItemCount(): Int {
        return listPlaylist.size
    }


}