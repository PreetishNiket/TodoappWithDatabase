package com.example.datawithroom

import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.datawithroom.Models.Todo


class TodoAdapter(var tasks: ArrayList<Todo>) : RecyclerView.Adapter<TodoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.simple_expandable_list_item_1,parent,false)
        return TodoViewHolder(view)

    }

    override fun getItemCount(): Int = tasks.size

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(tasks[position])
    }

}

class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(todo: Todo) {
        itemView.findViewById<TextView>(android.R.id.text1).text = todo.name
    }
}