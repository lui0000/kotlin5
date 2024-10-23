package com.example.kotlin5

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun providesRecipesDb(app: Application): CommentDatabase{
        return Room.databaseBuilder(
            app,
            CommentDatabase::class.java, "comments-database"
        ).build()
    }

    @Provides
    fun provideRecipeDao(database: CommentDatabase): CommentDao {
        return database.commentDao()
    }
}