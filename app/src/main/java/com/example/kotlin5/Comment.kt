package com.example.kotlin5

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Comment(
    @PrimaryKey val id: Int,
    val body: String,
    val postId: Int,
    val likes: Int,
    val user: User
)