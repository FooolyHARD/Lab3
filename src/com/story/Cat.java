//Cat.java
package com.story;

public class Cat extends Entity implements NotALive{
    public Cat(String name, State state){
        super(name, state);
    }
    @Override
    public void exist(){
        System.out.println("Был найден "+this.name+" с параметром "+this.state);
    }
}
