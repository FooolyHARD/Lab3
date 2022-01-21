//Policements.java
package com.story.Entites;
import com.story.Exceptions.CarNotFoundException;
import java.lang.IllegalArgumentException;

public class Policements extends humanGruop{
    Cat cat = new Cat("Кот", State.ALIVE);
    public Policements(String name, State state){
        super(name, state);
    }
    public void catchs(String catched){
        System.out.println(this.name+" поймали "+catched);
    }
    public void take(String prestupnik){
        System.out.println(this.name+" арестовывают и берут под стражу чертового "+prestupnik);
    }
    public void arrest(String suspectedname, String reason){
        System.out.println(suspectedname+" отправляется в СИЗО, туда его отправли "+this.name+", НО "+reason);
    }
    public String tryToFind(String thing, String place) throws IllegalArgumentException {
        System.out.println(this.name + " обыскивают " + place + " пытаясь найти " + thing);
        final double max = 2.;
        if (((Math.random())) <= 0.5) {
            return "Найдено";
        } else {
            return "Не найдено";
        }
    }
    public String tryToFindCar(Auto auto,String place) throws CarNotFoundException{
        if (auto.state == State.FIND){
            return "Приоисхоит агрессивный поиск машины";
        } else {
            throw new CarNotFoundException("А машина то не найдена");
        }
    }
    public void win(){
        System.out.println(this.name+" победили! Чемодан найден, вор козел посажен");
    }
    public void lose(){
        System.out.println(this.name+" лохи, чемодан не найден");
    }
    public void bonk(String targname){
        System.out.println("*"+this.name+" проводят профилактический bonk по "+targname+" в целях узнавания правды"+"*");
    }

}
