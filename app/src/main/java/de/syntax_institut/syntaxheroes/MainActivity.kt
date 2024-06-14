package de.syntax_institut.syntaxheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.syntax_institut.syntaxheroes.adapter.CharacterAdapter
import de.syntax_institut.syntaxheroes.data.Datasource
import de.syntax_institut.syntaxheroes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)

        val marvelCharacters = Datasource().loadMarvelCharacters()
        val characterAdapter = CharacterAdapter(marvelCharacters,this)
        vb.rvList.adapter = characterAdapter




        vb.btnAll.setOnClickListener {
            vb.rvList.adapter = characterAdapter
        }
        vb.btnHeroes.setOnClickListener {
            val heroList = Datasource().loadMarvelCharacters().filter { !it.isVillain }
            val heroesAdapter = CharacterAdapter(heroList,this)
            vb.rvList.adapter = heroesAdapter
        }
        vb.btnVillains.setOnClickListener {
            val villainList = Datasource().loadMarvelCharacters().filter { it.isVillain }
            val villainsAdapter = CharacterAdapter(villainList,this)
            vb.rvList.adapter = villainsAdapter
        }
    }
}
