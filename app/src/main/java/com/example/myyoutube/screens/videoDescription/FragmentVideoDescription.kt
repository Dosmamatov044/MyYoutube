package com.example.myyoutube.screens.videoDescription

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.example.myyoutube.Constants
import com.example.myyoutube.databinding.FragmentVideoDescriptionBinding
import com.example.myyoutube.showToast


class FragmentVideoDescription : Fragment() {
   val videoPath:String="https://www.youtube.com/watch?v="
  private var player:ExoPlayer?=null


    lateinit var binding: FragmentVideoDescriptionBinding
    val viewModel: VideoDescriptionViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVideoDescriptionBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


     /*   setFragmentResultListener(Constants.ITEM_VIDEO_KEY) { requestKey, bundle ->

            val id=bundle.getString(Constants.ITEM_VIDEO_ID_BUNDLE_KEY)
            val position=bundle.getInt(Constants.ITEM_VIDEO_POSITION_BUNDLE_KEY)
            val token=bundle.getString(Constants.ITEM_VIDEO_TOKEN_BUNDLE_KEY)
          }
  */

initializePlayer()









    }

 fun initializePlayer(){

     player=ExoPlayer.Builder(requireContext()).build().also {

         binding.videoView.player=it

         val mediaItem= MediaItem.fromUri("https://rr3---sn-5go7ynlk.googlevideo.com/videoplayback?expire=1675712496&ei=kAPhY6DDDMWWgQfIkpD4AQ&ip=46.246.122.185&id=o-AOWW_dI1aZfEO1WrGM5fVevhDa_8gVSrlXJBtlL_ptMJ&itag=22&source=youtube&requiressl=yes&mh=G1&mm=31%2C26&mn=sn-5go7ynlk%2Csn-i5h7lnl6&ms=au%2Conr&mv=m&mvi=3&pl=23&initcwndbps=3450000&spc=H3gIhk7ZPysU1HHCJh10GHzPnnZFtHU&vprv=1&mime=video%2Fmp4&ns=vIJX8alNcS1EN8ZTq8WQCxAL&cnr=14&ratebypass=yes&dur=376.604&lmt=1675461362573867&mt=1675690384&fvip=4&fexp=24007246&c=WEB&txp=5432434&n=KpNjNhakR1cQTw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRQIhAMa6IhSBgXD-DNX1KWnL-n5YPkKWgSF6f7dUQmKLQi3GAiA7BTX0VkMVqDmVkXNK44KDf3wpUBXpNa0k-KMHVKMyvg%3D%3D&sig=AOq0QJ8wRQIhAI6A7S2VmpSHBNB51aiDoE3Vpk_IhBYID2UsoX4fgwxrAiAMv6chzT3eA9AshhyEDrqyAzv_qaYI3vJpxawI4imjrQ%3D%3D&title=Reasons%20why%20i%20choose%20dogs%20instead%20of%20other%20animals")
         it.setMediaItem(mediaItem)
         it.playWhenReady=true
      it.prepare()
     }

 }


}