package com.setiyawan.retrofit1.api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.setiyawan.retrofit1.model.Post
import com.setiyawan.retrofit1.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository):ViewModel() {
    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()
    fun getPost(){
        viewModelScope.launch{
            val response:Response<Post> = repository.getPost()
            myResponse.value =response
        }
    }
}