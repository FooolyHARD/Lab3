//Bag.java
package com.story;

public class Bag extends Entity implements NotALive{
    public Bag(String name, State state){
        super(name, state);
    }
    @Override
    public void exist(){
    }
    @Override
    public void setState(State state){
        System.out.println("Невозможно изменить STAT объекта");
    }
}
