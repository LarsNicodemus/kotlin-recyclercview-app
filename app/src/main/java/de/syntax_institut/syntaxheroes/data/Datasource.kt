package de.syntax_institut.syntaxheroes.data

import de.syntax_institut.syntaxheroes.data.model.MarvelCharacter

class Datasource {

    fun loadMarvelCharacters(): List<MarvelCharacter> {
        return listOf(
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
}
