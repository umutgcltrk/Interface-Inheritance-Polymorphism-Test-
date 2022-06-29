package com.company.engineersApp;

public class Parent {
    String childName;
    Parent(String childName){
        this.childName = childName;
    }
    void lookChild(Engineer engineer){
        System.out.println("Çocuklara bakıldı.");
    }
    void giveMoneyToChild(Engineer engineer){
        System.out.println("Para verildi." + childName);
    }
}
