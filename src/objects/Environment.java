package objects;
import enums.Prepositions;
public class Environment extends GeneralObj{
    public Environment(String name) {
        super(name);
    }
    public void opened(Prepositions prep,String addit,GeneralObj obj){
        System.out.println(this.getName() + " открыл" + prep.getValue() + " природе " + addit + obj);
    }
}
