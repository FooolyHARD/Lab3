/*
Деньги спрятаны в автомобильных шинах. Проверьте немедленно. Это обычная уловка бандитов.
Ваш искренний доброжелатель Брехсон.
Было ещё и такое письмо:
Деньги стибрили сами полицейские. Это говорю вам точно.
----------------------------
*/
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

import com.story.Entites.*;
import com.story.Interface.ContainerOfARgs;
import com.story.Interface.NotALive;
import com.story.Exceptions.*;
public class StoryTale{
    static class Robers extends humanGruop{
        public ContainerOfARgs getNameARg(){
            class PersonGetName implements ContainerOfARgs{
                final String name = Robers.this.name;
                @Override
                public String getName(){
                    return this.name;
                }
            }
            return new PersonGetName();
        }
        public Robers(final String name, final State state) {
            super(name, state);
        }
        @Override
        public void watch(){
            System.out.println(this.name+" с ухмылкой смотрят со стороны");
        }
        public void run() {System.out.println(this.name+" бегут со всех ног");}
    }
    public static void main(String[] args){
        Robers robers = new Robers("грабители", State.ACTIVE);
        ContainerOfARgs name = robers.getNameARg();
        NotALive pupa = new lupa("lol");
        Auto auto = new Auto("Автомобиль", State.DIDNTFIND);
        Entity money = new Entity("Валюта", State.DIDNTFIND){
            @Override
            public void setState(State state) {
                this.state = state;
            }
            public void vaporize(){
                this.state = State.DIDNTFIND;
            }
        };
        String Cops = new String("Менты");
        String Bankers = new String("Банковский кассир");
        String House = new String("Дом №47 по кривой улице");
        String bagnon = new String("Чемодан");
        Story coolstory = new Story("Кулстори");
        Readers readers = new Readers("Читатели",State.ACTIVE);
        Policements policements = new Policements(Cops, State.ACTIVE);
        Bankir bankir = null;
        Cat cat = new Cat("Кот", State.DEAD);
        Bag bag = new Bag(bagnon, State.DIDNTFIND);
        com.story.Entites.House house = new House(House, State.STAY);
        Invparts part = new Invparts(null);
        final double max = 2.;
        if (((Math.random()))>0.5){
            bankir = new Bankir(Bankers, State.ACTIVE);
        } else {
            bankir = new Bankir(Bankers, State.GUILTY);
        }

        robers.watch();
        coolstory.start();
        readers.say(Cops, "*Письмо*Деньги спрятаны в автомобильных шинах. Проверьте немедленно. Это обычная уловка бандитов.");
        policements.tryToFind(money.getName(), "везде");
        try {
            policements.tryToFindCar(auto, "Везде");
            policements.tryToFind("Шины", "машина");
        } catch (CarNotFoundException e){
            System.out.println(e.getMessage());
        }
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
                System.out.println(robers.getName()+" унесли все денбги ");
                coolstory.end();
            }

        }
    }
}