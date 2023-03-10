package com.example.myyoutube.screens.playlistDescription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myyoutube.Constants
import com.example.myyoutube.adapter.PlaylistAdapter
import com.example.myyoutube.databinding.FragmentPlaylistDescriptionBinding
import com.example.myyoutube.model.JSON.Item
import com.example.myyoutube.showToast


class FragmentPlaylistDescription : Fragment() {



    lateinit var binding: FragmentPlaylistDescriptionBinding
  val viewModel:PlaylistDescriptionViewModel by viewModels()

   lateinit var adapter: PlaylistDescriptionAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlaylistDescriptionBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        setFragmentResultListener(Constants.ITEM_KEY){requestKey, bundle ->

        val result=bundle.getString(Constants.ITEM_BUNDLE_KEY)

        if (result!=null){

            viewModel.fetchList(result)
        }else{
            activity?.showToast("Нету данных")

        } }

        viewModel.playlist.observe(viewLifecycleOwner){
            adapter.listPlaylist=it

            binding.tvTitle.text=it[0].snippet.title
            binding.tvDesc.text=it[0].snippet.description

        }


    }
    private fun init() {

      val  recyclerView = binding.recyclerView
        adapter = PlaylistDescriptionAdapter(this::onItemClick)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
    }

    private fun onItemClick(model:Item ,i: Int) {

    }


}