//House.java
package com.story.Entites;

import com.story.Interface.NotALive;

public class House extends Entity implements NotALive {
    public House(String name, State state){
        super(name, state);
    }
    @Override
    public void exist(){
    }
    public void fall(){
        System.out.println(name+" упал из-за изенения почвы");
    }
    @Override
    public void setState(State state){
        this.state = state;
    }
}
