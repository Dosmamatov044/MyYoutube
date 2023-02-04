package com.example.myyoutube.screens.allPlaylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myyoutube.Constants
import com.example.myyoutube.R
import com.example.myyoutube.adapter.PlaylistAdapter
import com.example.myyoutube.databinding.FragmentListPlaylistBinding
import com.example.myyoutube.model.JSON.Item
import com.example.myyoutube.showToast


class FragmentListPlaylist : Fragment() {

    lateinit var binding: FragmentListPlaylistBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: PlaylistAdapter
    val viewModel: PlayListViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListPlaylistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        updateData()


    }

    private fun updateData() {
        viewModel.playlist.observe(viewLifecycleOwner){


           adapter.listPlaylist=it


        }
    }

    private fun init() {

        recyclerView = binding.rvListPlaylist
        adapter = PlaylistAdapter(this::onItemClick)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
    }

    fun onItemClick(model:Item,position:Int) {



        findNavController().navigate(R.id.fragmentPlaylistDescription)

        setFragmentResult(Constants.ITEM_KEY, bundleOf(Constants.ITEM_BUNDLE_KEY to model.id))


    }

}


