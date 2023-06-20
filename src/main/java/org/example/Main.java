package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
/*1. Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
Слова, які відрізняються лише регістром букв, вважати однаковими.
Використовуйте клас HashSet.*/

        HashSet<String> myString = new HashSet<String>();

        String text = "dog, cat, bird, Bird, fish, salmon, SAlmoN, elephant, Cat";


        String[] words = text.split(", ");


        for (int i = 0; i < words.length; i++) {

            System.out.print(words[i] + ", ");

            myString.add(words[i]);

        }



        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {

                    myString.remove(words[i]);
                }

            }
        }

        System.out.println();
        System.out.println(myString);
        System.out.println();

        /*2. Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
Для кожного слова підрахувати частоту його входження в текст. Слова, які
відрізняються регістром літер, вважати різними. Використовувати клас
HashMap.*/


        HashMap<String, Integer> myString2 = new HashMap<>();

        String text2 = "dog, cat, Cat, bird, Bird, fish, salmon, elephant, Dog";

        String[] words2 = text2.split(", ");

        for (int i = 0; i < words2.length; i++) {
            if (myString2.containsKey(words2[i])){
                myString2.replace(words2[i], myString2.get(words2[i])+1);
            }
            else  {
                myString2.put(words2[i], 1);
            }

        }

        System.out.println(myString2);

    }
}


