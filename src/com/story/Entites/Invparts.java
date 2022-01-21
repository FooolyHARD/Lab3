package com.story.Entites;

public class Invparts{
    public Part chapter;
    public Invparts(Part chapter){
          this.chapter = chapter;
     }
     public void start(Part part){
        this.chapter = part;
        System.out.println("Начинается "+chapter.parts);
     }
}
