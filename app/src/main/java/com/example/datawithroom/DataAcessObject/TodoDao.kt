package com.example.datawithroom.DataAcessObject

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.datawithroom.Models.Todo

@Dao
interface TodoDao {

    @Insert
    fun insertTodo(todo: Todo)

    @Insert
    fun insertAll(todoList: ArrayList<Todo>)

    @Query("SELECT * FROM TODO")
    fun getAllTodo():LiveData<List<Todo>>

    @Delete
    fun delete(todo: Todo)

}