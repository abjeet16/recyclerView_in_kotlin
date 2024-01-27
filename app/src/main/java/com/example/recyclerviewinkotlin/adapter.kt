package com.example.recyclerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(val context: Context,val itemList:ArrayList<element>) :
    RecyclerView.Adapter<adapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val photoImageView:ImageView = itemView.findViewById(R.id.photo);
        val nameTextView:TextView = itemView.findViewById(R.id.name);
        val studiesTextView:TextView = itemView.findViewById(R.id.studies);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(LayoutInflater.from(context).
        inflate(R.layout.item_layout,parent,false));
    }

    override fun getItemCount(): Int {

        return itemList.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.photoImageView.setImageResource(itemList[position].photo);
        holder.nameTextView.text = itemList[position].name;
        holder.studiesTextView.text = itemList[position].studies;
    }
}