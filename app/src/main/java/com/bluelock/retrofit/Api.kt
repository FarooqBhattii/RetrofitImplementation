package com.bluelock.retrofit

import retrofit2.http.GET

interface Api {

    @GET("posts")
    suspend fun getData(): List<Post>
}