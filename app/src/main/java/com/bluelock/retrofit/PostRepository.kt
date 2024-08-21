package com.bluelock.retrofit

class PostRepository {

    suspend fun getPost(): List<Post> = RetrofitBuilder.api.getData()
}