package com.story;

public class lupa implements NotALive{
    public String lol;
    public lupa(String lol){
        this.lol = lol;
    }
    @Override
    public void exist(){
        System.out.println("анекдот: Пупа и Лупа пришли в парфюмерную. Им выдали пробники духов, но у Лупы был заложен нос, поэтому Пупа.........");
    }

}
