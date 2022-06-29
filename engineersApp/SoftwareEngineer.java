package com.company.engineersApp;

import javax.print.attribute.standard.MediaSize;

public class SoftwareEngineer implements Engineer{
    static final String NAME = "--Yazılımcı--";
    SoftwareEngineer(){
        System.out.println(NAME);
    }
    @Override
    public void work() {
        System.out.println("Yazılım Mühendisi Çalışmaya Başladı .");
    }
    void writeCode(){
        System.out.println("Kod yazıldı");
    }
}
