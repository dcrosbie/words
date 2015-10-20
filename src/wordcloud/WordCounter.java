/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcloud;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author David Crosbie
 */
public class WordCounter {
        // This is a method that returns a Map containing the words and 
        // their frequency.
    
         String wordSource = "bananas are yellow bananas";
         Set<Map.Entry<String, Integer>> entrySet; // stores the word set
         Map<String, Integer> map;

        
         /** Create a blank WordCounter */
         
         WordCounter(){
         }
        
        /** Create a WordCounter from a passed string */
         
         WordCounter(String inputText){
             
             wordSource = inputText;
         }
    
        void Create(){
   
            // Create a tree map. We are using the words as keys and the count as the value
            map = new TreeMap<>();

            // Now we split the words up using punction and spaces
            String wordArray[] = wordSource.split("[{ \n\r.,]}}?");

            // Now we loop through the array
            for (String wordArray1 : wordArray) {
                String key = wordArray1.toLowerCase();
                // If this word is not present in the map then add it
                // and set the word count to 1
                if (key.length() > 0){
                    if (!map.containsKey(map)){
                        map.put(key, 1);
                    }
                    else {
                        int wordCount = map.get(key);
                        wordCount++;
                        map.put(key, wordCount);
                    }
                }
            } // end of for loop
            
            // Get all entries into a set
            // I think that before this we just have key-value pairs
            entrySet = map.entrySet();
            
            }   // end of the create method
        
        int getWordCount() {
            return entrySet.size();
            } // end of word count
        
         Iterator<Map.Entry<String, Integer>> getNextPair(){
            return entrySet.iterator();
        }
        
        Map<String, Integer> getNextMap(){
            Iterator iterator = entrySet.iterator();
            if (iterator.hasNext()){
                return (Map<String, Integer>) iterator;
            }
            else return null;
        }
   
    }   // end of count occurance
    
    
