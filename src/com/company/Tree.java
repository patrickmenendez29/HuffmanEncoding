package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Tree {

    private ArrayList<Character> characterList;
    private PriorityQueue<Character> pq;

    public Tree(){
        characterList = new ArrayList<>();
        pq = new PriorityQueue<>(characterList.size(),new CharacterComparator());
    }
}
