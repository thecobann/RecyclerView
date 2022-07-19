package com.example.useofrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {

    private var titles= arrayOf("Mercedes- W13","Red Bull- RB18","McLaren- MCL36","Ferrari- F1-75","Alpine- A522","Alpha Tauri- AT03","Aston Martin- AMR22","Haas- VF-22","Williams- FW44","Alfa Romeo- C42")
    private var details = arrayOf("Lewis Hamilton & George Russel","Max Verstappen & Checo Perez","Lando Norris & Daniel Ricciardo","Charles Leclerc & Carlos Sainz JR.","Fernando Alonso & Esteban Ocon","Pierre Gasly & Yuki Tsunoda","Sebastian Vettel & Lance Stroll","Mick Schumacher & Kevin Magnussen","Alex Albon & Nicholas Latifi","Valtteri Bottas & Zhou Guanyu")
    private var images = intArrayOf(R.drawable.mercedes,R.drawable.redbull,R.drawable.mclaren,R.drawable.ferrari,R.drawable.alpine,R.drawable.alphatauri,R.drawable.astonmartin,R.drawable.haas,R.drawable.williams,R.drawable.alfaromeo,)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }


    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }
}