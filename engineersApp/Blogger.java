package com.company.engineersApp;

public class Blogger {
    private String blogName;
    Blogger(String blogName){
        this.blogName = blogName;
    }
    void writeBlog(Engineer e){
        System.out.println("Blog yazıldı :"+blogName);
    }
}
