package practice;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(ArrayList<Gear> gears, int maxGears, int currentGear, boolean clutchIsIn) {
        this.gears = gears;
        this.maxGears = maxGears;
        Gear neutralGear = new Gear(0,0.0);
        this.gears.add(neutralGear);
    }

    public void operationClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void changeGear(int newGear) {
        if ((newGear > 0) && (newGear < this.gears.size()) && this.clutchIsIn)  {
            this.currentGear = newGear;
            System.out.println("Gear" + newGear + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {
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
