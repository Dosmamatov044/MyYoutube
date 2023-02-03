package com.example.myyoutube.screens.allPlaylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myyoutube.adapter.PlaylistAdapter
import com.example.myyoutube.databinding.FragmentListPlaylistBinding


class FragmentListPlaylist : Fragment() {

    lateinit var binding: FragmentListPlaylistBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: PlaylistAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListPlaylistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() {

        recyclerView = binding.rvListPlaylist
        adapter = PlaylistAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

       val viewModel: PlayListViewModel by viewModels()
        viewModel.playlist.observe(viewLifecycleOwner, )
    }
}