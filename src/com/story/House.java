//House.java
package com.story;

public class House extends Entity implements NotALive{
    public House(String name, State state){
        super(name, state);
    }
    @Override
    public void exist(){
    }
    public void fall(){
        System.out.println(name+" упал из-за изенения почвы");
    }
}
