package com.example.kotlin5

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class CommentViewModel @Inject constructor(private val repository: CommentRepository
) : ViewModel() {

    val comments = repository.getAllComments()

    fun fetchComments() {
        viewModelScope.launch {
            repository.fetchAndSaveComments()
        }
    }
}

