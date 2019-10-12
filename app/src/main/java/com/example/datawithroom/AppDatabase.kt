package com.example.datawithroom

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.datawithroom.DataAcessObject.TodoDao
import com.example.datawithroom.Models.Todo

@Database(entities = arrayOf(Todo::class) , version = 1)
abstract class AppDatabase:RoomDatabase(){
    abstract fun todoDao():TodoDao

}