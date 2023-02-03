package com.example.myyoutube.screens.playlistDescription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myyoutube.databinding.FragmentPlaylistDescriptionBinding


class FragmentPlaylistDescription : Fragment() {



    lateinit var binding: FragmentPlaylistDescriptionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlaylistDescriptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {

    }
}