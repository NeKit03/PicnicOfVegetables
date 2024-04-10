package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String filename="input.txt";
        PicnicVeggies picnicVeggies=new PicnicVeggies(filename);
        System.out.println(picnicVeggies.longestWord());
        picnicVeggies.wordFrequencyAnalysis();

    }
}