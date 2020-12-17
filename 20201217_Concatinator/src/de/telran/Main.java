package de.telran;

public class Main {
    public static void main(String[] args) {
        String res = "";
        long beforeConcatenation = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            res += "Evgeny Borisovich";

        }
        long timeConcatenation = System.currentTimeMillis() - beforeConcatenation;
        System.out.println(timeConcatenation);
    }
}
