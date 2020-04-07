package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here


        PriorityQueue<Character> pq = new PriorityQueue<Character>(10,new CharacterComparator());
        Character a = new Character('a',3);
        Character b = new Character('b',2);
        Character c = new Character('c',1);

        pq.add(a);
        pq.add(b);
        pq.add(c);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }


    }
}
