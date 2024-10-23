package com.example.kotlin5

import androidx.room.Entity

@Entity
data class User(
    val id: Int,
    val username: String,
    val fullName: String
)