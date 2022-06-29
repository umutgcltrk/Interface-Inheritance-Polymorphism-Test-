package com.company.engineersApp;

public class InstumentPlayer {
    private String instrumentName;
    InstumentPlayer(String instrumentName){
        this.instrumentName = instrumentName;
    }
    void play(Engineer e){
        System.out.println("Enstruman Çalındı :" + instrumentName);
    }
}
