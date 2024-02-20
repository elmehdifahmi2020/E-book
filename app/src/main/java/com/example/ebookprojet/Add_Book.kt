package com.example.ebookprojet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.RawContacts.Data
import android.widget.Button
import android.widget.TextView

class Add_Book : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)

        val lista= mutableListOf<String>()

        var author: TextView =findViewById(R.id.author)
        var title: TextView =findViewById(R.id.title)
        var price: TextView =findViewById(R.id.price)
        var cover: TextView =findViewById(R.id.cover)
        var localisation: TextView =findViewById(R.id.localisation)

        var add:Button=findViewById(R.id.add)
        add.setOnClickListener{
            val book = Book(author.text.toString(),
                title.text.toString(),
                price.text.toString(),
                cover.text.toString(),
                localisation.text.toString())


                 MyData.book.add(book)
            //listbook.add(book)


                val intent = Intent(this, home::class.java)
                startActivity(intent)
        }
    }
}
