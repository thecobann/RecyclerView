package com.example.useofrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private var recyclerview: RecyclerView?= null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview= findViewById<RecyclerView>(R.id.recycler_View)
        layoutManager = LinearLayoutManager(this)

        recyclerview?.layoutManager = layoutManager
        adapter = RecyclerAdapter()
        recyclerview?.adapter = adapter


    }
}