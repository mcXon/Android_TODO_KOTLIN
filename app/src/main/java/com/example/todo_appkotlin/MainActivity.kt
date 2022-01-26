package com.example.todo_appkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTodo = findViewById<Button>(R.id.btn_save)
        val etTodo = findViewById<EditText>(R.id.et_todo)
        val lvTodo = findViewById<ListView>(R.id.lv_todo)

        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        lvTodo.adapter = adapter

        btnTodo.setOnClickListener{
            if(etTodo.text.toString().isEmpty()){
                Toast.makeText(this, "to do field is empty", Toast.LENGTH_LONG).show()
            }else{
                adapter.add(etTodo.text.toString())
            }
        }
    }


}