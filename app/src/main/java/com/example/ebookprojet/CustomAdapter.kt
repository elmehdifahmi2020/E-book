package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ebookprojet.Book
import com.example.ebookprojet.MyData
import com.example.ebookprojet.R


class CustomAdapter(private var listbook: MutableList<Book> = mutableListOf<Book>(),
): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    lateinit var context:Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.template_ebook  , parent, false)
        context = parent.context
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listbook.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book: Book = listbook[position]

        holder.author.text=book.author
        holder.title.text=book.title
        holder.price.text= book.price
        holder.cover.text=book.cover
        holder.localisation.text=book.localisation

        holder.btnremove.setOnClickListener {
           MyData.book.remove(book)
            notifyDataSetChanged()
        }

    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        //var image:ImageView=itemView.findViewById(R.id.img_book)
        var author:TextView=itemView.findViewById(R.id.author)
        var title:TextView=itemView.findViewById(R.id.title)
        var price:TextView=itemView.findViewById(R.id.price)
        var cover:TextView=itemView.findViewById(R.id.cover)
        var localisation:TextView=itemView.findViewById(R.id.localisation)

        var btnremove:ImageView = itemView.findViewById(R.id.btnremove)


    }



}
