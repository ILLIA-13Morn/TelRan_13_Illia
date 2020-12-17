package de.telran;

public class StringBuilderConcatenator implements iConcatenator{
    public String concatenate (String[] strings){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
        return builder.toString();
    }

}
