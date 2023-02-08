package com.example.myyoutube.model.JSON

data class Item(
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: Snippet
    ,val token:String?=null,
    var contentDetails: ContentDetails? = null,
):java.io.Serializable