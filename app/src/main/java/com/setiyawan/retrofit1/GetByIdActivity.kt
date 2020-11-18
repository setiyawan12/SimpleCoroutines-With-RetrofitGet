package com.setiyawan.retrofit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.setiyawan.retrofit1.api.MainViewModel
import com.setiyawan.retrofit1.repository.Repository
import kotlinx.android.synthetic.main.activity_get_by_id.*

class GetByIdActivity : AppCompatActivity() {

    private lateinit var viewModel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_by_id)

        val repository=Repository()
        val viewModelFactory= MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        button.setOnClickListener {
            val myNumber:String = number_editText.text.toString()
            viewModel.getPost2(Integer.parseInt(myNumber))
            viewModel.myResponse2.observe(this, Observer { response ->
                if (response.isSuccessful){
                    tv_hasil.text = response.body().toString()
                }else{
                    tv_hasil.text =response.body().toString()
                }
            })

        }


    }
}