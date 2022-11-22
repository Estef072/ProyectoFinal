package com.example.loginmvvm.ViewModelLogin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginmvvm.Model.QuoteProvider
import com.example.loginmvvm.Model.UoteModel

class QuoteViewModel:ViewModel() {

    val quoteModel=MutableLiveData<UoteModel>()

    fun randomQuote(i:Int){
        val currentQuote:UoteModel=QuoteProvider.random(i)
        quoteModel.postValue(currentQuote)
    }

}