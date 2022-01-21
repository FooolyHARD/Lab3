//Cat.java
package com.story.Entites;

import com.story.Interface.NotALive;

public class Cat extends Entity implements NotALive {
    public Cat(String name, State state){
        super(name, state);
    }
    @Override
    public void exist(){
        System.out.println("Был найден "+this.name+" с параметром "+this.state);
    }
    @Override
    public void setState(State state){
        System.out.println("Невозможно изменить STAT объекта");
    }

}
