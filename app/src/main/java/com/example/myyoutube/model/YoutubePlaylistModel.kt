package com.example.myyoutube.model

import com.example.myyoutube.model.JSON.*

data class YoutubePlaylistModel(
    val etag: String,
    val items: List<Item>,
    val kind: String,
    val nextPageToken: String,
    val pageInfo: PageInfo,
    var contentDetails: ContentDetails? = null
)