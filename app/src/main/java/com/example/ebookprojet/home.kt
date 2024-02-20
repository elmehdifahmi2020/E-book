package com.example.ebookprojet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.CustomAdapter

class home : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        val recyclerView: RecyclerView = findViewById(R.id.View_Book)

        var addbook : ImageView =findViewById(R.id.addbook)
        addbook.setOnClickListener{
            var i= Intent(this,Add_Book::class.java)
            startActivity(i)
        }



        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(MyData.book)
        recyclerView.adapter = adapter


    }
}