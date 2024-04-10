package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PicnicVeggies {

    String fileName;
    Map<String,Integer> wordFrequency=new HashMap<>();
    public PicnicVeggies(String fileName) {
        this.fileName = fileName;
        openFile(this.fileName);
    }

    public void openFile(String fileName){
        String filename = "input.txt";
        File file = new File(filename);
        int wordCount=0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                wordCount++;
                String veggies=scanner.next();
                if( wordFrequency.containsKey(veggies)){
                    wordFrequency.put(veggies,wordFrequency.get(veggies)+1);
                }else{
                    wordFrequency.put(veggies,1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        }
        System.out.printf("Всего слов в фале %s %d\n",fileName,wordCount);

    }

    public String longestWord(){
        int maxWorld=0;
        String maxWorldName=null;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if(maxWorld<entry.getValue()){
                maxWorldName=entry.getKey();
            }
        }
        return maxWorldName;
    }

    public void wordFrequencyAnalysis(){
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.printf("Слово %s встречается %d раз\n",entry.getKey(),entry.getValue());
        }
    }


}
