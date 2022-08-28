package com.example.pemula_android.data

import com.example.pemula_android.R

object PokemonData {
    private val pokemonNames = arrayOf(
        "Bulbasaur",
        "Mewtwo",
        "Gengar",
        "Chandelure",
        "Metagross",
        "Garchomp",
        "Dragonite",
        "Blaziken",
        "Pikachu",
        "Nidoran"

    )

    private val pokemonDetail = arrayOf(
        "Bulbasaur adalah Pokémon Rumput & Racun. Itu rentan terhadap gerakan Terbang, Api, Psikis, dan Es. Moveset terkuat Bulbasaur adalah Vine Whip & Power Whip dan memiliki Max CP sebesar 1.115. Bulbasaur berevolusi menjadi Ivysaur. Bulbasaur dapat terlihat tidur siang di bawah sinar matahari yang cerah. Ada biji di punggungnya. Dengan menyerap sinar matahari, benih tumbuh semakin besar",
        "Mewtwo adalah Pokémon Psikis legendaris. Itu rentan terhadap gerakan Bug, Ghost, dan Dark. Moveset terkuat Mewtwo adalah Confusion & Psychic dan memiliki Max CP sebesar 4.178.Mewtwo adalah Pokemon yang diciptakan dengan manipulasi genetik. Namun, meskipun kekuatan ilmiah manusia menciptakan tubuh Pokémon ini, mereka gagal memberi Mewtwo hati yang penuh kasih.",
        "Gengar adalah Pokémon Hantu & Racun. Itu rentan terhadap gerakan Tanah, Hantu, Psikis, dan Gelap. Moveset terkuat Gengar adalah Lick & Shadow Ball dan memiliki Max CP sebesar 2.878. Terkadang, di malam yang gelap, bayangan Anda yang dilempar oleh lampu jalan tiba-tiba dan mengejutkan Anda menyusul. Itu sebenarnya Gengar yang berlari melewatimu, berpura-pura menjadi bayanganmu",
        "Chandelure adalah Pokémon Hantu & Api yang berevolusi dari Lampent. Itu rentan terhadap gerakan Tanah, Batu, Hantu, Air, dan Gelap. Moveset terkuat Chandelure adalah Fire Spin & Shadow Ball dan memiliki Max CP sebesar 3.268. Roh-roh yang terbakar dalam nyala api yang tidak menyenangkan tersesat dan berkeliaran di dunia ini selamanya",
        "Metagross adalah Pokémon Baja & Psikis yang berevolusi dari Metang. Itu rentan terhadap gerakan Tanah, Hantu, Api, dan Gelap. Moveset terkuat Metagross adalah Bullet Punch & Meteor Mash dan memiliki Max CP sebesar 3.791.  Metagross has four brains in total. Combined, the four brains can breeze through difficult calculations faster than a supercomputer. This Pokémon can float in the air by tucking in its four legs",
        "Garchomp adalah Dragon & Ground Pokémon yang berevolusi dari Gabite. Itu rentan terhadap gerakan Es, Naga, dan Peri. Moveset terkuat Garchomp adalah Dragon Tail & Outrage dan memiliki Max CP 3.962. Sisiknya yang halus tidak hanya mengurangi hambatan angin — ujungnya yang tajam juga menyebabkan cedera pada lawan yang menyerangnya",
        "Dragonite adalah Dragon & Flying Pokémon yang berevolusi dari Dragonair. Itu rentan terhadap gerakan Es, Batu, Naga, dan Peri. Moveset terkuat Dragonite adalah Dragon Tail & Draco Meteor dan memiliki Max CP 3.792. Dragonite mampu mengelilingi dunia hanya dalam 16 jam. Ini adalah Pokémon baik hati yang membawa kapal yang hilang dan tenggelam dalam badai menuju daratan yang aman",
        "Blaziken adalah Pokémon Fire & Fighting yang berevolusi dari Combusken. Itu rentan terhadap gerakan Terbang, Tanah, Air, dan Psikis. Moveset terkuat Blaziken adalah Counter & Blast Burn dan memiliki Max CP sebesar 2.848. Dalam pertempuran, Blaziken meniup api yang kuat dari pergelangan tangannya dan menyerang musuh dengan berani. Semakin kuat musuh, semakin intens pergelangan tangan Pokémon ini terbakar.",
        "Pikachu adalah Pokémon Listrik. Hal ini rentan terhadap gerakan Ground. Moveset terkuat Pikachu adalah Thunder Shock & Wild Charge dan memiliki Max CP 938. Pikachu berevolusi menjadi Raichu. Setiap kali Pikachu menemukan sesuatu yang baru, ia meledakkannya dengan sentakan listrik. Jika Anda menemukan buah beri yang menghitam, itu bukti bahwa Pokémon ini salah mengira intensitas serangannya",
        "Nidoran♀ adalah Pokémon Racun. Itu rentan terhadap gerakan Ground dan Psikis. Moveset terkuat Nidoran adalah Poison Sting & Sludge Bomb dan memiliki Max CP 816. Nidoran♀ berevolusi menjadi Nidorina. Nidoran♀ memiliki duri yang mengeluarkan racun yang kuat. Mereka diperkirakan telah berkembang sebagai perlindungan bagi Pokémon bertubuh kecil ini. Saat marah, ia melepaskan racun mengerikan dari tanduknya"

    )

    private val pokemonType = arrayOf(
        "Grass , Poison",
        "Psychic",
        "Ghost , Poison",
        "Ghost , Fire",
        "Steel , Psychic",
        "Dragon , Ground",
        "Dragon , Flying",
        "Fire , Fighting",
        "Electric",
        "Poison"
    )

    private  val  photopokemon = arrayOf(
        R.drawable.bulbasaur,
        R.drawable.mewtwo,
        R.drawable.gengar,
        R.drawable.chandelure,
        R.drawable.metagross,
        R.drawable.garchomp,
        R.drawable.dragonite,
        R.drawable.blaziken,
        R.drawable.pikachu,
        R.drawable.nidoran
    )

    private  val  photoEvolusi = arrayOf(
        R.drawable.evolusibulbasaur,
        R.drawable.mewtwoarmor,
        R.drawable.gangarevolosi,
        R.drawable.chandelureevolusi,
        R.drawable.metagrossevolusi,
        R.drawable.garchompevolusi,
        R.drawable.dragoniteevolusi,
        R.drawable.blazikenevolusi,
        R.drawable.pikachuevolusi,
        R.drawable.nidoranevolusi
    )
    val listData: ArrayList<pokemon>
        get() {
            val list = arrayListOf<pokemon>()
            for (position in pokemonNames.indices) {
                val hero = pokemon()
                hero.namepokemon = pokemonNames[position]
                hero.detailpokemon = pokemonDetail[position]
                hero.typepokemon = pokemonType[position]
                hero.photo = photopokemon[position]
                hero.photoevolution = photoEvolusi[position]
                list.add(hero)
            }
            return list
        }
}