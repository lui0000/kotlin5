package com.example.kotlin5

import androidx.lifecycle.LiveData
import javax.inject.Inject

class CommentRepository @Inject constructor(private val commentApi: CommentApi, private val commentDao: CommentDao) {

    suspend fun fetchAndSaveComments() {
        val comments = commentApi.getComments(20, 0).comments
        commentDao.insertComments(comments)
    }

    fun getAllComments(): LiveData<List<Comment>> {
        return commentDao.getAllComments()
    }
}
