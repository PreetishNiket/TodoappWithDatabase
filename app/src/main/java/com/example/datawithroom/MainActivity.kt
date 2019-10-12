package com.example.datawithroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.datawithroom.Models.Todo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val db:AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "todo.db"
        )
            .allowMainThreadQueries()
            .build()
    }

    val todolist = arrayListOf<Todo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter=TodoAdapter(todolist)

        db.todoDao().getAllTodo().observe(this, Observer {
            todolist.clear()
            todolist.addAll(it)
            adapter.notifyDataSetChanged()
        })

        rv.layoutManager=  LinearLayoutManager(this)

        rv.adapter=adapter



        button.setOnClickListener {
            db.todoDao().insertTodo((Todo(name = editText.text.toString(),status = true)))
           // todolist.clear()



        }
    }
}
