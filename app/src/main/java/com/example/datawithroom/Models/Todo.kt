package com.example.datawithroom.Models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
 data class Todo (
    @PrimaryKey(autoGenerate = true)
     val id:Long=0,
     val name:String,
     val status:Boolean

 )