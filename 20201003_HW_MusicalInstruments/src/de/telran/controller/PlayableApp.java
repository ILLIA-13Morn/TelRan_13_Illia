package de.telran.controller;

import de.telran.data.Drum;
import de.telran.data.Guitar;
import de.telran.data.Playable;
import de.telran.data.Trumpet;

public class PlayableApp {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("GypsyGuitar",7);
        Drum drum = new Drum("BassDrum",16);
        Trumpet trumpet = new Trumpet("Shepherd's pipe",10);

        Playable [] playableObjects = {guitar,drum,trumpet};

        for (Playable p: playableObjects) {
            p.play();
        }
    }
}

