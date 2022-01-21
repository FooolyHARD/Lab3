//Readers.java
package com.story.Entites;

public class Readers extends humanGruop{
    public Readers(final String name, final State state) {
        super(name, state);
    }
    @Override
    public void watch(){
        System.out.println(this.name+" с ухмылкой смотрят со стороны");
    }
}
