package com.example.kotlin5

import retrofit2.http.GET
import retrofit2.http.Query

interface CommentApi {
    @GET("comments")
    suspend fun getComments(
        @Query("limit") limit: Int,
        @Query("skip") skip: Int
    ): CommentResponse
}