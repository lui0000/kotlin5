package com.example.kotlin5

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CommentViewModelFactory(private val repository: CommentRepository) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CommentViewModel::class.java)) {
            return CommentViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}