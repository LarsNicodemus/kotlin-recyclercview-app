package de.syntax_institut.syntaxheroes.data

import de.syntax_institut.syntaxheroes.data.model.MarvelCharacter

class Datasource {

    fun loadMarvelCharacters(): MutableList<MarvelCharacter> {
        return mutableListOf(
            MarvelCharacter("Spider-Man", "Peter Parker", false),
            MarvelCharacter("Iron Man", "Tony Stark", false),
            MarvelCharacter("Mephisto", "Unknown", true),
            MarvelCharacter("She-Hulk", "Jennifer Walters", false),
            MarvelCharacter("Baron Zemo", "Unknown", true),
            MarvelCharacter("Captain America", "Steve Rogers", false),
            MarvelCharacter("Thor", "Thor Odinson", false),
            MarvelCharacter("Hulk", "Bruce Banner", false),
            MarvelCharacter("Black Widow", "Natasha Romanoff", false),
            MarvelCharacter("Hawkeye", "Clint Barton", false),
            MarvelCharacter("Doctor Strange", "Stephen Strange", false),
            MarvelCharacter("Scarlet Witch", "Wanda Maximoff", false),
            MarvelCharacter("Vision", "Unknown", false),
            MarvelCharacter("Ant-Man", "Scott Lang", false),
            MarvelCharacter("Wasp", "Hope van Dyne", false),
            MarvelCharacter("Black Panther", "T'Challa", false),
            MarvelCharacter("Falcon", "Sam Wilson", false),
            MarvelCharacter("Winter Soldier", "Bucky Barnes", false),
            MarvelCharacter("Thanos", "Unknown", true),
            MarvelCharacter("Loki", "Loki Laufeyson", true),
            MarvelCharacter("Ultron", "Unknown", true),
            MarvelCharacter("Ms. Marvel", "Kamala Khan", false),
            MarvelCharacter("Moon Knight", "Marc Spector", false),
            MarvelCharacter("Blade", "Eric Brooks", false),
            MarvelCharacter("Kang the Conqueror", "Unknown", true)
        )
    }
    fun loadMarvelHeroes(heroes: MutableList<MarvelCharacter>): MutableList<MarvelCharacter> {
        var marvelHeroes = heroes
        marvelHeroes = marvelHeroes.filter { !it.isVillain }.toMutableList()
        return marvelHeroes
    }
    fun loadMarvelVillains(villains: MutableList<MarvelCharacter>): MutableList<MarvelCharacter> {
        var marvelVillains = villains
        marvelVillains = marvelVillains.filter { it.isVillain }.toMutableList()
        return marvelVillains
    }
}
