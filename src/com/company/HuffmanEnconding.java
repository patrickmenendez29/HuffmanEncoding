package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanEnconding {


    /** CharacterList is sorted **/
    /** the string 'text' is converted into an array of chars
     * each char is inserted into a hashmap as a key, the hash works as following:
     * Key: Java.Lang.Character
     */
    private String text;
    private ArrayList<Character> characterList;
    private PriorityQueue<Character> pq;
    private HashMap<java.lang.Character,Character> hashMap;



    public HuffmanEnconding(String text) {
        this.text = text;
        hashMap = new HashMap<>();
        countLetters();
        addToPriorityQueue();
        setPriority();
    }




    private void countLetters(){


        char[] chars = text.toCharArray();

        for(char ch: chars){

         /* for (int n = 0; n < characterList.size(); n++){
              if (characterList.get(n).getC() == ch){
                  characterList.get(n).add();
              } else {
                  characterList.add(new Character(ch,0));
              }
          } */

         if (hashMap.containsKey(ch)){
             hashMap.get(ch).add();
         } else {
             hashMap.put(ch,new Character(ch,1));
         }

        }
    }

    private void addToPriorityQueue(){
        pq = new PriorityQueue<Character>(hashMap.size(), new CharacterComparator());
       ArrayList<Character> unsortedValues = new ArrayList<>(hashMap.values());
        pq.addAll(unsortedValues);
    }

    private void setPriority(){

        characterList = new ArrayList<>();
        while (!pq.isEmpty()){
            characterList.add(pq.poll());
        }

    }

    public void printResult(){
        for (Character character : characterList) {
            System.out.println(String.format("character: %s is used %s times", character.c, character.getFrequency()));
        }
        System.out.println(characterList);
    }

    public static void main(String[] e){
        HuffmanEnconding huffmanEnconding = new HuffmanEnconding("Hello World");
        huffmanEnconding.printResult();
    }
}
