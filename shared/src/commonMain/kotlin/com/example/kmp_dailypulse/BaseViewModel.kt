package com.example.kmp_dailypulse

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope


expect open class BaseViewModel  {

     val scope : CoroutineScope

}