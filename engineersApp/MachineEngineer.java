package com.company.engineersApp;

import javax.print.attribute.standard.MediaSize;

public class MachineEngineer implements Engineer{
    private static final String NAME="--MAKİNA MÜHENDİSİ--";
    MachineEngineer(){
        System.out.println(NAME);
    }
    @Override
    public void work() {
        System.out.println("Makina Mühendisi Çalışaya Başladı .");
    }
    void doWelding(){
        System.out.println("Kaynak Yapıldı.");
    }
}
