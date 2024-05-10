package com.klt;

public class Main {
    public static void main(String[] args) {
        ITelephone newPhone;
        newPhone = new DeskPhone(121234);
        newPhone.powerOn();
        newPhone.callPhone(121234);
        newPhone.answer();

    }
}
