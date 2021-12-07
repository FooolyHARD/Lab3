//Policements.java
package com.story;

public class Policements extends humanGruop{
    Cat cat = new Cat("Кот", State.ALIVE);
    public Policements(String name, State state){
        super(name, state);
    }
    public void startInv(int number){
        switch (number){
            case 0: System.out.println(this.name+" начали первый этап расследования");
                break;
            case 1: System.out.println(this.name+" продолжают расследование");
                break;
            case 2: System.out.println(this.name+" ОПЯТЬ ПРОДОЛЖАЮТ РАССЛЕДОВАНИЕ (сколько можно то уже)");
                break;
        }
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
    public String tryToFind(String thing, String place){
        System.out.println(this.name+" обыскивают "+place+" пытаясь найти "+thing);
        final double max = 2.;
        if (((Math.random()))<=0.5){
            return "Найдено";
        } else {
            return "Не найдено";
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
