package com.example.kotlin5

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Comment::class], version = 1)
@TypeConverters(Converters::class)
abstract class CommentDatabase : RoomDatabase() {
    abstract fun recipeDao(): CommentDao
}