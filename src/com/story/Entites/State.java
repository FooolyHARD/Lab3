package com.story.Entites;

public enum State {
    ACTIVE(null),
    STAY("Стоит ровно"),
    DEAD("Помер"),
    DIDNTFIND("По прежнему не найден"),
    FIND("Найден!"),
    GUILTY("Я виновен"),
    FALL("Рухнул"),
    ALIVE(null);
    private final String phrase;
    State(final String phrase){
        this.phrase = phrase;
    }
}
