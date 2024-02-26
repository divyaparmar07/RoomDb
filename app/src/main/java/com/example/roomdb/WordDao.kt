package com.example.roomdb

import androidx.room.Insert

interface WordDao {

    @Insert
    suspend fun insert(word: Word)

}