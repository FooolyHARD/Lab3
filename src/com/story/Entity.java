//Entity.java
package com.story;

public abstract class Entity{
    protected final String name;
    public State state;
    Entity(final String name, final State state){
        this.name = name;
        this.state = state;
    }
    public State getState(){
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
}
