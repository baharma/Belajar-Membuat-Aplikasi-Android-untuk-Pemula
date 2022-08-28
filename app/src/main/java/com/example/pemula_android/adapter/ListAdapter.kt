package com.example.pemula_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.example.pemula_android.R
import com.example.pemula_android.data.pokemon

class ListAdapter(private val listpokemon: ArrayList<pokemon>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_description)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_pokemon, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pokemonlist = listpokemon[position]
        Glide.with(holder.itemView.context)
            .load(pokemonlist.photo)
            .transition(DrawableTransitionOptions.withCrossFade())

            .into(holder.imgPhoto)
        holder.tvName.text = pokemonlist.namepokemon
        holder.tvDetail.text = pokemonlist.typepokemon
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listpokemon[holder.adapterPosition]) }
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: pokemon)
    }
    override fun getItemCount(): Int = listpokemon.size
}