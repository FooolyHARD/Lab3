//Entity.java
package com.story.Entites;
//Abstract to alll
//Испаользовать абстрацкию как интерфейс
public abstract class Entity{
    protected final String name;
    public State state;
    protected Entity(final String name, final State state){
        this.name = name;
        this.state = state;
    }
    public State getState(){
        return this.state;
    }
    public abstract void setState(State state);
    public String getName() {return this.name;}
}

