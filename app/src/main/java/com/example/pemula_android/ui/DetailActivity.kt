package com.example.pemula_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.pemula_android.R
import com.example.pemula_android.data.pokemon

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val pokemonIntent = intent.getParcelableExtra<pokemon>(MainActivity.POKEMON_INTENT_DETAIL)


        val imgdetail = findViewById<ImageView>(R.id.img_item_photo_detail)
        val title = findViewById<TextView>(R.id.tv_item_detail)
        val tipe = findViewById<TextView>(R.id.tv_item_tipe)
        val desctription = findViewById<TextView>(R.id.tv_item_description_detail)
        val evolusiemagi = findViewById<ImageView>(R.id.tv_item_evolusi)

        imgdetail.setImageResource(pokemonIntent?.photo!!)
        title.text = pokemonIntent.namepokemon
        tipe.text = pokemonIntent.typepokemon
        desctription.text = pokemonIntent.detailpokemon
        evolusiemagi.setImageResource(pokemonIntent.photoevolution)

    }
}