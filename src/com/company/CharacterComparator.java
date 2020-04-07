package com.company;

import java.util.Comparator;

public class CharacterComparator implements Comparator<Character> {
    @Override
    public int compare(Character character, Character t1) {
        if (character.getFrequency() < t1.getFrequency()){

            return -1;

        } else if (character.getFrequency() == t1.getFrequency()){

            return 0;

        } else return 1;
    }
}
