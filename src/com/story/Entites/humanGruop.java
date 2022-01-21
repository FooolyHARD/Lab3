//hunamGruop.java
package com.story.Entites;

import com.story.Interface.ALive;

public class humanGruop extends Entity implements ALive {
        protected humanGruop(final String name, final State state){
                super(name,state);
        }
        @Override
        public void say(String toWho, String phrase){
                System.out.println(this.name+" говорят "+toWho+" "+phrase);
        }
        public void watch(){
                System.out.println(this.name+" смотрят со стороны");
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
