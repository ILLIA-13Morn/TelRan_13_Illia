package de.telran.application;

import de.telran.data.Computer;

    public class ComputerApplication {
        public static void main(String[] args) {
            Computer comp = new Computer();
            Computer comp1 = new Computer("HP", 320);
            System.out.println(comp1.isComputerStatus());
            comp.setUserName("Illia");
            comp1.display();
        }
    }

