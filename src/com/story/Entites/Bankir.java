package com.story.Entites;

import com.story.Interface.ALive;

public class Bankir extends Entity implements ALive {
    public Bankir(final String name, final State state){
        super(name, state);
    }
    @Override
    public void say(String toWho, String phrase){
        System.out.println(this.name+" говорит "+toWho+" "+phrase);
    }
    @Override
    public State getState(){
        return this.state;
    }
    @Override
    public void setState(State state){
        this.state = state;
    }
}
