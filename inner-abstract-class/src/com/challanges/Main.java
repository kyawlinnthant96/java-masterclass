package com.challanges;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player newPlayer = new Player("newPlayer1", 10,85);
        System.out.println(newPlayer.toString());

        newPlayer.setHitPoints(100);
        System.out.println(newPlayer);
        newPlayer.setWeapon("Arcane");
        System.out.println(newPlayer);
        saveObject(newPlayer);
        loadObject(newPlayer);
        System.out.println(newPlayer);

        ISaveable werewolf = new CloneOne("Werewolf",25,99);
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit"
        );
        while (!quit) {
            System.out.print("Choose an option");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String inputString = sc.nextLine();
                    values.add(index, inputString);
                    index++;
                    break;
            }
        }

        return values;

    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println(objectToSave.write().get(i));
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

