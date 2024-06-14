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
        vb.rvList.adapter = CharacterAdapter(Datasource().loadMarvelCharacters(),this)

        vb.btnAll.setOnClickListener {
            vb.rvList.adapter = CharacterAdapter(Datasource().loadMarvelCharacters(),this)
        }
        vb.btnHeroes.setOnClickListener {

            vb.rvList.adapter = CharacterAdapter(Datasource().loadMarvelHeroes(Datasource().loadMarvelCharacters()),this)
        }
        vb.btnVillains.setOnClickListener {

            vb.rvList.adapter = CharacterAdapter(Datasource().loadMarvelVillains(Datasource().loadMarvelCharacters()),this)
        }
    }
}
