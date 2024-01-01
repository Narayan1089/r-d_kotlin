package com.example.myapplication.practise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.practise.viewModelTestBasic.MainActivityViewModel
import com.example.myapplication.practise.viewModelTestBasic.MainActivityViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var bindinq: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel
    lateinit var factory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindinq= DataBindingUtil.setContentView(this,R.layout.activity_main)

        factory = MainActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this, factory).get(MainActivityViewModel::class.java)

        bindinq.lifecycleOwner = this
        bindinq.viewModel = viewModel
    }
}