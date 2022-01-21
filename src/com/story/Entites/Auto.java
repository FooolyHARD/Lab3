package com.story.Entites;

import com.story.Interface.NotALive;

public class Auto extends Entity implements NotALive {
    public Auto(String name, State state){
        super(name, state);
    }
    @Override
    public void exist(){
    }
    @Override
    public void setState(State state){
        System.out.println("Невозможно изменить STAT объекта");
    }
    public String retname(){
        return this.name;
    }
}
