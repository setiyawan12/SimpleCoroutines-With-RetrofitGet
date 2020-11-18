package com.setiyawan.retrofit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.setiyawan.retrofit1.api.MainViewModel
import com.setiyawan.retrofit1.repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            startActivity(Intent(this,GetDataActivity::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this,GetByIdActivity::class.java))
        }
    }
}