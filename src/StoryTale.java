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
        Story coolstory = new Story("Кулстори");
        Readers readers = new Readers("Читатели",State.ACTIVE);
        Policements policements = new Policements("Менты", State.ACTIVE);
        Bankir bankir = null;
        final double max = 2.;
        if (((Math.random()))>0.5){
            bankir = new Bankir("Банковский кассир", State.ACTIVE);
        } else {
            bankir = new Bankir("Банковский кассир", State.GUILTY);
        }
        //Bankir bankir = new Bankir("Банковский кассир", State.GUILTY);
        Cat cat = new Cat("Кот", State.DEAD);
        Bag bag = new Bag("Чемодан", State.DIDNTFIND);
        House house = new House("Дом №47 по кривой улице", State.STAY);
        coolstory.start();
        readers.say("Ментам", "Очен важные сведения");
        policements.startInv(0);
        readers.watch();
        policements.catchs("Банковский кассир");
        bankir.say("Ментам ", "Нет, это не я!");
        policements.bonk("Банковский кассир");
        if (bankir.getState()==State.GUILTY){
            bankir.say("Ментам ", "Ладно...Вы меня расскусили");
            policements.take("Банковский кассир");
            policements.win();
            coolstory.end();
        } else {
            policements.arrest("Банковский кассир", "Чемодан не найден");
            policements.startInv(1);
            policements.tryToFind("Чемодан", "Дворы и полисадники");
            policements.startInv(2);
            //policements.tryToFind("Чемодан", "Дом №47 по кривой улице");
            if ((policements.tryToFind("Чемодан", "Дом №47 по кривой улице")) == "Найдено") {
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