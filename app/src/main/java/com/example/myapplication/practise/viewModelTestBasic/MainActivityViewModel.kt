package com.example.myapplication.practise.viewModelTestBasic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingNum: Int) : ViewModel() {
    private var counter = MutableLiveData<Int>()
    val countData: LiveData<Int>
    get() = counter
    init {
        counter.value = startingNum
    }

    fun updateCounter() {
        counter.value = (counter.value)?.plus(1)
    }


}