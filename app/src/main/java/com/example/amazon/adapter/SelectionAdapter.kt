package com.example.amazon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.R
import com.example.amazon.model.Selection

class SelectionAdapter(var context: Context, var items: ArrayList<Selection>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_selection, parent, false)
        return SelectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is SelectionViewHolder){
            var image = holder.image
            var title = holder.title

            image.setImageResource(item.image)
            title.text = item.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class SelectionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView
        var title: TextView

        init {
            image = view.findViewById(R.id.iv_selec_image)
            title = view.findViewById(R.id.tv_selec_title)
        }
    }
}