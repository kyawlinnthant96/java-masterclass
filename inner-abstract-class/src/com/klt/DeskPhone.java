package com.klt;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing on " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
        System.out.println("Answering the deskphone");
        isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("ring !!!!!");
        } else {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
