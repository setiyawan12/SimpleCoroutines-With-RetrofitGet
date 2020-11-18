package com.setiyawan.retrofit1.api

import com.setiyawan.retrofit1.model.Post
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface SimpleApi {
    @GET("posts/2")
    suspend fun getPost(): Response<Post>

    @GET("posts/{postNumber}")
    suspend fun getPost2(
        @Path("postNumber") number:Int
    ): Response<Post>
}