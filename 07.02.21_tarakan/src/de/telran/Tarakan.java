package de.telran;

import java.util.List;
import java.util.Random;

public class Tarakan implements Runnable {

    private static final int QUICK_STEP_TIME = 50;
    private static final int SLOW_STEP_TIME = 100;


    final private String name;
    final private int distance;
    final List<Score> scoreList;
    private long startingTime;

    Random random = new Random();

    public Tarakan(String name, int distance, List<Score> scoreList, long startingTime) {
        this.name = name;
        this.distance = distance;
        this.scoreList = scoreList;
        this.startingTime = startingTime;
    }


    @Override
    public void run() {
        long startingTime = System.currentTimeMillis();

        for (int i = 0; i < distance; i++) {
            int stepLength = QUICK_STEP_TIME + random.nextInt(SLOW_STEP_TIME - QUICK_STEP_TIME);
            try {
                Thread.sleep(stepLength);
            } catch (InterruptedException e) {
               break;

            }
        }
        long theFinish = System.currentTimeMillis();

        synchronized (scoreList) {
            scoreList.add(new Score(name, (int) (theFinish - startingTime)));
        }




    }
}
