//Story.java
package com.story;

public class Story {
    public final String title;
    public Story(String title){
        this.title = title;
    }
    public void end(){
        System.out.println(title+" закончилась :c.");
    }
    public void start(){
        System.out.println(title+" Кулстори началась c:");
    }
    public void result(){
    }
}
