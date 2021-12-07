//hunamGruop.java
package com.story;

public class humanGruop extends Entity implements ALive{
        humanGruop(final String name, final State state){
                super(name,state);
        }
        @Override
        public void say(String toWho, String phrase){
                System.out.println(this.name+" говорят "+toWho+" "+phrase);
        }
        public void watch(){
                System.out.println(this.name+" смотрят со стороны");
        }

}
