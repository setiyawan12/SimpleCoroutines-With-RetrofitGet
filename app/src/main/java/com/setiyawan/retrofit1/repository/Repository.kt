package com.setiyawan.retrofit1.repository

import com.setiyawan.retrofit1.api.RetrofitInstance
import com.setiyawan.retrofit1.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost():Response<Post>{
        return RetrofitInstance.api.getPost()
    }
}