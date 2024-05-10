package com.challanges;

import java.util.ArrayList;
import java.util.List;

public class CloneOne implements ISaveable{
    private String name;
    private int hitPoint;
    private int strength;

    public CloneOne(String name, int hitPoint, int strength) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "CloneOne{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, this.name);
        list.add(1,"" + this.hitPoint);
        list.add(2,"" + this.strength);
        return list;
    }

    @Override
    public void read(List<String> saveValues) {
        if (saveValues != null && saveValues.size() > 0) {
            this.name = saveValues.get(0);
            this.hitPoint = Integer.parseInt(saveValues.get(1));
            this.strength = Integer.parseInt(saveValues.get(2));
        }
    }
}
