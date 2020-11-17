package com.setiyawan.retrofit1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.setiyawan.retrofit1.api.MainViewModel
import com.setiyawan.retrofit1.repository.Repository

class MainViewModelFactory( private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}