package objects;

import Exceptions.ClimbIvalidException;
import Exceptions.RegretNothingException;
import enums.Prepositions;
import interfaces.*;

public class Entity extends GeneralObj implements move {
    public Entity(String name){
        super(name);
    }
    public String toString(){
        return "Enity{name=" + this.getName() + "}";
    }
    public void seemed(String addit){
        System.out.println(this.getName() + " казалось" + addit);
    }
    public void divein(Prepositions prep,Environment obj,String addit){
        System.out.println("Погруженный " + addit + prep.getValue() + obj.getName());
    }
    public  void remained(String adiit,Prepositions prep,Environment obj){
        System.out.println(this.getName() + " оставался " + adiit + prep.getValue() + obj.getName());
    }
    public void filled(Body b,Body s,String addit){
        System.out.println(this.getName() + b.getName() + " наполняло " + addit + s.getName());
    }
    public void strech(Prepositions prep,String addit,Environment obj){
        System.out.println("тянулся " + prep.getValue() + addit + obj.getName());
    }
    public void feeling(Prepositions prep,Inanimate obj,Inanimate s){
        System.out.println("Ощупывая " + prep.getValue() + obj.getName() + s.getName());
    }
    public class Moving{
        public void gotthere(String addit,Environment obj,Prepositions prep){
            System.out.println(Entity.this.getName() + " добрался " + prep.getValue() + addit + obj.getName());
        }
    }
    // проверка проверяемого класса
    public void climb(Prepositions prep,String addit) throws ClimbIvalidException{
        if((addit.equals(" вверх"))||(addit.equals(" вниз"))){
            System.out.println("стал карабкаться " + prep.getValue() + addit);
        }
        else{
            throw new  ClimbIvalidException("Карабкаться можно только вверх или вниз");
        }
    }
    public void falldown(String addit){
        System.out.println(addit + this.getName() + " срывался");
    }
    public void rolledown(String addit,Prepositions prep){
        System.out.println(prep.getValue() + " скатывался " + addit);
    }
    public void managed(String addit,Prepositions prep,Environment obj){
        System.out.println(addit + " удалось выбраться " + prep.getValue() + obj.getName());
    }
    //локальный класс
    public void opened(String s){
        class Obg{
            String name;
            public Obg(String beauty){
                this.name = beauty;
            }
            public String getName(){
                return name;
            }
        }
        Obg beauty = new Obg(s);
        System.out.println(this.getName() + " открыл " + beauty.getName());
    }
    // непроверяемый ошибки
    public void regretted(Prepositions prep,String addit) throws RegretNothingException{
        if(!addit.equals("")){
            System.out.println(this.getName() + " жалел " + prep.getValue()+ addit);
        }
        else{
            throw new RegretNothingException("Нельзя жалеть о пустоте");
        }
    }
    public void studypaint(){
        System.out.println("Не учился рисовать");
    }
    public void cantpaint(Prepositions prep, Inanimate paints, Inanimate obj){
        System.out.println(prep.getValue() + " не может изобразить " + paints.getName() + obj.getName());
    }
    public void experienced(String additation){

        System.out.println(this.getName() + " испытывал" + additation);
    }
    public void carry(Prepositions prep){
        System.out.println("унести " + this.getName() + prep.getValue());
    }
    public void notpart(Prepositions prep, String s, String addit){
        System.out.println(prep.getValue() + s + addit + "не расставаться");
    }
    public void hug(GeneralObj obj, Prepositions prep){
        System.out.println("обнять " + prep.getValue() + " " + obj.getName());
    }
    public void felt(String s){
        System.out.println(this.getName() + " чувствовал " + s);
    }

    public void stretch(GeneralObj obj){
        System.out.println("протянет " + obj.getName());
    }

    public void heldout(GeneralObj obj) {
        System.out.println(this.getName() + " протянул " + obj.getName());
    }
    public void lost(Prepositions prep, Environment obj){
        System.out.println("потерял " + prep.getValue() + obj.getName());
    }

    public void rolled(Inanimate stones, Environment obj, Prepositions prep){
        System.out.println("покатился " + prep.getValue() + obj.getName());
    }

    public void somersaulted(Prepositions prep, GeneralObj obj){
        System.out.println("Перекувыркнулся " + prep.getValue() + obj.getName());
    }
    public void rolleddown(Prepositions prep,Environment obj){
        System.out.println(this.getName() + " скатился " +prep.getValue() + obj.getName());
    }

    public void layscattering(Prepositions prep, GeneralObj obj){
        System.out.println("лежал разбросав " + prep.getValue() + obj.getName());
    }
    public void rolled(Inanimate obj, Prepositions prep){
        System.out.println(obj.getName() + " катились " + prep.getValue());
    }

    public void pound(GeneralObj obj,Prepositions prep){
        System.out.println("колотили его " + prep.getValue() + obj.getName());
    }

    public void stopped(Environment obj){
        System.out.println(this.getName() + obj.getName() + "прекратилось");
    }

    public void felling(Prepositions prep){
        System.out.println("Ощупав себя " + prep.getValue());
    }

    public void convincedstarted(Prepositions prep,GeneralObj obj){
        System.out.println(this.getName() + " убедился и принялся шарить" + obj.getName() + prep.getValue());
    }
    public void find(Inanimate obj, String addidation){
        System.out.println("отыскать" + addidation + obj.getName());
    }
    public void turnedout(Prepositions prep,Inanimate act){
        System.out.println(act.getName() + " оказался " + prep.getValue());
    }
    public void shakingout(Inanimate obj){
        System.out.println("Попавшие " + obj.getName());
    }
    public void installed(Inanimate obj,Prepositions prep,Environment act){
        System.out.println(this.getName() + " водворил " + obj.getName() + prep.getValue() + act.getName());
    }
    public void startedlooking(Prepositions prep){
        System.out.println("стал осматриваться " + prep.getValue());
    }
    public void wasntvisible(Environment obj, Prepositions prep){
        System.out.println(prep.getValue() + obj.getName() + " не было ничего видно");
    }
    public Inanimate arms = new Inanimate("руки");

}
