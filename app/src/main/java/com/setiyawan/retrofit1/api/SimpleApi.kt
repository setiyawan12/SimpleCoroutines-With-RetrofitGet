package com.setiyawan.retrofit1.api

import com.setiyawan.retrofit1.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/2")
    suspend fun getPost(): Response<Post>
}