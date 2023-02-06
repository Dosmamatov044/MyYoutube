package com.example.myyoutube.screens.videoDescription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myyoutube.Constants
import com.example.myyoutube.databinding.FragmentVideoDescriptionBinding
import com.example.myyoutube.model.JSON.Item
import com.example.myyoutube.screens.playlistDescription.PlaylistDescriptionAdapter
import com.example.myyoutube.showToast


class FragmentVideoDescription : Fragment() {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setFragmentResultListener(Constants.ITEM_KEY) { requestKey, bundle ->

            val result = bundle.getString(Constants.ITEM_BUNDLE_VIDEO_KEY)

            if (result != null) {

                //viewModel.fetchVideo(result)
            } else {
                activity?.showToast("Нету данных")

            }
        }



    }



    }