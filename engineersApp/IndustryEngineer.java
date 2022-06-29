package com.company.engineersApp;

public class IndustryEngineer implements Engineer{
    @Override
    public void work() {
        System.out.println("Endüstri Mühendisi Çalışaya Başladı .");
    }
    void checkProducts(){
        System.out.println("Ürünler kontrol edildi");
    }
}
