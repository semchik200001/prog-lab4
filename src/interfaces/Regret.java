package interfaces;
import Exceptions.RegretNothingException;
import objects.GeneralObj;
public interface Regret {
    public void regret(GeneralObj obj, String action) throws RegretNothingException;
}

