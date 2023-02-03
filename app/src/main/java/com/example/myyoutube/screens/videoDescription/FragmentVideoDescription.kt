package com.example.myyoutube.screens.videoDescription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myyoutube.databinding.FragmentVideoDescriptionBinding


class FragmentVideoDescription : Fragment() {




    lateinit var binding: FragmentVideoDescriptionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVideoDescriptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {

    }
}