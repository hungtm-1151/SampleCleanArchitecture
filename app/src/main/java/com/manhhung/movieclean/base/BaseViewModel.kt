package com.manhhung.movieclean.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import java.net.UnknownHostException

open class BaseViewModel : ViewModel() {
    protected val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String>
        get() = _errorMessage
    protected val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        when (throwable) {
            is UnknownHostException -> viewModelScope.launch {
                _errorMessage.value = "CHECK YOUR INTERNET CONNECTION!!!"
            }
            else -> viewModelScope.launch {_errorMessage.value = throwable.message}
        }

    }


    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}
