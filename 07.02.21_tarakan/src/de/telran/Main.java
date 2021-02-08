package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Score> scoreList = new ArrayList<>();

        Thread[] cockroachThreads = new Thread[10];
        for (int i = 1; i <= cockroachThreads.length; i++) {
            cockroachThreads[i - 1] = new Thread(new Tarakan("Cockroach" +i, 10, scoreList, 0));
        }

        for (int i = 0; i < cockroachThreads.length; i++) {
            cockroachThreads[i].start();
        }

        for (int i = 0; i < cockroachThreads.length; i++) {
            cockroachThreads[i].join();
        }

        int i = 1;
        for (Score score : scoreList) {
            System.out.println(String.format("%d, %s finished for %d", (i++), score.getName(), score.getScore()));


        }
    }
}