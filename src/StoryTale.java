/*
Читатель Сарданапал. Сообщенные читателями сведения оказались весьма ценными для полиции,
которая тут же приняла ряд необходимых мер. Во-первых, был арестован
банковский кассир, и, хотя он клялся, что денег не похищал, полицейский комиссар Пшигль сказал,
что оставит его под стражей, пока не отыщутся деньги. Во-вторых, были обшарены все палисадники и дворы
по пути следования грабителей, но чемодан, как и следовало ожидать, обнаружен не был. В-третьих, двор
дома No 47 по Кривой улице был весь изрыт полицейскими. Результат оказался следующий:
1) чемодан найден не был; 2) был найден один дохлый кот; 3) от смещения почвы рухнула стена дома.
 */
//StoryTale.java

import com.story.*;


public class StoryTale{
    public static void main(String[] args){
        NotALive pupa = new lupa("lol");
        pupa.exist();
        String Cops = new String("Менты");
        String Bankers = new String("Банковский кассир");
        String House = new String("Дом №47 по кривой улице");
        String bagnon = new String("Чемодан");
        Story coolstory = new Story("Кулстори");
        Readers readers = new Readers("Читатели",State.ACTIVE);
        Policements policements = new Policements(Cops, State.ACTIVE);
        Bankir bankir = null;
        final double max = 2.;
        if (((Math.random()))>0.5){
            bankir = new Bankir(Bankers, State.ACTIVE);
        } else {
            bankir = new Bankir(Bankers, State.GUILTY);
        }
        //Bankir bankir = new Bankir("Банковский кассир", State.GUILTY);
        Cat cat = new Cat("Кот", State.DEAD);
        Bag bag = new Bag(bagnon, State.DIDNTFIND);
        House house = new House(House, State.STAY);
        Invparts part = new Invparts(null);
        coolstory.start();
        readers.say(Cops, "Очень важные сведения");
        part.start(Part.FIRST);
        readers.watch();
        policements.catchs(Bankers);
        bankir.say(Cops, "Нет, это не я!");
        policements.bonk(Bankers);
        if (bankir.getState()==State.GUILTY){
            bankir.say(Cops, "Ладно...Вы меня раскусили");
            policements.take(Bankers);
            policements.win();
            coolstory.end();
        } else {
            policements.arrest(Bankers, bagnon+" не найден");
            part.start(Part.SECOND);
            policements.tryToFind(bagnon, "Дворы и пaлисадники");
            part.start(Part.THERD);
            //policements.tryToFind("Чемодан", "Дом №47 по кривой улице");
            if ((policements.tryToFind(bagnon, House)) == "Найдено") {
                bag.setState(State.FIND);
                policements.win();
                coolstory.end();
            } else {
                cat.exist();
                coolstory.result();
                house.setState(State.FALL);
                house.fall();
                policements.lose();
                coolstory.end();
            }
        }
    }
}