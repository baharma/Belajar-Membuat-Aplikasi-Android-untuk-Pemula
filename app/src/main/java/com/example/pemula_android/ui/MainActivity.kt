package com.example.pemula_android.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pemula_android.R
import com.example.pemula_android.adapter.CardViewAdapter
import com.example.pemula_android.adapter.GridAdapter
import com.example.pemula_android.adapter.ListAdapter
import com.example.pemula_android.data.PokemonData
import com.example.pemula_android.data.pokemon

class MainActivity : AppCompatActivity() {
    private lateinit var rvPokemon: RecyclerView
    private var title: String = "Mode List"
    private var list: ArrayList<pokemon> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)
        rvPokemon = findViewById(R.id.rv_pokemon)
        rvPokemon.setHasFixedSize(true)


        list.addAll(PokemonData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rvPokemon.layoutManager = LinearLayoutManager(this)
        val listpokemonAdapter = ListAdapter(list)
        rvPokemon.adapter = listpokemonAdapter

        listpokemonAdapter.setOnItemClickCallback(object : ListAdapter.OnItemClickCallback {
            override fun onItemClicked(data: pokemon) {

                showSelectedHero(data)
            }
        })
    }
    private fun showRecyclerGrid() {
        rvPokemon.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridAdapter(list)
        rvPokemon.adapter = gridHeroAdapter
        gridHeroAdapter.setOnItemClickCallback(object : GridAdapter.OnItemClickCallback {
            override fun onItemClicked(data: pokemon) {
                showSelectedHero(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun showRecyclerCardView() {
        rvPokemon.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAdapter(list)
        rvPokemon.adapter = cardViewHeroAdapter

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"

                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
//                title = "Mode CardView"
//
//                showRecyclerCardView()
                Toast.makeText(this,"Ini akan ada di update selanjutnya", Toast.LENGTH_SHORT).show()
            }

            R.id.action_detail_person ->{
                Intent(this,PersonActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
        setActionBarTitle(title)

    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    private fun showSelectedHero(pokemon: pokemon) {
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra(POKEMON_INTENT_DETAIL,pokemon)
        startActivity(intent)
        Toast.makeText(this, "Kamu memilih " + pokemon.namepokemon, Toast.LENGTH_SHORT).show()
    }
    companion object{
        val POKEMON_INTENT_DETAIL = "pokemondetail"
    }
}