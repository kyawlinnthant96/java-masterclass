package com.klt;

import java.util.ArrayList;

public class GearBoxes {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBoxes(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutralGear = new Gear(0, 0.0);
        this.gears.add(neutralGear);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void changeGear(int newGear) {
        if ((newGear > 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear" + newGear + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }

    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }

    }
}
