import Exceptions.ClimbIvalidException;
import Exceptions.RegretNothingException;
import enums.*;
import objects.*;
import interfaces.*;

public class Main {
    public static void main(String[] args){
        // Одушевленные объекты
        Entity scooperfield = new Entity("Скуперфильд");
        Entity he = new Entity("Он");
        Entity it = new Entity("Это");
        Entity her = new Entity(" её ");
        //Часть тела
        Body hands = new Body(" руки");
        Body back = new Body(" спина");
        Body head = new Body(" голова");
        Body spectacle = new Body(" зрелище");
        //анонимный класс
        Feel fillings = new Feel() {
            @Override
            public void newFillings(Entity obj){
                System.out.println(obj.getName() + " наполнялся чувствами");
            }
        };
        //Неодушевленные объекты
        Inanimate stones = new Inanimate("Камешки");
        Inanimate cylinder = new Inanimate("цилиндр");
        Inanimate headdress = new Inanimate("головной убор ");
        Inanimate paints = new Inanimate("красками");
        Inanimate picture = new Inanimate(" картину");
        Inanimate land = new Inanimate(" землю");
        Inanimate cane = new Inanimate(" тростью");
        //Места(окружение)
        Environment bottom = new Environment(" овраг");
        Environment skys = new Environment("небо");
        Environment fog = new Environment(" туман");
        Environment soil = new Environment(" почва");
        Environment Move = new Environment(" движение ");
        Environment place = new Environment(" место");
        Environment horizont = new Environment("горизонт");
        Environment surface = new Environment(" повехность");
        // создание ходячей части сущности
        Entity.Moving scooperfield1 = scooperfield.new Moving();
        Entity.Moving he1 = he.new Moving();
        // -2 предложение
        he.divein(Prepositions.IN, fog, "с головой ");
        it.strech(Prepositions.INALLSIDES," до самого ",horizont);
        scooperfield.remained("как бы один на один ", Prepositions.WITH,skys);
        //it.filled(spectacle,fillings,"каким-то ");
        //ананонимный класс
        fillings.newFillings(he);

        // -1 предложение
        scooperfield.seemed(",что ");
        //локальный класс
        he.opened(" красоту");
        //обработка ошибки непроверяемая
        try {
            he.regretted(Prepositions.ONLYTHAT,"");
        }
        catch (RegretNothingException exception){
            exception.printStackTrace();
        }
        he.studypaint();
        he.cantpaint(Prepositions.AND,paints,picture);
        // static
        GeneralObj.Tool.forWhat(" унести с собой");
        he.notpart(Prepositions.AND," уже никогда", " с ней ");
        /*
        // 1-предложение
        scooperfield.experienced(" желание ");
        he.hug(skys, Prepositions.ABOVETHEM);
        // 2-предложение
        he.felt("что сможет сделать это, если только");
        scooperfield.stretch(hands);
        // 3-предложение
        he.heldout(hands);
        he.lost(Prepositions.UNDERFEET, soil);
        he.rolled(stones, bottom, Prepositions.IN);
        // 4-предложение
        he.somersaulted(Prepositions.THOUGH, head);
        he.rolleddown(Prepositions.ON, bottom);
        he.layscattering(Prepositions.ONBOTHSIDES,hands);
        // 5-предлложение
        he.rolled(stones,Prepositions.AFTERTHEM);
        he.pound(back, Prepositions.BY);
        // 6-предложение
        it.stopped(Move);
        // 7 -предложение
        he.felling(Prepositions.FROMALLSIDES);
        scooperfield.convincedstarted(Prepositions.AROUND, hands);
        scooperfield.find(cylinder," c головы ");
        // 8-предложение
        he.turnedout(Prepositions.NEARBY, cylinder);
        // 9-предложение
        he.shakingout(stones);
        scooperfield.installed(headdress, Prepositions.ON,place);
        he.startedlooking(Prepositions.ONBOTHSIDES);
        // 10-предложение
        he.wasntvisible(fog, Prepositions.IN);
         */
        // 11-предложение
        scooperfield.feeling(Prepositions.INFRONTOF,land,cane);
        // non static
        scooperfield1.gotthere(" противоположного склона",bottom, Prepositions.BEFORE);
        // обработка ошибки проверяемой
        try {
            scooperfield.climb(Prepositions.BYTHEM," влево");
        }
        catch (ClimbIvalidException exception){
            exception.printStackTrace();
        }
        // 12-предложение
        he.falldown("Несколько раз ");
        he.rolledown("обратно", Prepositions.AND);
        he.managed("наконец",Prepositions.ON,surface);
    }
}