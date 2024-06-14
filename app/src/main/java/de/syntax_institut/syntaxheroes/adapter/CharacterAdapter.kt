package de.syntax_institut.syntaxheroes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import de.syntax_institut.syntaxheroes.data.model.MarvelCharacter
import de.syntax_institut.syntaxheroes.databinding.HeroesListBinding
import de.syntax_institut.syntaxheroes.databinding.VillainListBinding

class CharacterAdapter(
    private val marvelCharacter: MutableList<MarvelCharacter>,
    private val context: Context
) : RecyclerView.Adapter<ViewHolder>() {
    private val hero = 1
    private val villain = 2
    private val villains = marvelCharacter.filter { it.isVillain }
    private val heroes = marvelCharacter.filter { !it.isVillain }
    inner class HeroViewHolder(val binding: HeroesListBinding) : RecyclerView.ViewHolder(binding.root)
    inner class VillainViewHolder(val binding: VillainListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemViewType(position: Int): Int {
        val character = marvelCharacter[position]
        return if (character.isVillain) {
            villain
        } else {
            hero
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (viewType == hero) {
            val binding = HeroesListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            HeroViewHolder(binding)
        } else {
            val binding = VillainListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            VillainViewHolder(binding)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val character = marvelCharacter[position]
        if (holder is HeroViewHolder) {
            holder.binding.tvHeroName.text = character.realName
            holder.binding.tvHeroAlias.text = character.name
        } else if (holder is VillainViewHolder) {
            holder.binding.tvVillainName.text = character.realName
            holder.binding.tvVillainAlias.text = character.name
        }

    }



    override fun getItemCount(): Int {
        return marvelCharacter.size
    }

}
