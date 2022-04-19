package com.bnta;

public class CharacterWrapper {
    private char[] chars;

    CharacterWrapper(char[] chars){
        this.chars = chars;
    }

    public void printChars(){
        for(char c : chars){
            System.out.print(c);
        }
        System.out.print("\n");

    }
}
