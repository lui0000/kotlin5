package com.example.kotlin5

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CommentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComments(comments: List<Comment>)

    @Query("SELECT * FROM comment")
    fun getAllComments(): LiveData<List<Comment>>
}
