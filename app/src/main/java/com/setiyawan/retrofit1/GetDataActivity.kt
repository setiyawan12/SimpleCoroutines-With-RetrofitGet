package com.setiyawan.retrofit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.setiyawan.retrofit1.api.MainViewModel
import com.setiyawan.retrofit1.repository.Repository
import kotlinx.android.synthetic.main.activity_get_data.*
import kotlinx.android.synthetic.main.activity_main.*

class GetDataActivity : AppCompatActivity() {
    private lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_data)
        val repository = Repository()
        val viewModelFactory=MainViewModelFactory(repository)
        viewModel= ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer {response->
            if(response.isSuccessful){
                tv1.text = response.body()?.userId.toString()
                tv2.text =response.body()?.id.toString()
                tv3.text = response.body()?.title!!
                tv4.text = response.body()?.body!!
            }else{
                Log.d("Response", response.errorBody().toString())
                tv1.text=response.code().toString()
                tv2.text =response.code().toString()
                tv3.text =response.code().toString()
                tv4.text = response.code().toString()
            }

        })
    }
}