
package com.example.dma_lab1
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel: ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    fun changeText(newText: String) {
        _text.value = newText
    }
}