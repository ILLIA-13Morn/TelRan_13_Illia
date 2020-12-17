package de.telran;

public class StringConcatenator implements iConcatenator {
    public String concatenate (String [] strings){
        String res = "";
        for (int i = 0; i < strings.length ; i++) {
            res += strings[i];
        }
    return res;
    }
}
