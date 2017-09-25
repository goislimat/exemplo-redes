package com.company;

import java.util.Random;

public class Cliente implements Runnable {
    private int mId;
    private int message;

    public Cliente (int id) {
        mId = id;
        message = 0;
    }

    @Override
    public void run() {
        for(;;) {
            sleepBeforeWrite();
            System.out.println("Cliente " + mId + " diz: - " + message++ + " - ");
            sleepAfterWrite();
        }
    }

    private void sleepBeforeWrite() {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sleepAfterWrite() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
