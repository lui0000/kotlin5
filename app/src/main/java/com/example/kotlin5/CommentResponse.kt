package com.example.kotlin5

data class CommentResponse(
    val comments: List<Comment>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
