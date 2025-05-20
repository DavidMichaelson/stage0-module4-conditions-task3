package school.mjc.stage0.conditions.task3;

import java.sql.PreparedStatement;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
            System.out.println("wrong alphabet!");
            return;
        }

        char lowerChar = Character.toLowerCase(character);

        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        AlphabeticCharacters characters = new AlphabeticCharacters();
        characters.vowelDeterminer('%');
        characters.vowelDeterminer('A');
        characters.vowelDeterminer('a');
        characters.vowelDeterminer('b');
        characters.vowelDeterminer('B');
        characters.vowelDeterminer('u');
        characters.vowelDeterminer('U');
        characters.vowelDeterminer('Z');
        characters.vowelDeterminer('Ą');
    }
}

