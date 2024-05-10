package com.klt;

public interface ITelephone {
    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
